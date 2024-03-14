


package com.sahil;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5};
        bubbleShort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubbleShort(int [] arr){
        boolean swapped;

        // run the steps n-1 times;
        for (int i = 0; i < arr.length; i++) {
         swapped = false;
            //for each step will comes at the last respactive index
            for (int j = 1; j < arr.length-i; j++) {

                //swap if the item is smaller the the privious item
                if (arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapped =true;
                }
            }

            // if you did not  swap for pariculler value of i ,it mens arr is sorted henece stop the program;
            if(!swapped){
                break;
            }

        }
    }
}