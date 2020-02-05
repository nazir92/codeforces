package codeforces;

import java.util.Scanner;
// https://codeforces.com/contest/954/problem/B
public class StringTyping {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lengthOfString = scanner.nextInt();
        String values = scanner.next();

        int index = lengthOfString / 2;
        int operations=lengthOfString;
        if (lengthOfString>1){
            while (index >= 2) {
                if (values.substring(0, index).equals(values.substring(index, index * 2))) {
                    break;
                } else {
                    index--;
                }
            }
            operations =  lengthOfString - index +1;
        }



        System.out.println(operations);





    }
}
