import java.util.Scanner;

public class Question6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Step 1: Ask for Employee ID (integer only)
        System.out.print("Enter your Employee ID (numbers only): ");
        int employeeID = scanner.nextInt();
        scanner.nextLine(); // consume the leftover newline

        String password;
        boolean valid;

        // Step 2: Loop until a valid password is entered
        do {
            System.out.print("Enter your Password: ");
            password = scanner.nextLine();

            valid = isValidPassword(password);

            if (!valid) {
                System.out.println("Password is invalid. It must be at least 8 characters, "
                        + "contain at least one digit and one special character.");
            }

        } while (!valid);

        // Step 3: Success message
        System.out.println("Password is valid. Welcome, Employee " + employeeID + "!");

        scanner.close();
    }

    // Method to check password requirements
    public static boolean isValidPassword(String password) {
        if (password.length() < 8) {
            return false; // Too short
        }

        boolean hasDigit = false;
        boolean hasSpecialChar = false;

        // Check each character
        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                hasDigit = true;
            } else if (!Character.isLetterOrDigit(c)) { // special character
                hasSpecialChar = true;
            }
        }

        return hasDigit && hasSpecialChar;
    }
}
