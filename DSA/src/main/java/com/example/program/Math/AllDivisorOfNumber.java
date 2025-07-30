package com.example.program.Math;

public class AllDivisorOfNumber {
    public static void main(String[] args) {
        printDivisors(6);
        System.out.println();
        printDivisorsEfficient(6);
    }

    //naive Solution
    public static void printDivisors(int n){
        for(int i = 1;i<=n; i++){
            if(n%i==0)
                System.out.println(i);
        }
    }

    //efficient solution
    public static void printDivisorsEfficient(int n){
        for(int i = 1;i*1<=n; i++){
            if(n%i==0)
                System.out.println(i);
        }
    }
}
