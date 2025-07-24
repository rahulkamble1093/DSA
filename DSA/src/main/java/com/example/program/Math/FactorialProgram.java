package com.example.program.Math;

public class FactorialProgram {
    public static void main(String[] args) {
        System.out.println("fact : " + factorial(5));
    }

    public static int factorial(int n){
        int fact = 1;
        while(n > 0){
            fact = n * fact;
            n--;
        }
        return fact;
    }
}
