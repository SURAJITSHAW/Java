package com.assignments;

import java.util.Scanner;

public class First_java_1 {
    public static void  main(String[] args) {
        /* check if the number is even or odd */
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        if (num % 2 == 0) {
            System.out.println( num + " is even number.");
        } else {
            System.out.println( num + " is odd number. ");
        }
    }
}
