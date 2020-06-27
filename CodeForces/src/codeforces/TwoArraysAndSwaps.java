package codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class TwoArraysAndSwaps {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int t=scanner.nextInt();
        while (t-->0){
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            int sum = 0;
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
                sum+=a[i];
            }
            Arrays.sort(a);
            for (int j = 0; j < n; j++) {
                b[j] = scanner.nextInt();
            }
            Arrays.sort(b);

            if (k>0) {
                for (int i = 0; i < k; i++) {
                    if (a[i] < b[n - 1 - i]) {
                        sum-=a[i];
                        sum+=b[n-1-i];
                    }
                }
            }
            System.out.println(sum);

        }



    }
}
