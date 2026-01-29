package corePrograms.arrays.level1;

/*
 Program to check voting eligibility of 10 students based on age
*/
import java.util.Scanner;

class VotingEligibility {

    // main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] ages = new int[10];

        // loop to take input
        for (int i = 0; i < ages.length; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = sc.nextInt();
        }

        // loop to check voting eligibility
        for (int i = 0; i < ages.length; i++) {
            if (ages[i] < 0) {
                System.out.println("Invalid age");
            } else if (ages[i] >= 18) {
                System.out.println("The student with age " + ages[i] + " can vote");
            } else {
                System.out.println("The student with age " + ages[i] + " cannot vote");
            }
        }
    }
}

