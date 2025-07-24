package com.example.program.Math;


public class TrailingZeroInFactorial {
    public static void main(String[] args) {
        //System.out.println(" count = " +trailingZeroInFactorial(251));
        System.out.println(" count = " +trailingZeroInFactorialEfficient(251));
    }

    public static int trailingZeroInFactorial(int input){
        int factorial = 1;
        int count = 0;
        while(input > 0){
            factorial = factorial * input;
            input--;
        }

        while(factorial % 10 == 0){
            count++;
            factorial = factorial / 10;
        }
        return count;
    }

    public static int trailingZeroInFactorialEfficient(int input){
        int result = 0;
        for(int i =5; i <= input; i= i*5)
            result = result + input/i;
            return result;
    }
}
