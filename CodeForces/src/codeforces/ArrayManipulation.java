package codeforces;

import java.util.Scanner;

public class ArrayManipulation {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int sizeOfArray = scanner.nextInt();
        long[] summedArray = new long[sizeOfArray];
        int numberOfOperations = scanner.nextInt();
        int[][] operationsArray = new int[numberOfOperations][3];
        long max = 0;
        for (int i = 0; i < numberOfOperations; i++) {
            for (int j = 0; j < 3; j++) {
                operationsArray[i][j] = scanner.nextInt();
            }
            summedArray[operationsArray[i][0] - 1] += operationsArray[i][2];
            if (operationsArray[i][1] < sizeOfArray)
                summedArray[operationsArray[i][1]] -= operationsArray[i][2];
        }

        long[] prefixSumArray = new long[summedArray.length];

        prefixSumArray[0] = summedArray[0];
        max = prefixSumArray[0];
        for (int i = 1; i < summedArray.length; ++i) {
            prefixSumArray[i] = prefixSumArray[i - 1] + summedArray[i];
            if (max < prefixSumArray[i]) max = prefixSumArray[i];
        }

        System.out.println(max);


    }
}
