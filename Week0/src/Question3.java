import java.text.DecimalFormat;
import java.util.Scanner;

public class Question3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("£#,##0.00");

        System.out.println("Price of item");
        double price = scanner.nextDouble();

        System.out.println("Quantity of item");
        int quantity = scanner.nextInt();

        // discount per item
        if(quantity >= 50){
            price*=0.95;
        }
        else if(quantity >= 40){
            price*=0.96;
        }
        else if(quantity >= 30){
            price*=0.97;
        }
        else if(quantity >= 20){
            price*=0.98;
        }
        else if(quantity >= 10){
            price*=0.99;
        }

//         //discount per item
//        if(quantity >= 10 && quantity < 20){
//            price*=0.99;
//        }
//        else if(quantity >= 20 && quantity < 30){
//            price*=0.98;
//        }
//        else if(quantity >= 30 && quantity < 40){
//            price*=0.97;
//        }
//        else if(quantity >= 40 && quantity < 50){
//            price*=0.96;
//        }
//        else if(quantity >= 50){
//            price*=0.95;
//        }

        double total = (price * quantity);
        // Add 20% tax
        total += (total*0.2);

        System.out.println("Total: " + df.format(total));

    }
}
