package corePrograms.javaControlflow.level2;

import java.util.Scanner;

/*
 Program to calculate average marks,
 grade and remarks
*/
class GradeCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int physics = input.nextInt();
        int chemistry = input.nextInt();
        int maths = input.nextInt();

        double average = (physics + chemistry + maths) / 3.0;

        if (average >= 90) {
            System.out.println("Average: " + average + " Grade: A Remarks: Excellent");
        } else if (average >= 75) {
            System.out.println("Average: " + average + " Grade: B Remarks: Very Good");
        } else if (average >= 60) {
            System.out.println("Average: " + average + " Grade: C Remarks: Good");
        } else {
            System.out.println("Average: " + average + " Grade: D Remarks: Needs Improvement");
        }
    }
}
