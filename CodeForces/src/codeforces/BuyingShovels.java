package codeforces;

import java.util.Scanner;

public class BuyingShovels {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            if (n <= k) {
                System.out.println(1);
            } else {
                if (n % k == 0) {
                    System.out.println(n / k);
                } else {
                    for (int i =(int)Math.sqrt(n)+1; i > 0; i--) {
                        if (n % i == 0) {
                            System.out.println(n / i);
                            break;
                        }
                    }
                }
            }

        }


    }
}
