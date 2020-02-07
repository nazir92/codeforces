package codeforces;

import java.util.Scanner;

public class MinimumSwaps2 {
//https://www.hackerrank.com/challenges/minimum-swaps-2/problem
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int sizeOfArray=scanner.nextInt();
        int[] array=new int[sizeOfArray];
        for (int i=0;i<sizeOfArray;i++){
            array[i]=scanner.nextInt();
        }
        int minimumSwaps=0;

        boolean flag=true;
        do {
            flag=true;
            for (int i=0;i<sizeOfArray;i++){

                if (array[i]!=i+1){
                    flag=false;
                    minimumSwaps++;
                    int temp=array[i];
                    array[i]=array[array[i]-1];
                    array[temp-1]=temp;
                }
            }

        }while (!flag);

        System.out.println(minimumSwaps);



    }
}
