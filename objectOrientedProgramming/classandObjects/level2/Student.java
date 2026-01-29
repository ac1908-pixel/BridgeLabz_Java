package objectOrientedProgramming.classandObjects.level2;

/*
 Program to simulate a student report
*/
class Student {

    // attributes of the Student class
    String name;
    int rollNumber;
    int marks;

    // constructor to initialize student details
    Student(String name, int rollNumber, int marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    // method to calculate grade based on marks
    char calculateGrade() {
        if (marks >= 90) return 'A';
        else if (marks >= 75) return 'B';
        else if (marks >= 60) return 'C';
        else if (marks >= 40) return 'D';
        else return 'F';
    }

    // method to display student details
    void displayReport() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + calculateGrade());
    }

    // main method
    public static void main(String[] args) {
        Student s = new Student("Amit", 101, 82);
        s.displayReport();
    }
}

