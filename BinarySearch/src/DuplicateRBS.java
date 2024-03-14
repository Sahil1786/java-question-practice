



public class DuplicateRBS {
    public static void main(String[] args) {

        int [] arr = {2,4,6,2,4,2};
        System.out.println(findPrivitDuplicate(arr));
    }
    public int search(int[] nums, int target) {

        int piviot = findPrivitDuplicate(nums);
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
