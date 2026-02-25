public class Q1 {
    public static void main(String[] args) throws InterruptedException {
        // Stage 1: The Padlock (2-Digits)
        System.out.println("Cracking Stage 1...");
        for (int i = 0; i <= 99; i++) {
            int d1 = i / 10;
            int d2 = i % 10;
            if (d1 + d2 == 9 && i % 2 == 0) {
                System.out.printf("Found Stage 1 PIN: %02d\n", i);
                break;
            }
        }

        // Stage 2: The Server Room (3-Digits) [
        System.out.println("\nCracking Stage 2...");
        for (int i = 0; i <= 999; i++) {
            int d1 = i / 100;
            int d2 = (i / 10) % 10;
            int d3 = i % 10;
            if (d1 + d2 + d3 == 14 && d1 == d3 * 2) {
                System.out.printf("Found Stage 2 PIN: %03d\n", i);
            }
        }

        // Stage 3: The Main Vault (5-Digits)
        System.out.println("\nCracking Stage 3");
        for (int i = 0; i <= 99999; i++) {
            String s = String.format("%05d", i);
            int sum = 0;
            boolean hasFive = false;

            for (char c : s.toCharArray()) {
                int digit = Character.getNumericValue(c);
                sum += digit;
                if (digit == 5) hasFive = true;
            }

            if (i % 10 == 7 && sum == 32 && hasFive) {
                Thread.sleep(1); // Simulate physical padlock delay
                System.out.printf("Found Stage 3 PIN: %05d\n", i);
            }
        }
    }
}