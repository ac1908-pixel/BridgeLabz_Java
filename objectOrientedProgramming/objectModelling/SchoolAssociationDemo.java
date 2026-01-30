package objectOrientedProgramming.objectModelling;

import java.util.ArrayList;

/*
 * Course class
 * ------------
 * Represents a course.
 * A course can have multiple students enrolled.
 * This forms a many-to-many association with Student.
 */
class Course {

    private String courseName;
    private ArrayList<Student> students;

    /*
     * Constructor to initialize course name
     */
    public Course(String courseName) {
        this.courseName = courseName;
        this.students = new ArrayList<>();
    }

    /*
     * Method to add a student to the course
     */
    public void addStudent(Student student) {
        students.add(student);
    }

    /*
     * Method to display students enrolled in the course
     */
    public void showStudents() {
        System.out.println("Students enrolled in " + courseName + ":");

        // Loop through students list and display names
        for (Student student : students) {
            System.out.println("- " + student.getName());
        }
    }

    /*
     * Getter method for course name
     */
    public String getCourseName() {
        return courseName;
    }
}

/*
 * Student class
 * -------------
 * Represents a student.
 * A student can enroll in multiple courses.
 * This creates a many-to-many association with Course.
 */
class Student {

    private String name;
    private ArrayList<Course> courses;

    /*
     * Constructor to initialize student name
     */
    public Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    /*
     * Method to enroll student in a course
     */
    public void enrollCourse(Course course) {
        courses.add(course);
        course.addStudent(this); // Maintain association from both sides
    }

    /*
     * Method to display courses enrolled by the student
     */
    public void showCourses() {
        System.out.println("Courses enrolled by " + name + ":");

        // Loop through courses list and display course names
        for (Course course : courses) {
            System.out.println("- " + course.getCourseName());
        }
    }

    /*
     * Getter method for student name
     */
    public String getName() {
        return name;
    }
}

/*
 * School class
 * ------------
 * Represents a School.
 * A School aggregates Student objects.
 * Students can exist independently of the School.
 */
class School {

    private String schoolName;
    private ArrayList<Student> students;

    /*
     * Constructor to initialize school name
     */
    public School(String schoolName) {
        this.schoolName = schoolName;
        this.students = new ArrayList<>();
    }

    /*
     * Method to add a student to the school
     */
    public void addStudent(Student student) {
        students.add(student);
    }

    /*
     * Method to display all students in the school
     */
    public void showStudents() {
        System.out.println("Students in " + schoolName + ":");

        // Loop through students list and display names
        for (Student student : students) {
            System.out.println("- " + student.getName());
        }
    }
}

/*
 * Main class
 * ----------
 * Demonstrates aggregation and association relationships
 */
public class SchoolAssociationDemo {

    public static void main(String[] args) {

        // Creating school
        School school = new School("Green Valley School");

        // Creating students
        Student alok = new Student("Alok");
        Student rahul = new Student("Rahul");

        // Adding students to school (aggregation)
        school.addStudent(alok);
        school.addStudent(rahul);

        // Creating courses
        Course math = new Course("Mathematics");
        Course cs = new Course("Computer Science");

        // Enrolling students in courses (association)
        alok.enrollCourse(math);
        alok.enrollCourse(cs);

        rahul.enrollCourse(cs);

        // Displaying student-course relationships
        alok.showCourses();
        System.out.println();
        rahul.showCourses();
        System.out.println();

        // Displaying course-student relationships
        math.showStudents();
        System.out.println();
        cs.showStudents();
    }
}
