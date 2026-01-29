package corePrograms.methods.level3;

/*
 Utility class for number digit checks
*/
class NumberChecker {

    public static int countDigits(int number) {
        int count = 0;
        while (number != 0) {
            count++;
            number /= 10;
        }
        return count;
    }

    public static int[] getDigits(int number) {
        int[] digits = new int[countDigits(number)];
        int index = 0;
        while (number != 0) {
            digits[index++] = number % 10;
            number /= 10;
        }
        return digits;
    }

    public static boolean isDuckNumber(int[] digits) {
        for (int d : digits)
            if (d != 0)
                return true;
        return false;
    }

    public static boolean isArmstrong(int number, int[] digits) {
        int sum = 0;
        for (int d : digits)
            sum += Math.pow(d, digits.length);
        return sum == number;
    }

    public static int[] largestTwo(int[] digits) {
        int max = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for (int d : digits) {
            if (d > max) {
                second = max;
                max = d;
            } else if (d > second && d != max)
                second = d;
        }
        return new int[]{max, second};
    }

    public static int[] smallestTwo(int[] digits) {
        int min = Integer.MAX_VALUE, second = Integer.MAX_VALUE;
        for (int d : digits) {
            if (d < min) {
                second = min;
                min = d;
            } else if (d < second && d != min)
                second = d;
        }
        return new int[]{min, second};
    }
}

