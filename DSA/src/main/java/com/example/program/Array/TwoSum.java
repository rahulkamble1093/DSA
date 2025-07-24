package com.example.program.Array;

public class TwoSum {

    public static void main(String[] args) {
        int[] ints = TwoSumImpl(new int[]{2,7,11,15}, 26);
        System.out.println("["+ints[0] + ", " + ints[1]+""+"]");
    }

    public static int[] TwoSumImpl( int[] sum, int target){
        int[] output = new int[2];
       for(int i=0; i<sum.length-1; i++){
           for(int j=i+1; j<sum.length; j++){
               if(sum[i]+sum[j] == target){
                   output[0] = i;
                   output[1] = j;
                   break;
               }
           }

       }
        return output;
    }
}
