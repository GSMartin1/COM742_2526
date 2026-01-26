import java.util.Scanner;

// The Strategy Interface
interface TemperatureStrategy {
    double convert(double temp);
}

// Strategy A
class CelsiusToFahrenheit implements TemperatureStrategy {
    public double convert(double temp) { return (temp * 9/5) + 32; }
}

// Strategy B
class FahrenheitToCelsius implements TemperatureStrategy {
    public double convert(double temp) { return (temp - 32) * 5/9; }
}

// Strategy C
class CelsiusToKelvin implements TemperatureStrategy {
    public double convert(double temp) {
        return temp + 273.15;
    }
}


public class Question4{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.println("3. Celsius to Kelvin ");
        int choice = scanner.nextInt();

        System.out.print("Enter Temperature: ");
        double inputTemp = scanner.nextDouble();

        // The Context Variable (Interface type)
        TemperatureStrategy strategy;

        if (choice == 1) {
            strategy = new CelsiusToFahrenheit();
        } else if (choice == 2) {
            strategy = new FahrenheitToCelsius();
        } else {
            strategy = new CelsiusToKelvin();
        }

        // Execute the strategy (Polymorphism)
        double result = strategy.convert(inputTemp);
        System.out.printf("Result: %.2f\n", result);
    }
}