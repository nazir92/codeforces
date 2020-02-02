package codeforces;

import java.util.Scanner;


// https://codeforces.com/contest/466/problem/A
public class CheapTravel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int sum=0;
        if (n%m==0){
            sum=Math.min(n*a,(n/m)*b);
        }else {
            int diff=n%m;
            sum=Math.min(Math.min(n*a,(n/m)*b+diff*a),((n/m)*b+b));
            if (n<m&&sum>b){
                sum=b;
            }
        }
        System.out.println(sum);
        



    }
}
