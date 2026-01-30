import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Question5 {
    public static void main(String[] args) {
        int validSum = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader("mixed_data.txt"))) {
            String line;

            while ((line = reader.readLine()) != null) {
                try {
                    //This line might crash if data is "ERROR_404"
                    int number = Integer.parseInt(line);
                    validSum += number;
                } catch (NumberFormatException e) {
                    //We catch the crash and keep going
                    System.out.println("Skipping invalid data: " + line);
                }
            }

        } catch (IOException e) {
            System.out.println("File missing: mixed_data.txt");
        }

        System.out.println("Final Valid Sum: " + validSum);
    }
}