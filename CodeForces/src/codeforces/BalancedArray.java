package codeforces;

import java.util.Scanner;

public class BalancedArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();

            if ((n / 2) % 2 != 0) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
                int sumEven = 2;
                int sumOdd = 1;
                int[] array = new int[n];
                array[0] = 2;
                array[n / 2] = 1;
                for (int i = 1; i < n / 2; i++) {
                    array[i] = array[i - 1] + 2;
                    sumEven += array[i];
                    array[n / 2 + i] = array[n / 2 + i - 1] + 2;
                    sumOdd += array[n / 2 + i];

                }
                array[n - 1] = array[n - 1] + (sumEven - sumOdd);
                for (int i = 0; i < n; i++) {
                    System.out.print(array[i] + " ");
                }
                System.out.println();
            }



        }


    }
}
