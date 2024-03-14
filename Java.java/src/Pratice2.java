
package com.sahil;

import java.util.*;
public class Pratice2 {
    public static void main(String[] args) {
        int [][]arr= {
                {12,34,4,56-3,44},
                {32,54,38,99,-1},
                {7,4,5,-11}
        };

//        int target = 54;
//        int[] ans =Search(arr,target);
//        System.out.println(Arrays.toString(ans));
        System.out.println(max(arr));
    }

    static  int[] Search(int [][]arr,int target){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length ; col++) {

                if (arr[row][col]==target) {

                    return new int[]{row,col};
                }

            }

        }

        return new int[]{-1,-1};

    }

    static  int max(int [][]arr){
        int max = Integer.MIN_VALUE;
        for(int [] ints :arr ){
            for (int element : ints){
                if (element>max) {
                    max=element;
                }
            }
        }
        return max;
    }

}
