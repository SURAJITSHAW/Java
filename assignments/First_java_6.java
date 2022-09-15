package com.assignments;

import java.util.Scanner;

public class First_java_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rupees = input.nextInt();

        float dollar = (float) (rupees * 0.013);
        System.out.println(dollar);
    }
}
