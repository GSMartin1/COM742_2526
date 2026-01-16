public class Employee {
    // 1. Private Data (Hidden)
    private int employeeID;
    private String password;

    // 2. Getters (Public access)
    public int getEmployeeID() {
        return employeeID;
    }

    // Expose ONLY the hash
    public int getPasswordHash() {
        return password.hashCode();
    }

    // 3. Setters (The "Gatekeepers" with Logic)
    public void setEmployeeID(int id) {
        if (id > 0 && id <= 1000) {
            this.employeeID = id;
            System.out.println("ID set to: " + id);
        } else {
            System.out.println("Error: ID must be between 1-1000");
        }
    }

    public boolean setPassword(String pass) {
        // We moved your validation logic INSIDE the class!
        boolean hasDigit = false;
        boolean hasSpecial = false;

        if (pass.length() >= 8) {
            for (char c : pass.toCharArray()) {
                if (Character.isDigit(c)) hasDigit = true;
                else if (!Character.isLetterOrDigit(c)) hasSpecial = true;
            }
        }

        if (hasDigit && hasSpecial) {
            this.password = pass;
            System.out.println("Password accepted.");
            return true;
        } else {
            System.out.println("Error: Password too weak.");
            return false;
        }
    }
}
