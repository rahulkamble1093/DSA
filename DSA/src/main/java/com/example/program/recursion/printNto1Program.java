package com.example.program.recursion;

public class printNto1Program {
    public static void main(String[] args) {
        printNto1(5);
    }

    public static void printNto1(int n){
        if(n==0)
            return;
        System.out.println(n+" ");
        printNto1(n-1);
    }
}
