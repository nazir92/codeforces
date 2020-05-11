package codeforces;

import java.util.ArrayList;
import java.util.Scanner;

public class SumOfRoundNumbers {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int testCases = in.nextInt();
//        while (testCases-- > 0) {
//            int n = in.nextInt();
//            int count = 0;
//            int pow = 0;
//            String str = "";
//            while (n > 0) {
//                int value = n % 10;
//                n /= 10;
//                if (value != 0) {
//                    count++;
//                    str += (int) (value * Math.pow(10, pow)) + " ";
//                }
//
//                pow++;
//            }
//            System.out.println(count);
//            System.out.println(str);
//        }
//
//    }




    public static void main(String args[]){
        Scanner in=new Scanner (System.in);
        int t=in.nextInt();
        while(--t>=0){
            int n=in.nextInt();
            ArrayList<Integer> arr=new ArrayList<>();
            int ctr=0;
            while(n>0){
                if(n%10!=0)
                    arr.add((n%10)*(int)Math.pow(10, ctr));
                ctr++;
                n=n/10;
            }
            int m=arr.size();
            System.out.println(m);
            for(int i=0;i<m;i++){
                System.out.print(arr.get(i)+" ");
            }
            System.out.println();
        }
    }
}
