package codeforces;

import java.util.Scanner;

public class AddOddOrSubtractEven {

    private static int getMove(int firstDigit,int secondDigit){
        int subtract=secondDigit-firstDigit;
        int moves=0;
        if (subtract>0){
            if (subtract%2!=0) moves=1;
            else moves=2;
        }else if (subtract<0){
            if (subtract%2==0) moves=1;
            else moves=2;

        }
        return moves;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int testCases=scanner.nextInt();
        int[] results=new int[testCases];
        for (int i=0;i<testCases;i++){
            results[i]=getMove(scanner.nextInt(),scanner.nextInt());
        }
        for (int i=0;i<testCases;i++){
            System.out.println(results[i]);
        }
    }
}
