package codeforces;

import java.util.Scanner;

public class EvenOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = Long.parseLong(scanner.next());
        long k = Long.parseLong(scanner.next());
        long result = 0;
        if (n % 2 == 0) {
            if (k > n / 2) {
                result = 2 + 2 * (k - 1 - (n / 2));
            } else {
                result = 1 + 2 * (k - 1);
            }

        } else {
            if (k > ((n / 2) + 1)) {
                result = 2 + 2 * (k - 2 - (n / 2));
            } else {
                result = 1 + 2 * (k - 1);
            }
        }

        System.out.println(result);


    }
}
