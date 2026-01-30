package objectOrientedProgramming.objectModelling;

import java.util.ArrayList;

/*
 * Employee class
 * --------------
 * Represents an Employee.
 * An Employee cannot exist without a Department.
 * This supports the concept of composition.
 */
class Employee {

    private String name;
    private int id;

    /*
     * Constructor to initialize employee details
     */
    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    /*
     * Method to display employee details
     */
    public void displayEmployee() {
        System.out.println("Employee ID: " + id + ", Name: " + name);
    }
}

/*
 * Department class
 * ----------------
 * Represents a Department in a Company.
 * A Department cannot exist without a Company.
 * It strongly owns Employee objects.
 */
class Department {

    private String departmentName;
    private ArrayList<Employee> employees;

    /*
     * Constructor to initialize department name
     */
    public Department(String departmentName) {
        this.departmentName = departmentName;
        this.employees = new ArrayList<>();
    }

    /*
     * Method to add an employee to the department
     */
    public void addEmployee(String name, int id) {
        employees.add(new Employee(name, id));
    }

    /*
     * Method to display all employees in the department
     */
    public void displayEmployees() {
        System.out.println("Department: " + departmentName);

        // Loop through employees and display details
        for (Employee emp : employees) {
            emp.displayEmployee();
        }
    }

    /*
     * Method to delete all employees
     */
    public void deleteDepartment() {
        employees.clear();
    }
}

/*
 * Company class
 * -------------
 * Represents a Company.
 * A Company strongly owns Department objects.
 * Deleting a Company deletes all Departments and Employees.
 */
class Company {

    private String companyName;
    private ArrayList<Department> departments;

    /*
     * Constructor to initialize company name
     */
    public Company(String companyName) {
        this.companyName = companyName;
        this.departments = new ArrayList<>();
    }

    /*
     * Method to add a department to the company
     */
    public Department addDepartment(String departmentName) {
        Department dept = new Department(departmentName);
        departments.add(dept);
        return dept;
    }

    /*
     * Method to display company structure
     */
    public void displayCompany() {
        System.out.println("Company: " + companyName);

        // Loop through departments and display their employees
        for (Department dept : departments) {
            dept.displayEmployees();
        }
    }

    /*
     * Method to delete company
     * This deletes all departments and employees
     */
    public void deleteCompany() {

        // Loop through departments and delete employees
        for (Department dept : departments) {
            dept.deleteDepartment();
        }

        departments.clear();
        System.out.println("Company deleted along with all departments and employees.");
    }
}

/*
 * Main class
 * ----------
 * Demonstrates composition relationship
 */
public class CompositionDemo {

    public static void main(String[] args) {

        // Creating company object
        Company company = new Company("TechNova Pvt Ltd");

        // Adding departments
        Department dev = company.addDepartment("Development");
        Department hr = company.addDepartment("Human Resources");

        // Adding employees to departments
        dev.addEmployee("Alok", 101);
        dev.addEmployee("Rahul", 102);
        hr.addEmployee("Anita", 201);

        // Display company structure
        company.displayCompany();

        System.out.println();

        // Deleting company (composition in action)
        company.deleteCompany();
    }
}

