package com.example.program.Math;

public class PrimeNumberOptimised {
    public static void main(String[] args) {
        System.out.println(primeNumberOptimiesd(6));
    }

    public static boolean primeNumberOptimiesd(int n){
        // return false if n=1
        if (n==1) return false;
        for(int i=2; i*i<n; i++)
            if(n % i ==0)
                return false;
        return true;
    }
}
