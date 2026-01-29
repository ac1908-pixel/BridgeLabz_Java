package corePrograms.javaControlflow.level1;

/*
 Program for rocket countdown
 using while loop
*/
import java.util.Scanner;

class CountdownWhile {

    // main method starts execution
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int counter = input.nextInt();

        // while loop for countdown
        while (counter >= 1) {
            System.out.println(counter);
            counter--;
        }
    }
}
