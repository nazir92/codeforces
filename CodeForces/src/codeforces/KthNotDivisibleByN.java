package codeforces;

import java.util.Scanner;

public class KthNotDivisibleByN {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            if (n > k) System.out.println(k);
            else if (n <= k) {
                    int sum = k + (k / n);
                    int values = sum - (sum / n);
                    while (values < k) {
                        sum += (k - values);
                        values = sum - (sum / n);
                    }
                    System.out.println(sum);
            }
        }
    }
}
