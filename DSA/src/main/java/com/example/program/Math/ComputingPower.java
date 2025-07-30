package com.example.program.Math;

public class ComputingPower {
    public static void main(String[] args) {
        System.out.println(power(2,2));
    }

    //Naive Solution
    public static int power(int x, int n){
        int result = 1;
        for(int i=0; i<n; i++){
            result = result * x;
        }
        return result;
    }
}
