package codeforces;

import java.util.Scanner;

public class CountingValleys {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        String s = scanner.next();

        int count = 0;
        int valley = 0;
        boolean flag = false;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'D') {
                count--;
            } else if (s.charAt(i) == 'U') {
                count++;
            }

            if (count < 0) {
                flag = true;
            }

            if (count == 0 && flag) {
                valley++;
                flag = false;
                count = 0;
            }


        }
        System.out.println(valley);


    }
}
