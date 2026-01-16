import java.util.Scanner;

public class Question1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello please enter your first initial");
        String initial = scanner.nextLine();

        System.out.println("Hello please enter your last name");
        String lastName = scanner.nextLine();

        System.out.println("Hello please enter your job role");
        String jobRole = scanner.nextLine();
        

        System.out.println("Name: " + initial + " " + lastName + "\n" + "Job role: " + jobRole);


    }
}
