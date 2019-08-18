package codeforces;

import java.util.Scanner;

public class SockMerchant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = scanner.nextInt();
        }

        int pairs = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (ar[j] == 0) continue;

                if (ar[i] == ar[j]) {
                    pairs++;
                    ar[j] = 0;
                    break;
                }

            }
        }

        System.out.println(pairs);


    }
}
