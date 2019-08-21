package codeforces;

import java.util.Scanner;

public class D2ArrayDS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] array = new int[6][6];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                array[i][j] = scanner.nextInt();
            }
        }

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int sum = array[i][j] + array[i][j + 1] + array[i][j + 2]
                        + array[i + 1][j + 1]
                        + array[i + 2][j] + array[i + 2][j + 1] + array[i + 2][j + 2];
                if (sum >= max) max = sum;

            }
        }
        System.out.println(max);

    }
}
