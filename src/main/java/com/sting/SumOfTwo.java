package com.sting;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SumOfTwo {

    public static void main(String[] args) {
        int[] numbers = {2,3,4,7};
        int target = 9;
        System.out.println( "Numbers " + Arrays.toString(numbers));
        System.out.println("The Two number to sum are "+classicTwoSum(numbers,9)[0] + " and " +classicTwoSum(numbers,9)[1] + " for target "+target);
        System.out.println("The Two indices to sum are "+hasTwoSum(numbers,9)[0] + " and " +hasTwoSum(numbers,9)[1] + " for target "+target);
    }

    public static int[] classicTwoSum(int[] numbers, int target) {
       for(int i = 0; i < numbers.length-1; i++){
           for(int j = i+1; j < numbers.length; j++){
               if(numbers[i]+numbers[j]==target) {
                   return new int[]{numbers[i],numbers[j]};
               }
           }
       }
       return new int[2];
    }

    public static int[] hasTwoSum(int[] numbers, int target) {
        Map<Integer, Integer> hashSum = new HashMap<>();
        for(int i = 0; i < numbers.length; i++) {
            int complement = target-numbers[i];
            if(hashSum.get(complement) != null){
                return new int[]{hashSum.get(complement),i};
            }else {
                hashSum.put(numbers[i], i);
            }
        }
        return new int[2];
    }

}
