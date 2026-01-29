package corePrograms.javaControlflow.level1;

/*
 Program for rocket countdown
 using for loop
*/
import java.util.Scanner;

class CountDownFor {

    // main method starts execution
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        // for loop for countdown
        for (int i = number; i >= 1; i--) {
            System.out.println(i);
        }
    }
}

