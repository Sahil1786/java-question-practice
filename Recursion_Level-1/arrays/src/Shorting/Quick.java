package Shorting;


import java.util.Arrays;

public class Quick {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        sort(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    static  void sort(int [] nums ,int low , int high ){
        if(low>high){
            return;
        }
        int s=low;
        int e=high;
        int mid=s+(e-s)/2;
        int pivit =nums[mid];

        if(s<=e){
            // also a resaion if its already soored it will  not swap
            while (nums[s]<pivit){
                s++;
            }
            while (nums[e]>pivit){
                e--;

            }
            if (s<=e){
                int temp=nums[s];
                nums[s]=nums[e];
                nums[e]=temp;
                s++;
                e--;

            }
        }

        //now my privit is at correct position indxex , sort 2 half
        sort(nums,low,e);
        sort(nums,s,high);
    }

}
