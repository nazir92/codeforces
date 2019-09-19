package codeforces;

import java.util.Scanner;

//https://www.hackerrank.com/challenges/new-year-chaos/problem
public class NewYearChaos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test_cases = scanner.nextInt();
        int numberOfPeople = scanner.nextInt();
        int[] queue = new int[numberOfPeople];
        for (int i = 0; i < numberOfPeople; i++) {
            queue[i] = scanner.nextInt();
        }


        int bribes = 0;


        boolean flag = true;
        do {
            flag = true;
            for (int i = 0; i < numberOfPeople; i++) {
                if ((queue[i] - 1) - i <= 2) {
                    if ((queue[i] - 1) - i != 0 && (queue[i] >= queue[i + 1])) {
//                        System.out.println(i + " " + queue[i]);
                        int temp = queue[i];
                        queue[i] = queue[i + 1];
                        queue[i + 1] = temp;
                        bribes++;
                        flag = false;
                    }
                } else {
                    System.out.println("Too chaotic");
                    return;
                }

            }
        } while (!flag);


        System.out.println(bribes);


    }
}
