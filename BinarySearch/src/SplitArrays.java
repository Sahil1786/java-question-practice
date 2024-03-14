
package com .sahil;



public class SplitArrays {

    public static void main (String [] args ){

    }


    public int splitArray(int[] nums, int k) {
        int start =0;
        int end=0;
        for (int i = 0; i < nums.length; i++) {
            start= Math.max(start,nums[i]);   //in the end of the loop this will contain the max item foem this arr
            end+=nums[i];
        }
//binaray search

        while (start<end ){
            //try  to mid as a potential ans
            int mid =start + (end -start)/2;
            //calclute how many picess you can divide this in with this max
            int sum =0;
            int pieces=1;
            for (int num: nums ) {
                if (sum +num > mid){
                    // you can not add this subarry , make new one ;
                    // say  you add this num in new subarray, then sum = num
                    sum = num;
                    pieces++;

                }else {
                    sum+=num;
                }

            }
            if (pieces> k){

                start =mid +1;

            }else {
                end =mid;
            }
        }
        return end ;//here start ==end ;
    }
}
