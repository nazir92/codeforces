package codeforces;

import java.util.Scanner;

public class AliceBobAndCandies {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        while (testCases-- > 0) {
            int numberOfCandies = scanner.nextInt();
            int[] sizeOfCandies = new int[numberOfCandies];
            for (int i = 0; i < numberOfCandies; i++) {
                sizeOfCandies[i] = scanner.nextInt();
            }
            int sumOfAlice = sizeOfCandies[0];
            int sumOfBob = 0;
            int aliceLastEat = sizeOfCandies[0];
            int bobLastEat = 0;
            int moves = 1;
            int i = 0;
            int j = numberOfCandies;

            while (i < j) {
                boolean aliceMoves = false;
                boolean bobMoves = false;

                if (aliceLastEat <= bobLastEat) {
                    while (aliceLastEat <= bobLastEat) {
                        i++;
                        if (i >= j) break;
                        sumOfAlice += sizeOfCandies[i];
                        aliceLastEat += sizeOfCandies[i];
                        aliceMoves = true;
                    }
                    if (aliceMoves) {
                        bobLastEat = 0;
                        moves++;

                    }
                } else if ((bobLastEat <= aliceLastEat)) {
                    while (bobLastEat <= aliceLastEat) {
                        j--;
                        if (j <= i) break;
                        sumOfBob += sizeOfCandies[j];
                        bobLastEat += sizeOfCandies[j];
                        bobMoves = true;

                    }
                    if (bobMoves) {
                        aliceLastEat = 0;
                        moves++;
                    }
                }
            }
            System.out.println(moves + " " + sumOfAlice + " " + sumOfBob);
        }


    }
}
