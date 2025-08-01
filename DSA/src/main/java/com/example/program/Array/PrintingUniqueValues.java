package com.example.program.Array;

import java.util.HashMap;
import java.util.HashSet;

public class PrintingUniqueValues {
    public static void main(String[] args) {
        int[] input = {1,2,3,4,5,1,2,1,2,3,2};
        printUniqueNumbers(input);
        printUniqueNumbersHashMap(input);
    }

    public static void printUniqueNumbers(int[] input ){
        HashSet<Integer> intSet = new HashSet<>();
        for(int i=0; i<input.length; i++){
            int temp = 0;
            if(!intSet.add(input[i])){
                temp = input[i];
            }
            intSet.remove(temp);
        }
        for (Integer i : intSet){
            System.out.println(i + ",");
        }
    }

    public static void printUniqueNumbersHashMap(int[] input ){
        HashMap<Integer, Integer> frequencyMap = new HashMap();
        for(int n : input){
            if(frequencyMap.containsKey(n)){
                frequencyMap.put(n,frequencyMap.get(n)+1);
            }
            else
                frequencyMap.put(n,1);
        }
        for(int i : input){
            if(frequencyMap.get(i)==1){
                System.out.println(i +" ");
            }
        }
    }
}
