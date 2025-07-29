package com.example.program.Math;

public class PrimeFactors {
    public static void main(String[] args) {
        calculatePrimeFactors(450);
        System.out.println("\n");
        calculatePrimeFactorEfficient(450);
        System.out.println("\n");
        calculatePrimeFactorMoreEfficient(450);
    }

    public static void calculatePrimeFactors(int n){
        for (int i=2; i<n; i++){
            if(PrimeNumberProgram.checkPrime(i)){
                int x = i;
                while(n % x == 0){
                    System.out.println(i);
                    x = x*i;
                }
            }
        }
    }

    public static void calculatePrimeFactorEfficient(int n){
        if(n<=1) return;
        for(int i=2; i*i <=n; i++){
            while(n%i==0){
                System.out.println(i);
                n = n/i;
            }
        }
        if(n>1)
            System.out.println(n);
    }

    public static void calculatePrimeFactorMoreEfficient(int n){
        if(n<=1)
            return;
        while(n%2==0){
            System.out.println(2);
            n=n/2;
        }
        while(n%3==0){
            System.out.println(3);
            n=n/3;
        }
        for (int i=5; i*i<=n; i=i+6){
            while(n%i==0){
                System.out.println(i);
                n=n/i;
            }
            while(n%(i+2)==0){
                System.out.println(i+2);
                n=n/(i+2);
            }
        }
        if(n>3)
            System.out.println(n);

    }


}
