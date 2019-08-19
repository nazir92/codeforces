package codeforces;

import java.util.Scanner;

public class JumpingOnTheClouds {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] clouds = new int[n];
        for (int i = 0; i < n; i++) {
            clouds[i] = scanner.nextInt();
        }

        int jumps = 0;
        int i = 0;
        while (i < n) {

            if (clouds[i + 1] == 0) {
                if (i + 2 < n && clouds[i + 2] == 0) {
                    i = i + 2;
                } else {
                    i++;
                }
                jumps++;
            } else if (clouds[i + 2] == 0) {
                i = i + 2;
                jumps++;
            }

            if (i >= n - 1) break;

        }


        System.out.println(jumps);


    }
}
