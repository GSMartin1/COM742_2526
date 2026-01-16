import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Create the List
        ArrayList<Employee> companyDirectory = new ArrayList<>();
        String choice = "y";

        // Valid IDs
        int id = 0;
        String pass = "";

        // 2. Loop to add employees
        while (choice.equalsIgnoreCase("y")) {
            Employee newEmp = new Employee();
            Boolean isValid = false;
            do {
                try {
                    System.out.print("Enter ID for new Employee: ");
                    id = scanner.nextInt();
                    newEmp.setEmployeeID(id);

                    if (newEmp.getEmployeeID() != 0) {
                        isValid = true;
                    }
                } catch (Exception e) {
                    System.out.println("ID Not Valid! Numbers only!");
                    scanner.nextLine();
                }
            } while (!isValid);

            scanner.nextLine(); // consume newline

            boolean validPassword = false;
            do {
                System.out.print("Enter Password: ");
                pass = scanner.nextLine();
                validPassword = newEmp.setPassword(pass);

            } while (!validPassword);

            companyDirectory.add(newEmp);
            System.out.println("Employee added to directory.");

            System.out.print("Add another? (y/n): ");
            choice = scanner.nextLine();
        }

        // 3. Print the Directory
        System.out.println("--- Company Directory ---");
        for (Employee e : companyDirectory) {
            System.out.println("Employee ID: " + e.getEmployeeID() + " Password: " + e.getPasswordHash());
        }

        saveToFile(companyDirectory);

    }
        public static void saveToFile(ArrayList<Employee> list) {
            System.out.println("Saving database...");

            try {
                // 'false' means we overwrite the file every time we run
                FileWriter writer = new FileWriter("employee_data.txt", false);

                for (Employee e : list) {
                    // Construct the CSV string: "101,MyPass@1"
                    String record = e.getEmployeeID() + "," + e.getPasswordHash() + "\n";
                    writer.write(record);
                }

                writer.close(); // IMPORTANT: Keeps the file safe
                System.out.println("Data saved successfully!");

            } catch (IOException e) {
                System.out.println("Critical Error: Could not write to disk.");
                e.printStackTrace();
            }
    }
}

