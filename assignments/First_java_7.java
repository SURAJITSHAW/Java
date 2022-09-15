package com.assignments;

import java.util.Scanner;

public class First_java_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        for (int i = 2; i < num; i += 1) {
            int f0 = 0;
            int f1 = 1;

            System.out.println(f0);

            int temp = f0;
            f0 = f1;
            f1 += temp;
        }
    }
}
