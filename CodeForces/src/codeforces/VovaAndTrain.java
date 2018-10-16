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
public class VovaAndTrain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int queries = scanner.nextInt();

        int[][] destinations = new int[queries][4];
        for (int i = 0; i < queries; i++) {
            for (int j = 0; j < 4; j++) {
                destinations[i][j] = scanner.nextInt();
            }
        }


        
        
        

    }
}
