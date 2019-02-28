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
 */
public class Heaters {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int elementSize = scanner.nextInt();
        int r = scanner.nextInt();
        int[] elements = new int[elementSize];
        int heaterSize = 0;
        int count = 0;
        for (int i = 0; i < elementSize; i++) {
            elements[i] = scanner.nextInt();
            if (elements[i] == 1) {
                heaterSize++;
            }
        }

        if (heaterSize == 0) {
            System.out.println("-1");
            return;
        }
        int[][] heaterPositions = new int[heaterSize][2];
        heaterSize = 0;
        for (int i = 0; i < elementSize; i++) {
            if (elements[i] == 1) {
                heaterPositions[heaterSize][0] = i - r + 2;
                heaterPositions[heaterSize][1] = i + r;

                if (heaterPositions[heaterSize][0] < 0) {
                    heaterPositions[heaterSize][0] = 1;
                }

                if (heaterPositions[heaterSize][1] > elementSize) {
                    heaterPositions[heaterSize][1] = elementSize;
                }

                heaterSize++;
                count++;
            }
        }

        for (int i = 0; i < heaterSize; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(heaterPositions[i][j] + " ");
            }
            System.out.println("");
        }

    }

}
