package corePrograms.strings.level2;

import java.util.Random;

/*
 Program to check voting eligibility
*/
class StudentVoting {

    // method to generate random ages
    public static int[] generateAges(int n) {
        int[] ages = new int[n];
        Random r = new Random();
        for (int i = 0; i < n; i++)
            ages[i] = r.nextInt(90) + 1;
        return ages;
    }

    // method to check voting
    public static String[][] checkVoting(int[] ages) {
        String[][] res = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            res[i][0] = String.valueOf(ages[i]);
            res[i][1] = (ages[i] >= 18) ? "true" : "false";
        }
        return res;
    }

    // method to display
    public static void display(String[][] data) {
        System.out.println("Age\tCanVote");
        for (int i = 0; i < data.length; i++)
            System.out.println(data[i][0] + "\t" + data[i][1]);
    }

    // main method
    public static void main(String[] args) {
        int[] ages = generateAges(10);
        display(checkVoting(ages));
    }
}

