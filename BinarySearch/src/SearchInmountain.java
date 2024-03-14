

public class SearchInmountain {
    public static void main(String[] args) {


    }

int search(int []arr,int target ){
    int peek= peakIndexInMountainArray(arr);
    int firstTry=orderAgnosticsbs(arr,target,0,peek) ;
    if (firstTry !=-1){
        return firstTry;

    }
    //try to search in second halk
    return orderAgnosticsbs(arr, target,peek+1,arr.length-1);
}


    public int peakIndexInMountainArray(int[] arr) {
        int start =0;
        int end=arr.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if (arr[mid]>arr[mid+1]){
                //decresing arr
                //this may be the ans lokk at left
                end=mid;
            }else {
                //accending arr
                start=mid+1;//because we know that mid+1 elemet>mid element
            }
        }
        //in the end ,start ==end and pointing to the largest number because of of cheakes
        return start;

    }
    static  int  orderAgnosticsbs(int []arr ,int target,int start, int end ){

        //find whetaher  the array is sorted in asscending or descending
        boolean isAcc=arr[start]<arr[end];



        while (start<=end ){
            int mid= start+(end-start)/2;
            if (arr[mid]==target){
                return mid;
            }
            if (target<arr[mid]){
                end =mid-1;
            } else if (target>arr[mid]) {
                start=mid+1;
            }else {
//                 ans found
                return mid;
            }
        }
        return start;
    }
}
