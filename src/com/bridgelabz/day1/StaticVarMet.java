package com.bridgelabz.day1;

public class StaticVarMet {
    static int a=5,b=9;
    static int sum(){
        int x = a + b;
        return x;
    }
    static int mul(int y,int z){
        int c = y * z;
        return c;
    }
    public static void main(String[] args){
        int sum1 = sum();
        System.out.println("Sum1: " +sum1);
        int sum2 = a + sum1;
        System.out.println("Sum2: "+sum2);
        int mul1 = mul(3,5);
        System.out.println("mul1: "+mul1);
    }
}
