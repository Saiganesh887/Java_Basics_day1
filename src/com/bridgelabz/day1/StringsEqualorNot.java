package com.bridgelabz.day1;

import java.util.Scanner;

public class StringsEqualorNot {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first String: ");
        String x = sc.next();
        System.out.println("Enter the Second String: ");
        String y = sc.next();
        boolean x1 = x.equals(y);
        if(x1 == true){
        System.out.println("The strings are equal");
        }
        else{
            System.out.println("The strings are not equal");
        }
    }
}
