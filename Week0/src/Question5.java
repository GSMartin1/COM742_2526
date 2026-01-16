public class Question5 {
    public static void main(String[] args) {

        // Call method with role
        double juniorPay = calculateGrossPay(15.50, 45, "junior");
        double seniorPay = calculateGrossPay(25.00, 50, "senior");

        System.out.println("Junior Weekly Pay: £" + String.format("%.2f", juniorPay));
        System.out.println("Senior Weekly Pay: £" + String.format("%.2f", seniorPay));
    }

    // Method accepts role as a parameter
    public static double calculateGrossPay(double hourlyRate, int hoursWorked, String role) {
        double regularHours = 40;
        double overtimeHours = hoursWorked - 40;

        double overtimeRate = 1.0;

        // Determine overtime rate based on role
        if (role.equalsIgnoreCase("junior")) {
            overtimeRate = 1.5;
        } else if (role.equalsIgnoreCase("senior")) {
            overtimeRate = 2.0;
        }

        return (regularHours * hourlyRate) + (overtimeHours * hourlyRate * overtimeRate);
    }
}
