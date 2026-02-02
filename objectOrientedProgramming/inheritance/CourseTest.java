package objectOrientedProgramming.inheritance;

class Course {
    String courseName;
    int duration; // in weeks

    // Constructor
    Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    // Method to display course details
    void displayDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " weeks");
    }
}

class OnlineCourse extends Course {
    String platform;
    boolean isRecorded;

    // Constructor
    OnlineCourse(String courseName, int duration,
                 String platform, boolean isRecorded) {
        super(courseName, duration); // initialize Course fields
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    // Override displayDetails()
    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Platform: " + platform);
        System.out.println("Recorded: " + (isRecorded ? "Yes" : "No"));
    }
}


class PaidOnlineCourse extends OnlineCourse {
    double fee;
    double discount; // percentage

    // Constructor
    PaidOnlineCourse(String courseName, int duration,
                     String platform, boolean isRecorded,
                     double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    double calculateFinalFee() {
        return fee - (fee * discount / 100);
    }

    // Override displayDetails()
    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Course Fee: ₹" + fee);
        System.out.println("Discount: " + discount + "%");
        System.out.println("Final Price: ₹" + calculateFinalFee());
    }
}


public class CourseTest {
    public static void main(String[] args) {

        Course basicCourse = new Course("Data Structures", 8);

        OnlineCourse onlineCourse = new OnlineCourse(
                "Machine Learning",
                10,
                "Coursera",
                true
        );

        PaidOnlineCourse paidCourse = new PaidOnlineCourse(
                "Advanced Java",
                12,
                "Udemy",
                true,
                4999,
                20
        );

        System.out.println("---- Basic Course ----");
        basicCourse.displayDetails();

        System.out.println("\n---- Online Course ----");
        onlineCourse.displayDetails();

        System.out.println("\n---- Paid Online Course ----");
        paidCourse.displayDetails();
    }
}

