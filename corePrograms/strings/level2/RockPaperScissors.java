package corePrograms.strings.level2;

import java.util.Scanner;

/*
 Program for Rock Paper Scissors
*/
class RockPaperScissors {

    // method to get computer choice
    public static String computerChoice() {
        String[] c = {"rock","paper","scissors"};
        return c[(int)(Math.random()*3)];
    }

    // method to decide winner
    public static int winner(String user, String comp) {
        if (user.equals(comp)) return 0;
        if ((user.equals("rock") && comp.equals("scissors")) ||
                (user.equals("paper") && comp.equals("rock")) ||
                (user.equals("scissors") && comp.equals("paper")))
            return 1;
        return -1;
    }

    // main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int games = sc.nextInt();
        int userWins = 0, compWins = 0;

        for (int i = 0; i < games; i++) {
            String user = sc.next();
            String comp = computerChoice();
            int res = winner(user, comp);
            if (res == 1) userWins++;
            if (res == -1) compWins++;
        }

        System.out.println("User Wins = " + userWins);
        System.out.println("Computer Wins = " + compWins);
        System.out.println("User % = " + (userWins*100.0/games));
        System.out.println("Computer % = " + (compWins*100.0/games));
    }
}

