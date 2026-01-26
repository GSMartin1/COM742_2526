public class Question5 {
    public static void main(String[] args) {
        System.out.println("Eevee: " + isPalindrome("Eevee"));
        System.out.println("Girafarig: " + isPalindrome("Girafarig"));
        System.out.println("Farigiraf: " + isPalindrome("Farigiraf"));
        System.out.println("Alomomola: " + isPalindrome("Alomomola"));
    }

    public static boolean isPalindrome(String s) {
        // Normalize: remove spaces and lowercase
        s = s.toLowerCase().trim();

        // Base Case 1: 0 or 1 character is always a palindrome
        if (s.length() <= 1) return true;

        // Base Case 2: First and last mismatch
        if (s.charAt(0) != s.charAt(s.length() - 1)) return false;

        // Recursive Step: Chop off first and last char, and check the middle
        String middle = s.substring(1, s.length() - 1);
        return isPalindrome(middle);
    }
}
