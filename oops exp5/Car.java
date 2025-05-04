// Vehicle.java
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

// Car.java
public class Car extends Vehicle {
    public Car(String make, String model) {
        super(make, model);
    }

    @Override
    public void startEngine() {
        System.out.println("Car engine starting");
    }

    @Override
    public void stopEngine() {
        System.out.println("Car engine stopping");
    }

    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Camry");
        myCar.startEngine();
        myCar.stopEngine();
        myCar.serviceInfo();
    }
}