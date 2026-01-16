import java.util.InputMismatchException;
import java.util.Scanner;

public class Question7 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int employeeID = 0;
        boolean validID = false;

        // Step 1: Loop until valid Employee ID
        while (!validID) {
            System.out.print("Enter your Employee ID (1-1000): ");
            try {
                employeeID = readEmployeeID(scanner);
                validID = true; // No exception, ID is valid
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        // Step 2: Loop until a valid password is entered
        String password;
        boolean validPassword;
        do {
            System.out.print("Enter your Password: ");
            password = scanner.nextLine();

            validPassword = isValidPassword(password);

            if (!validPassword) {
                System.out.println("Password is invalid. It must be at least 8 characters, "
                        + "contain at least one digit and one special character.");
            }

        } while (!validPassword);

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

        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                hasDigit = true;
            } else if (!Character.isLetterOrDigit(c)) { // special character
                hasSpecialChar = true;
            }
        }

        return hasDigit && hasSpecialChar;
    }

    // Method to read and validate Employee ID
    public static int readEmployeeID(Scanner scanner) throws Exception {
        int id;
        try {
            id = scanner.nextInt();
        } catch (InputMismatchException e) {
            scanner.nextLine(); // clear invalid input
            throw new Exception("Employee ID must be an integer.");
        }

        if (id <= 0 || id > 1000) {
            throw new Exception("Employee ID must be positive and between 1 and 1000.");
        }

        scanner.nextLine(); // consume leftover newline
        return id;
    }
}
