package objectOrientedProgramming.specifiers;

/*
 * Employee class demonstrates:
 * - static variables and methods
 * - use of this keyword
 * - final variable
 * - instanceof operator
 */
public class Employee {

    // Static variable shared by all Employee objects
    static String companyName = "BridgeLabz Technologies";
    static int totalEmployees = 0;

    // Instance variables
    String name;
    String designation;

    // Final variable (cannot be changed once assigned)
    final int id;

    /*
     * Constructor
     * Uses 'this' keyword to initialize instance variables
     * Increments total employee count
     */
    Employee(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;
    }

    /*
     * Static method to display total number of employees
     */
    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    /*
     * Method to display employee details
     * Uses instanceof to verify object type
     */
    public void displayEmployeeDetails(Object obj) {
        if (obj instanceof Employee) {
            Employee emp = (Employee) obj;
            System.out.println("Employee Name  : " + emp.name);
            System.out.println("Employee ID    : " + emp.id);
            System.out.println("Designation    : " + emp.designation);
            System.out.println("Company Name   : " + companyName);
        } else {
            System.out.println("Invalid object. Not an Employee instance.");
        }
    }

    public static void main(String[] args) {

        // Create Employee objects
        Employee emp1 = new Employee("Alok", 101, "Software Engineer");
        Employee emp2 = new Employee("Rahul", 102, "Backend Developer");

        // Display employee details
        emp1.displayEmployeeDetails(emp1);
        System.out.println();

        emp2.displayEmployeeDetails(emp2);
        System.out.println();

        // Display total number of employees
        Employee.displayTotalEmployees();
    }
}
