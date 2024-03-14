


public class RotatedBinarySearch {
    public static void main(String[] args) {

        int [] arr = {4,5,6,7,0,1,2};
        System.out.println(findPrivit(arr));
    }

    public int search(int[] nums, int target) {

        int piviot = findPrivit(nums);
        // if not find the pivit ,it mens the array is not rotated
        if(piviot==-1){
//            just do normrmal binary Search
return binarySearch(nums ,target,0 , nums.length-1);
        }
        // i have found the 2 assending sotted arrys
        if (nums[piviot]==target) {
            return piviot;
        }
        if(target >= nums[0]){
            return binarySearch(nums,target,0,piviot-1);
        }
return binarySearch(nums,target,piviot+1,nums.length-1);
    }

    static int binarySearch(int [] arr, int target ,int start , int  end){


        while (start<=end ){
            int mid= start+(end-start)/2;
            if (target<arr[mid]){
                end =mid-1;
            } else if (target>arr[mid]) {
                start=mid+1;
            }else {
//                 ans found
                return mid;
            }
        }
        return -1;
    }


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
}
