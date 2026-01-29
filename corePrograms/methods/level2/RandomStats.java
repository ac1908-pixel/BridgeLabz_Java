package corePrograms.methods.level2;

/*
 Program to generate random numbers and find average, min and max
*/
class RandomStats {

    // method to generate random numbers
    public static int[] generate4DigitRandomArray(int size) {
        int[] arr = new int[size];

        for (int i = 0; i < size; i++)
            arr[i] = (int)(Math.random() * 9000) + 1000;

        return arr;
    }

    // method to find average, min, max
    public static double[] findAverageMinMax(int[] numbers) {
        int min = numbers[0];
        int max = numbers[0];
        int sum = 0;

        for (int n : numbers) {
            sum += n;
            min = Math.min(min, n);
            max = Math.max(max, n);
        }

        return new double[]{sum / (double)numbers.length, min, max};
    }

    // main method
    public static void main(String[] args) {
        int[] arr = generate4DigitRandomArray(5);
        double[] result = findAverageMinMax(arr);

        System.out.println("Average = " + result[0]);
        System.out.println("Min = " + result[1]);
        System.out.println("Max = " + result[2]);
    }
}

