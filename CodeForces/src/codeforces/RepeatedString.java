package codeforces;

import java.util.Scanner;

public class RepeatedString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        long n = scanner.nextLong();
        long count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') count++;
        }

        count = (count * (n / s.length()));
        if (n % s.length() != 0) {
            String s1 = s.substring(0, (int) (n % s.length()));
            for (int i = 0; i < s1.length(); i++) {
                if (s1.charAt(i) == 'a') count++;
            }
        }


        System.out.println(count);


    }
}
