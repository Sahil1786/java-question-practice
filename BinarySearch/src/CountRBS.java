
package com.sahil;



public class CountRBS {
    public static void main(String[] args) {
        int [] arr = new int[]{4, 5, 6, 7, 0, 1, 2};
        System.out.println(countRoatetion(arr));
    }

    private static int countRoatetion(int[] arr) {
        int privot = findPrivit(arr);
//        if (privot==-1){
//            //arr is not roated ;
//            return 0;
//
//        }
        return privot+1;

    }

    //contains non-duplicate

    static  int findPrivit(int [] arr){
        int start = 0;
        int end= arr.length-1;
        while (start<=end){
            int mid = start+(end-start)/2;
            if( mid <end && arr[mid]>arr[mid+1]){
                return  mid;
            }
            if (mid>start && arr[mid] <arr[mid-1]){
                return  mid-1;
            }
            if (arr[mid] <= arr[start]){
                end = mid-1;
            }
            else {
                start=mid+1;
            }
        }
        return -1;
    }

    // dublicated contains
    static  int findPrivitDuplicate(int [] arr){
        int start = 0;
        int end= arr.length-1;
        while (start<=end){
            int mid = start+(end-start)/2;
            if( mid <end && arr[mid]>arr[mid+1]){
                return  mid;
            }
            if (mid>start && arr[mid] <arr[mid-1]){
                return  mid-1;
            }
            // if elemet at middle ,start,end,are equal then just skip duplicate
            if (arr[mid]==arr[start] && arr[mid]==arr[end]){
                // note: what if thease elemet at start and end were the piviot??
                //check if start is piviot

                if (arr[start]> arr[start+1]){
                    return start;
                }

                start++;

                // cheke end is piviot or not
                if (arr[end]<arr[end-1]){
                    return end-1;
                }
                end--;
            }
            //left side sotted ,so piviot should be in right
            else if (arr[start] <arr[mid] || (arr[start]==arr[mid] && arr[mid]>arr[end])){
                start=mid+1;

            }else {
                mid=mid-1;

            }

        }
        return -1;
    }

}
