package corePrograms.javaProgrammingelements.level1;

/*
 Program to calculate volume of Earth
 in cubic kilometers and miles
*/
class EarthVolume {

    // main method execution starts here
    public static void main(String[] args) {

        double radiusKm = 6378;
        double pi = Math.PI;

        double volumeKm = (4.0 / 3.0) * pi * radiusKm * radiusKm * radiusKm;
        double volumeMiles = volumeKm / (1.6 * 1.6 * 1.6);

        System.out.println(
                "The volume of earth in cubic kilometers is " + volumeKm +
                        " and cubic miles is " + volumeMiles
        );
    }
}