package corePrograms.javaProgrammingelements.level2;

/*
 Program to calculate travel distance and time
*/
import java.util.Scanner;

class TravelDetails {

    // main method starts execution
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String name = input.next();
        String fromCity = input.next();
        String viaCity = input.next();
        String toCity = input.next();

        double fromToVia = input.nextDouble();
        double viaToFinalCity = input.nextDouble();
        double timeTaken = input.nextDouble();

        double totalDistance = fromToVia + viaToFinalCity;

        System.out.println(
                name + " travelled from " + fromCity +
                        " to " + toCity +
                        " via " + viaCity +
                        ". Total distance is " + totalDistance +
                        " miles and time taken is " + timeTaken
        );
    }
}

