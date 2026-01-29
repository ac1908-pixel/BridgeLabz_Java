package corePrograms.javaControlflow.level1;

/*
 Program to check voting eligibility
*/
import java.util.Scanner;

class VotingEligibility {

    // main method starts execution
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int age = input.nextInt();

        if (age >= 18) {
            System.out.println("The person's age is " + age + " and can vote.");
        } else {
            System.out.println("The person's age is " + age + " and cannot vote.");
        }
    }
}

