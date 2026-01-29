package corePrograms.methods.level3;

/*
 Program for student scorecard
*/
class StudentScores {

    public static int[][] generateScores(int n) {
        int[][] scores = new int[n][3];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < 3; j++)
                scores[i][j] = (int)(Math.random() * 90) + 10;
        return scores;
    }
}
