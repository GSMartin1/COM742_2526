public class Question2 {
    public static void main(String[] args) {
        // PrimeChecker p = new PrimeChecker(); // This throws an error!

        // We get the single global instance
        PrimeChecker checker = PrimeChecker.getInstance();

        System.out.println("Is 17 prime? " + checker.isPrime(17));
        System.out.println("Is 20 prime? " + checker.isPrime(20));
    }
}

class PrimeChecker {
    // 1. Private static instance
    private static PrimeChecker instance = new PrimeChecker();

    // 2. Private constructor (prevents "new PrimeChecker()")
    private PrimeChecker() {}

    // 3. Public static access method
    public static PrimeChecker getInstance() {
        return instance;
    }

    public boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}