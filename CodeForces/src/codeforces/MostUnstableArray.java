package codeforces;

import java.util.Scanner;

public class MostUnstableArray {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            long n = scanner.nextLong();
            long m = scanner.nextLong();
            if (n > 2) {
                System.out.println(m * 2);
            } else if (n == 2) {
                System.out.println(m);
            } else {
                System.out.println(0);
            }
        }


    }
}
