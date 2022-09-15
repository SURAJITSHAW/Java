package com.assignments;

import java.util.Scanner;

public class First_java_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int principal_balance = input.nextInt();
        int time = input.nextInt();
        float interest_rate = input.nextFloat();

        float final_amount = (principal_balance * time * interest_rate) / 100;
        System.out.println(final_amount);
    }
}
