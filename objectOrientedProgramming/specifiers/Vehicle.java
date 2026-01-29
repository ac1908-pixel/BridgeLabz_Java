package objectOrientedProgramming.specifiers;

/*
 * Vehicle class demonstrates:
 * - static variables and methods
 * - use of this keyword
 * - final variable
 * - instanceof operator
 */
public class Vehicle {

    // Static variable shared by all Vehicle objects
    static double registrationFee = 5000.0;

    // Instance variables
    String ownerName;
    String vehicleType;

    // Final variable (cannot be changed once assigned)
    final String registrationNumber;

    /*
     * Constructor
     * Uses 'this' keyword to initialize instance variables
     */
    Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    /*
     * Static method to update registration fee
     */
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
        System.out.println("Updated Registration Fee: " + registrationFee);
    }

    /*
     * Method to display vehicle registration details
     * Uses instanceof to validate object type
     */
    public void displayVehicleDetails(Object obj) {
        if (obj instanceof Vehicle) {
            Vehicle vehicle = (Vehicle) obj;
            System.out.println("Owner Name        : " + vehicle.ownerName);
            System.out.println("Vehicle Type      : " + vehicle.vehicleType);
            System.out.println("Registration No   : " + vehicle.registrationNumber);
            System.out.println("Registration Fee  : " + registrationFee);
        } else {
            System.out.println("Invalid object. Not a Vehicle instance.");
        }
    }

    public static void main(String[] args) {

        // Update registration fee
        Vehicle.updateRegistrationFee(6500.0);
        System.out.println();

        // Create Vehicle objects
        Vehicle v1 = new Vehicle("Alok", "Car", "KA01AB1234");
        Vehicle v2 = new Vehicle("Rahul", "Bike", "KA02CD5678");

        // Display vehicle details
        v1.displayVehicleDetails(v1);
        System.out.println();

        v2.displayVehicleDetails(v2);
    }
}
