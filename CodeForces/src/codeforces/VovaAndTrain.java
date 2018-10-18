/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codeforces;

import java.util.Scanner;

/**
 *
 * @author nazir
 * 
 * problem link http://codeforces.com/contest/1066/problem/A 
 */
public class VovaAndTrain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int queries = scanner.nextInt();
        int[] canSeeLanterns = new int[queries];
        int[][] destinations = new int[queries][4];
        for (int i = 0; i < queries; i++) {
            for (int j = 0; j < 4; j++) {
                destinations[i][j] = scanner.nextInt();
            }

            int lanternsCount = destinations[i][0] / destinations[i][1];

            int v = destinations[i][1];
            lanternsCount -= (destinations[i][3] / v) - (destinations[i][2] / v);
            if (destinations[i][2] % v == 0) {
                lanternsCount--;
            }
            canSeeLanterns[i] = lanternsCount;
        }

        for (int i = 0; i < queries; i++) {
            System.out.println(canSeeLanterns[i]);
        }

    }
}
