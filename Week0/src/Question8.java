public class Question8 {

    public static void main(String[] args) {

        Employee employee = new Employee();

        employee.setEmployeeID(123);
        employee.setPassword("Apples123!");

        System.out.println(employee.getEmployeeID());
        System.out.println(employee.getPasswordHash());

    }
}

