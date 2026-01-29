package corePrograms.methods.level2;

import java.util.Scanner;

/*
 Program to check voting eligibility
*/
class StudentVoteChecker {

    // method to check voting eligibility
    public boolean canStudentVote(int age) {
        if (age < 0)
            return false;
        return age >= 18;
    }

    // main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentVoteChecker svc = new StudentVoteChecker();

        int[] ages = new int[10];

        // loop to take input
        for (int i = 0; i < 10; i++) {
            ages[i] = sc.nextInt();
            System.out.println(svc.canStudentVote(ages[i]));
        }
    }
}
