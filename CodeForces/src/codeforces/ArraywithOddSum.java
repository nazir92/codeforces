package codeforces;

import java.util.Scanner;

public class ArraywithOddSum {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        boolean[] testCaseResults = new boolean[testCases];
        for (int i = 0; i < testCases; i++) {
            int numberOfELements = scanner.nextInt();
            int sum = 0;
            for (int j = 0; j < numberOfELements; j++) {
                sum += scanner.nextInt();
            }
            if (sum % 2 != 0) {
                testCaseResults[i] = true;
            }
        }

        for (int i = 0; i < testCases; i++) {
            if (testCaseResults[i]) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }



    }
}
