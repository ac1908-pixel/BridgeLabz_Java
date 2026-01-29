package corePrograms.methods.level2;

import java.util.Scanner;

/*
 Program to find youngest and tallest friend
*/
class FriendsComparision {

    // method to find youngest
    public static int findYoungest(int[] ages) {
        int index = 0;
        for (int i = 1; i < ages.length; i++)
            if (ages[i] < ages[index])
                index = i;
        return index;
    }

    // method to find tallest
    public static int findTallest(double[] heights) {
        int index = 0;
        for (int i = 1; i < heights.length; i++)
            if (heights[i] > heights[index])
                index = i;
        return index;
    }

    // main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];

        // loop to take input
        for (int i = 0; i < 3; i++) {
            ages[i] = sc.nextInt();
            heights[i] = sc.nextDouble();
        }

        System.out.println("Youngest = " + names[findYoungest(ages)]);
        System.out.println("Tallest = " + names[findTallest(heights)]);
    }
}

