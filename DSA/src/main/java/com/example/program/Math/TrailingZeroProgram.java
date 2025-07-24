package com.example.program.Math;

public class TrailingZeroProgram {
    public static void main(String[] args) {
        System.out.println("output : " + trailingZero(1101010100));
    }

    public static int trailingZero(int input){
        int count = 0;
        while(input > 0){
            int check = input % 10;
            if(check % 2 == 0){
                count++;
            }
            input = input / 10;
        }
        return count;
    }
}
