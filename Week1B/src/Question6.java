import java.io.*;
import java.util.*;

public class Question6 {
    public static void main(String[] args) {
        // 1. Set up the Data Structures
        Map<String, Integer> wordCounts = new HashMap<>();
        Set<String> stopWords = new HashSet<>(Arrays.asList(
                "the", "and", "to", "of", "a", "in", "is", "it", "you", "that", "he", "was", "for", "on", "are", "i", "his","my","have","as",
                "with","had","which","at","but","not","me","be","we","there","from","this","said"
        ));

        System.out.println("Analysing book.txt");

        // 2. Read and process
        try (BufferedReader reader = new BufferedReader(new FileReader("Sherlock Holmes.txt"))) {
            String line;

            while ((line = reader.readLine()) != null) {
                // Split line into words
                String[] words = line.split(" ");

                for (String word : words) {
                    // Clean: convert to lowercase + remove punctuation (keep only letters)
                    String cleanWord = word.toLowerCase().replaceAll("[^a-z]", "");

                    // Filter: Skip empty strings and stop words
                    if (!cleanWord.isEmpty() && !stopWords.contains(cleanWord)) {

                        // 3. Analyse (Update Map)
                        if (wordCounts.containsKey(cleanWord)) {
                            int currentCount = wordCounts.get(cleanWord);
                            wordCounts.put(cleanWord, currentCount + 1);
                        } else {
                            wordCounts.put(cleanWord, 1);
                        }
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Error: Could not find book.");
            return;
        }

        // 4. Output: (Write to file)
        writeReport(wordCounts);
    }

    public static void writeReport(Map<String, Integer> map) {
        int totalWords = 0;
        int uniqueWords = map.size();
        String mostFreqWord = "";
        int highestFreq = 0;

        // Calculate stats
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            int count = entry.getValue();
            totalWords += count;

            if (count > highestFreq) {
                highestFreq = count;
                mostFreqWord = entry.getKey();
            }
        }

        // Write to File
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("analysis_report.txt"))) {
            writer.write("ANALYSIS REPORT");
            writer.newLine();
            writer.write("Total Significant Words: " + totalWords);
            writer.newLine();
            writer.write("Unique Vocabulary Size: " + uniqueWords);
            writer.newLine();
            writer.write("Most Frequent Word: '" + mostFreqWord + "' (used " + highestFreq + " times)");

            System.out.println("Report generated: analysis_report.txt");

        } catch (IOException e) {
            System.out.println("Could not write report.");
        }
    }
}