package com.assignments;

import java.util.Scanner;

public class First_java_2 {
    public static void main(String[] args) {
        System.out.print("Enter your name : ");
        Scanner input = new Scanner(System.in);
        String myName = input.nextLine();
        System.out.println("How are you doing " + myName + " ?");
    }
}
