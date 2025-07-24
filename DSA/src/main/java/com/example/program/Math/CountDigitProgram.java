package com.example.program.Math;

public class CountDigitProgram {

    public static void main(String[] args) {
        System.out.println( "total number of digit : " + countDigit(923523));
    }
    // 9235
    public static int countDigit(int input){
        int count = 0;
        while(input > 0){
            input = input / 10;
            count++;
        }
        return count;
    }
}
