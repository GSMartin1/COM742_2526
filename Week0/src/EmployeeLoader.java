public class EmployeeLoader {
    public static void main(String[] args) {
        // Step 1: Check if we have enough "instructions"
        if (args.length < 3) {
            System.out.println("Error: Please provide 3 instructions: First Name, Last Name, Role.");
            return; // Stop execution if data is missing
        }

        System.out.println("--- Reading Instructions from OS ---");

        // Step 2: Loop to show "how instructions are read"
        for (int i = 0; i < args.length; i++) {
            System.out.println("Instruction [" + i + "]: " + args[i]);
        }

        System.out.println("------------------------------------");

        // Step 3: Process the instructions (Data Flow)
        String firstName = args[0];
        String lastName = args[1];
        String role = args[2];

        // Step 4: Execution Output
        System.out.println("Processing complete.");
        System.out.println("New Employee Created: " + firstName + " " + lastName + " (" + role + ")");
    }
}