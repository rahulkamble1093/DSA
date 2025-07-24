package com.example.program.Math;

public class PalindromeNumberProgram {

    public static void main(String[] args) {
        System.out.println( "palindrome check = " + palindromeCheck(121));
    }

    public static boolean palindromeCheck(int input){
        int original = input;
        int reverse = 0;
        int result = 0;
        while(input > 0){
            reverse = (input % 10);
            result = reverse + result * 10;
            input = input /10;


        }
        return (original == result);
    }
}
