package com.example.program.Math;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
    //    System.out.println(" check GCD : " + CalculateGCD(10, 15));
        System.out.println(" check GCD : " + euclideanGCD(1005, 105));
    }

    public static int CalculateGCD(int a, int b) {  // time complexity is O(min(a,b))
        int minimum = Math.min(a, b);
        if (minimum == 0)
            return 0;
        while (minimum > 0) {
            if (a % minimum == 0 && b % minimum == 0) {
                break;
            }
            minimum--;
        }
        return minimum;
    }

    public static int euclideanGCD(int a, int b) {
        while (a != b) {
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }
        return a;
    }
}
