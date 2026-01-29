package corePrograms.methods.level3;

import java.util.Random;

/*
 Program to find shortest, tallest and mean height
 of football players
*/
class FootballTeamHeight {

    // method to find sum
    public static int findSum(int[] heights) {
        int sum = 0;
        for (int h : heights)
            sum += h;
        return sum;
    }

    // method to find mean
    public static double findMean(int[] heights) {
        return findSum(heights) / (double) heights.length;
    }

    // method to find shortest
    public static int findShortest(int[] heights) {
        int min = heights[0];
        for (int h : heights)
            min = Math.min(min, h);
        return min;
    }

    // method to find tallest
    public static int findTallest(int[] heights) {
        int max = heights[0];
        for (int h : heights)
            max = Math.max(max, h);
        return max;
    }

    // main method
    public static void main(String[] args) {
        Random r = new Random();
        int[] heights = new int[11];

        // loop to generate random heights
        for (int i = 0; i < heights.length; i++)
            heights[i] = r.nextInt(101) + 150;

        System.out.println("Shortest = " + findShortest(heights));
        System.out.println("Tallest = " + findTallest(heights));
        System.out.println("Mean = " + findMean(heights));
    }
}

