package corePrograms.strings.level2;

import java.util.Random;

/*
 Program to generate scores and calculate grades
*/
class StudentGrades {

    // method to generate scores
    public static int[][] generateScores(int n) {
        Random r = new Random();
        int[][] pcm = new int[n][3];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < 3; j++)
                pcm[i][j] = r.nextInt(90) + 10;
        return pcm;
    }

    // method to calculate results
    public static double[][] calculate(int[][] pcm) {
        double[][] res = new double[pcm.length][3];
        for (int i = 0; i < pcm.length; i++) {
            int total = pcm[i][0] + pcm[i][1] + pcm[i][2];
            double avg = total / 3.0;
            double per = Math.round(avg * 100) / 100.0;
            res[i][0] = total;
            res[i][1] = avg;
            res[i][2] = per;
        }
        return res;
    }
}

