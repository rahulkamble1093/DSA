package com.example.program.Math;

public class LCMProgram {
    public static void main(String[] args) {
        System.out.println(LCMProgram(7,3));
    }

    public static int LCMProgram(int a, int b){
        int result = Math.max(a,b);
        while(true){
            if (result % a == 0 & result % b == 0){
                return result;
            }
            result++;
        }
    }
}
