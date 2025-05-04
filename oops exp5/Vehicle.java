// Abstract class Vehicle
public abstract class Vehicle {
    protected String make;
    protected String model;

    public Vehicle(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public abstract void startEngine();
    public abstract void stopEngine();

    public void serviceInfo() {
        System.out.println("Basic servicing instructions for " + make + " " + model + ":");
        System.out.println("1. Check engine oil level.");
        System.out.println("2. Inspect tire pressure.");
        System.out.println("3. Replace air filter as needed.");
    }
}

// Concrete class Car extending Vehicle
class Car extends Vehicle {
    public Car(String make, String model) {
        super(make, model);
    }

    @Override
    public void startEngine() {
        System.out.println("Starting the engine of " + make + " " + model + ".");
    }

    @Override
    public void stopEngine() {
        System.out.println("Stopping the engine of " + make + " " + model + ".");
    }
}

// Main class with the main function
public class Main {
    public static void main(String[] args) {
        System.out.println("=== Vehicle Management System ===\n");

        // Instantiate a Car object
        Car myCar = new Car("Toyota", "Camry");

        // Call all available methods
        myCar.startEngine();
        myCar.serviceInfo();
        myCar.stopEngine();

        System.out.println("\n=== Program Execution Completed ===");
    }
}
