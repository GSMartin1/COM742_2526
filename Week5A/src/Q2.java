public class Q2 {
    public static void main(String[] args) {
        // Stage 1: Success
        int[] coins1 = {50, 20, 10, 5, 2, 1};
        System.out.println("Stage 1 (£87): " + calculateGreedy(coins1, 87));

        // Stage 2: Failure
        int[] coins2 = {25, 20, 10, 5, 1};
        System.out.println("Stage 2 (£40) - Greedy: " + calculateGreedy(coins2, 40));

    }

    public static String calculateGreedy(int[] denominations, int amount) {
        StringBuilder result = new StringBuilder();
        int totalNotes = 0;
        for (int coin : denominations) {
            while (amount >= coin) {
                amount -= coin;
                result.append("£").append(coin).append(" ");
                totalNotes++;
            }
        }
        return result.toString() + "(" + totalNotes + " notes)";
    }
}