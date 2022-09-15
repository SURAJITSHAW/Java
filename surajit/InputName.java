package com.surajit;

import java.util.Scanner;

public class InputName {
    public static void main(String[] args) {
        System.out.print("Enter your name : ");
        Scanner input = new Scanner(System.in);
        String myName = input.next();
        System.out.println("How are you doing " + myName + " ?");
    }
}
