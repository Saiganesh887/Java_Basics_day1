package com.bridgelabz.day1;

import java.util.Scanner;

public class InvalidInt {
    public static void main(String[] args){
        int sum=0, j=args.length;
        System.out.println("Calculates Sum for below Integers");
        for(int i=0;i<j;i++){
            System.out.println(args[i]);
            try {
                sum = sum + Integer.parseInt(args[i]);
            } catch (NumberFormatException e) {
                System.out.println("Invalid integer command line arguments: " + e.toString());
            }
        }
        System.out.println("Sum :" + sum);
    }
}

