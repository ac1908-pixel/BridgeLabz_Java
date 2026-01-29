package objectOrientedProgramming.specifiers;

/*
 * Patient class demonstrates:
 * - static variables and methods
 * - use of this keyword
 * - final variable
 * - instanceof operator
 */
public class Patient {

    // Static variable shared across all Patient objects
    static String hospitalName = "BridgeLabz General Hospital";
    static int totalPatients = 0;

    // Instance variables
    String name;
    int age;
    String ailment;

    // Final variable (unique patient identifier)
    final int patientID;

    /*
     * Constructor
     * Uses 'this' keyword to initialize instance variables
     * Increments total patients count
     */
    Patient(String name, int age, String ailment, int patientID) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;
        totalPatients++;
    }

    /*
     * Static method to return total number of patients
     */
    public static int getTotalPatients() {
        return totalPatients;
    }

    /*
     * Method to display patient details
     * Uses instanceof to validate object type
     */
    public void displayPatientDetails(Object obj) {
        if (obj instanceof Patient) {
            Patient patient = (Patient) obj;
            System.out.println("Patient Name   : " + patient.name);
            System.out.println("Patient ID     : " + patient.patientID);
            System.out.println("Age            : " + patient.age);
            System.out.println("Ailment        : " + patient.ailment);
            System.out.println("Hospital Name  : " + hospitalName);
        } else {
            System.out.println("Invalid object. Not a Patient instance.");
        }
    }

    public static void main(String[] args) {

        // Create Patient objects
        Patient p1 = new Patient("Sita", 28, "Fever", 201);
        Patient p2 = new Patient("Ram", 35, "Fracture", 202);

        // Display patient details
        p1.displayPatientDetails(p1);
        System.out.println();

        p2.displayPatientDetails(p2);
        System.out.println();

        // Display total number of patients
        System.out.println("Total Patients Admitted: " + Patient.getTotalPatients());
    }
}

