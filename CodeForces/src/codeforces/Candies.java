package codeforces;

import java.util.Scanner;

public class Candies {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();

            int k = 2;
            for (int i = k; i < 30; i++) {
                if (n % (((int) Math.pow(2, i)) - 1) == 0) {
                    int xValue = n / (((int) Math.pow(2, i)) - 1);
                    System.out.println(xValue);
                    break;
                }
            }


        }
    }
}
