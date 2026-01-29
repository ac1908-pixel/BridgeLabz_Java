package corePrograms.arrays.level2;

import java.util.Scanner;

/*
 Program to calculate percentage and grade
*/
class StudentGrades {

    // main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[] phy = new int[n];
        int[] chem = new int[n];
        int[] math = new int[n];
        double[] percent = new double[n];
        String[] grade = new String[n];

        // loop to take input
        for (int i = 0; i < n; i++) {
            phy[i] = sc.nextInt();
            chem[i] = sc.nextInt();
            math[i] = sc.nextInt();

            if (phy[i] < 0 || chem[i] < 0 || math[i] < 0) {
                System.out.println("Invalid marks");
                i--;
                continue;
            }
        }

        // loop to calculate
        for (int i = 0; i < n; i++) {
            percent[i] = (phy[i] + chem[i] + math[i]) / 3.0;

            if (percent[i] >= 90)
                grade[i] = "A";
            else if (percent[i] >= 75)
                grade[i] = "B";
            else if (percent[i] >= 60)
                grade[i] = "C";
            else
                grade[i] = "D";
        }

        // loop to display
        for (int i = 0; i < n; i++) {
            System.out.println(percent[i] + " " + grade[i]);
        }
    }
}

