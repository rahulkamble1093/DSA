package com.example.program.Math;

public class SieveOfEratosthenes {
    public static void main(String[] args) {
        printPrimes(10);
    }

    public static void printPrimes(int n){
        for(int i=2; i<=n;i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }

    }
    public static boolean isPrime(int n){
        if (n==1) return false;
        for(int i=2; i<n; i++)
            if(n % i ==0)
                return false;
        return true;
    }
}
