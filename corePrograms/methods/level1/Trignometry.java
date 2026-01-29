package corePrograms.methods.level1;

/*
 Program to calculate trigonometric functions
*/
class Trignometry {

    // method to calculate trigonometric functions
    public static double[] calculateTrigonometricFunctions(double angle) {
        double radians = Math.toRadians(angle);
        return new double[]{
                Math.sin(radians),
                Math.cos(radians),
                Math.tan(radians)
        };
    }

    // main method
    public static void main(String[] args) {
        double angle = Double.parseDouble(args[0]);

        double[] result = calculateTrigonometricFunctions(angle);

        System.out.println("Sin = " + result[0]);
        System.out.println("Cos = " + result[1]);
        System.out.println("Tan = " + result[2]);
    }
}
