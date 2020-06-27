package codeforces;

import java.util.Scanner;

public class BoardMoves {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-->0) {
            long n = scanner.nextLong();
            long sum = 0;
            for (long i = 1; i <= n; i += 2) {
                sum += ((4 * (i - 1)) * (i / 2));
            }
            System.out.println(sum);
        }
    }
}
