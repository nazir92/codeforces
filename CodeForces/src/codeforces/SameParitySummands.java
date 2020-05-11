package codeforces;

import java.util.Scanner;

public class SameParitySummands {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int testCases = scanner.nextInt();
        while (testCases-- > 0) {
            long sum = scanner.nextLong();
            int numberCount = scanner.nextInt();

            long oddRemain = sum - (numberCount - 1);
            long evenRemain = sum - 2 * (numberCount - 1);
            if (oddRemain > 0 && oddRemain % 2 == 1) {
                System.out.println("YES");
                for (int i = 0; i < numberCount - 1; i++) {
                    System.out.print("1 ");
                }
                System.out.println(oddRemain);
            } else if (evenRemain > 0 && evenRemain % 2 == 0) {
                System.out.println("YES");
                for (int i = 0; i < (numberCount - 1); i++) {
                    System.out.print("2 ");
                }
                System.out.println(evenRemain);
            } else {
                System.out.println("NO");
            }
        }


    }
}
