package objectOrientedProgramming.inheritance;

class Vehicle {
    String model;
    int maxSpeed;

    // Constructor
    Vehicle(String model, int maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    void displayDetails() {
        System.out.println("Model: " + model);
        System.out.println("Max Speed: " + maxSpeed + " km/h");
    }
}

interface Refuelable {
    void refuel();
}

class ElectricVehicle extends Vehicle {

    ElectricVehicle(String model, int maxSpeed) {
        super(model, maxSpeed);
    }

    void charge() {
        System.out.println("Electric vehicle is charging.");
    }
}

class PetrolVehicle extends Vehicle implements Refuelable {

    PetrolVehicle(String model, int maxSpeed) {
        super(model, maxSpeed);
    }

    @Override
    public void refuel() {
        System.out.println("Petrol vehicle is being refueled.");
    }
}

public class VehicleTest {
    public static void main(String[] args) {

        ElectricVehicle ev = new ElectricVehicle("Tesla Model 3", 225);
        PetrolVehicle pv = new PetrolVehicle("Honda City", 190);

        System.out.println("---- Electric Vehicle ----");
        ev.displayDetails();
        ev.charge();

        System.out.println("\n---- Petrol Vehicle ----");
        pv.displayDetails();
        pv.refuel();
    }
}

