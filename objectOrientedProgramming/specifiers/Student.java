package objectOrientedProgramming.specifiers;

/*
 * Student class demonstrates:
 * - static variables and methods
 * - use of this keyword
 * - final variable
 * - instanceof operator
 */
public class Student {

    // Static variable shared by all Student objects
    static String universityName = "BridgeLabz University";
    static int totalStudents = 0;

    // Instance variables
    String name;
    String grade;

    // Final variable (cannot be modified once assigned)
    final int rollNumber;

    /*
     * Constructor
     * Uses 'this' keyword to initialize instance variables
     * Increments total students count
     */
    Student(String name, int rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }

    /*
     * Static method to display total number of students
     */
    public static void displayTotalStudents() {
        System.out.println("Total Students Enrolled: " + totalStudents);
    }

    /*
     * Method to display student details
     * Uses instanceof to validate object type
     */
    public void displayStudentDetails(Object obj) {
        if (obj instanceof Student) {
            Student student = (Student) obj;
            System.out.println("Student Name    : " + student.name);
            System.out.println("Roll Number     : " + student.rollNumber);
            System.out.println("Grade           : " + student.grade);
            System.out.println("University Name : " + universityName);
        } else {
            System.out.println("Invalid object. Not a Student instance.");
        }
    }

    /*
     * Method to update student grade
     * Uses instanceof to ensure safe operation
     */
    public void updateGrade(Object obj, String newGrade) {
        if (obj instanceof Student) {
            Student student = (Student) obj;
            student.grade = newGrade;
            System.out.println("Grade updated successfully for Roll No: " + student.rollNumber);
        } else {
            System.out.println("Cannot update grade. Invalid Student object.");
        }
    }

    public static void main(String[] args) {

        // Create Student objects
        Student student1 = new Student("Alok", 101, "A");
        Student student2 = new Student("Rahul", 102, "B");

        // Display student details
        student1.displayStudentDetails(student1);
        System.out.println();

        student2.displayStudentDetails(student2);
        System.out.println();

        // Update grade
        student1.updateGrade(student1, "A+");
        System.out.println();

        // Display updated details
        student1.displayStudentDetails(student1);
        System.out.println();

        // Display total students
        Student.displayTotalStudents();
    }
}
