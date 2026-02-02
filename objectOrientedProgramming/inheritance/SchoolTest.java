package objectOrientedProgramming.inheritance;

class Person {
    String name;
    int age;

    // Constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Common method
    void displayBasicInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Teacher extends Person {
    String subject;

    // Constructor
    Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    void displayRole() {
        System.out.println("Role: Teacher");
        System.out.println("Subject: " + subject);
    }
}

class Student extends Person {
    String grade;

    // Constructor
    Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    void displayRole() {
        System.out.println("Role: Student");
        System.out.println("Grade: " + grade);
    }
}

class Staff extends Person {
    String department;

    // Constructor
    Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    void displayRole() {
        System.out.println("Role: Staff");
        System.out.println("Department: " + department);
    }
}

public class SchoolTest {
    public static void main(String[] args) {

        Teacher teacher = new Teacher("Mr. Sharma", 40, "Mathematics");
        Student student = new Student("Anita", 15, "10th Grade");
        Staff staff = new Staff("Ramesh", 45, "Administration");

        System.out.println("---- Teacher ----");
        teacher.displayBasicInfo();
        teacher.displayRole();

        System.out.println("\n---- Student ----");
        student.displayBasicInfo();
        student.displayRole();

        System.out.println("\n---- Staff ----");
        staff.displayBasicInfo();
        staff.displayRole();
    }
}
