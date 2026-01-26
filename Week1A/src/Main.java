import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // PILLAR 3: POLYMORPHISM
        // We create a List of "Vehicles".
        // The list doesn't care if it's a Car or a Bike, it treats them all as "Vehicle".
        List<Vehicle> fleet = new ArrayList<>();

        fleet.add(new Car("Ford Mustang"));
        fleet.add(new ElectricBike());
        fleet.add(new Car("Ford Fiesta"));

        System.out.println("--- Starting Fleet ---");

        // We iterate through the generic "Vehicle" type.
        // Java automatically knows which specific "start()" method to run.
        for (Vehicle v : fleet) {
            v.start();
        }
    }
}

// PILLAR 4: ABSTRACTION
// We define a contract (Interface). Any "Vehicle" MUST have a start method.
// We don't care HOW it starts, only THAT it starts.
interface Vehicle {
    void start();
}

// PILLAR 2: INHERITANCE
// Car "is a" Vehicle. It implements the contract.
class Car implements Vehicle {

    // PILLAR 1: ENCAPSULATION
    // Data is private. Only the object itself can change it.
    private String model;

    public Car(String model) {
        this.model = model;
    }

    @Override
    public void start() {
        System.out.println(model + " engine is roaring!");
    }
}

class ElectricBike implements Vehicle {
    @Override
    public void start() {
        System.out.println("E-Bike is humming silently.");
    }
}
