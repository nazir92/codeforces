package codeforces;

import java.util.Scanner;

public class MinimalSquare {


    private static int getSquare(int val1, int val2) {

        if (val1 - (2 * val2) >= 0) {
            return val1 * val1;
        } else {
            return 4 * val2 * val2;
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            if (a > b) {
                System.out.println(getSquare(a, b));
            } else if (a < b) {
                System.out.println(getSquare(b, a));
            } else {
                System.out.println(4 * a * a);
            }


        }

    }
}
