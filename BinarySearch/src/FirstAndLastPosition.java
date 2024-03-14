public class FirstAndLastPosition {
    public static void main(String[] args) {

    }



    public int[] searchRange(int[] nums, int target) {
       int [ ] ans ={-1,-1};
        ans[0]=secrch(nums,target,true);
        ans[1] =secrch(nums,target,false);


return ans;

    }
    //this function just return the index value of what we are trying to
     static int secrch (int [] nums ,int target ,boolean findstartIndex) {

        int ans = -1;

        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
//                  potiontional ans found
                 ans=mid;
                if (findstartIndex){
                    end=mid-1;
                }else {
                    start=mid+1;
                }

                }
            }
            return ans;
        }


    static int binarySearch(int [] arr, int target,int start , int end  ){

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
    }

