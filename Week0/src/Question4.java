import java.util.Random;
import java.util.Scanner;

public class Question4 {
    public static void main(String[] args){
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        String[] students = new String[]{"Alice", "Bob", "Charlie", "Dylan", "Esther"};

        int randomStudent = random.nextInt(students.length);

        char randomInitial = students[randomStudent].charAt(0);

        char usersGuess;

        do{
            System.out.println("Enter an initial");
            usersGuess = scanner.nextLine().toUpperCase().charAt(0);

            if (usersGuess != randomInitial) {
                System.out.println("False");
            }
        }while(usersGuess != randomInitial);

        System.out.print("True");

//        for( String student : students){
//            System.out.println(student);
//        }
    }
}
