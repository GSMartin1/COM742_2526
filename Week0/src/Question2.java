import java.text.DecimalFormat;
import java.util.Scanner;
public class Question2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("£#,##0.00");

        System.out.println("Price of item");
        float price = scanner.nextFloat();

        System.out.println("Quantity of item");
        int quantity = scanner.nextInt();

        float total = (price * quantity);
        // Add 20% tax
        total += (total*0.2);

        System.out.println("Total: " + df.format(total));
        
    }
}
