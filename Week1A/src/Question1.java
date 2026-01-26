import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Question1 {
    public static void main(String[] args) {
        // 1. Create a list of 50 random integers
        List<Integer> numbers = new ArrayList<>();
        Random rand = new Random();

        for (int i = 0; i < 50; i++) {
            numbers.add(rand.nextInt(100) + 1); // Random 1-100
        }

        System.out.println("Numbers: " + numbers);

        // 2. Stream API: Filter evens, map to int, sum
        int sumOfEvens = numbers.stream()
                .filter(n -> n % 2 == 0)      // Keep only even numbers
                .mapToInt(Integer::intValue)  // Convert Stream<Integer> to IntStream
                .sum();                       // Calculate sum

        System.out.println("Sum of Even Numbers: " + sumOfEvens);
    }
}
