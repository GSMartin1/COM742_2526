import java.util.LinkedHashMap;
import java.util.Map;

public class Question8 {
    public static void main(String[] args) {
        System.out.println("1994 = " + toRoman(1994)); // MCMXCIV
        System.out.println("2024 = " + toRoman(2024)); // MMXXIV
    }

    public static String toRoman(int num) {
        // LinkedHashMap maintains insertion order
        Map<Integer, String> map = new LinkedHashMap<>();
        map.put(1000, "M");
        map.put(900, "CM");
        map.put(500, "D");
        map.put(400, "CD");
        map.put(100, "C");
        map.put(90, "XC");
        map.put(50, "L");
        map.put(40, "XL");
        map.put(10, "X");
        map.put(9, "IX");
        map.put(5, "V");
        map.put(4, "IV");
        map.put(1, "I");

        StringBuilder result = new StringBuilder();

        // Iterate through the map
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            int value = entry.getKey();
            String symbol = entry.getValue();

            // While number is bigger than the value (e.g. 2500 >= 1000)
            while (num >= value) {
                result.append(symbol); // Add "M"
                num -= value;          // Reduce number
            }
        }
        return result.toString();
    }
}