package corePrograms.methods.level1;

import java.util.Scanner;

/*
 Program to distribute chocolates among children
*/
class ChocolateDistribution {

    // method to find chocolates per child and remaining
    public static int[] findRemainderAndQuotient(int chocolates, int children) {
        return new int[]{chocolates / children, chocolates % children};
    }

    // main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int chocolates = sc.nextInt();
        int children = sc.nextInt();

        int[] result = findRemainderAndQuotient(chocolates, children);

        System.out.println("Each child gets = " + result[0]);
        System.out.println("Remaining chocolates = " + result[1]);
    }
}

