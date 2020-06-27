package codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class HonestCoach {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] values = new int[n];
            for (int i = 0; i < n; i++) {
                values[i] = scanner.nextInt();
            }
            int min = Integer.MAX_VALUE;
            Arrays.sort(values);
            for (int i = 0; i < n - 1; i++) {
                if (Math.abs(values[i] - values[i + 1]) < min) {
                    min = Math.abs(values[i] - values[i + 1]);
                }
            }
            System.out.println(min);
        }


    }
}
