package codeforces;

import java.util.Scanner;

public class LeftRotation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int d = scanner.nextInt();
        int[] a = new int[n];
        int[] a1=new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        for (int i = 0; i < n ; i++) {
            int value = i - d;
            int index = 0;
            if (value < 0) {
                index = n - Math.abs(value);
            } else {
                index = value;
            }
//            System.out.println(index);
            a1[index]=a[i];

        }


        for (int i=0;i<n;i++){
            System.out.print(a1[i]+" ");
        }

    }
}
