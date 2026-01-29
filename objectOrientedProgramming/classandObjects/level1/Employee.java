package objectOrientedProgramming.classandObjects.level1;

/*
 Program to create an Employee class and display employee details
*/
class Employee {

    // instance variables
    String name;
    int id;
    double salary;

    // constructor to initialize values
    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // method to display employee details
    void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Salary: " + salary);
    }

    // main method
    public static void main(String[] args) {
        Employee emp = new Employee("Rahul", 101, 50000);
        emp.displayDetails();
    }
}

