package codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class SimilarPairs {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int i = 0;
        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] array = new int[n];
            int tek = 0;
            int cut = 0;
            i = 0;
            for (int j = 0; j < n; j++) {
                array[j] = scanner.nextInt();
                if (array[j] % 2 == 0) cut++;
                else tek++;
            }
            if (tek % 2 == 1 && cut % 2 == 1) {
                Arrays.sort(array);
                for (i = 0; i < n - 1; i++) {
                    if (array[i] + 1 == array[i + 1]) {
                        break;
                    }
                }
                if (i == n - 1) {
                    System.out.println("NO");
                } else {
                    System.out.println("YES");
                }
            } else {
                System.out.println("YES");
            }
        }
    }
}
