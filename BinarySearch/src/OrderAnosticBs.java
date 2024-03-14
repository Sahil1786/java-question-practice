public class OrderAnosticBs {
    public static void main(String[] args) {

    }
    static  int  orderAgnosticsbs(int []arr ,int target){
        int start=0;
        int end = arr.length-1;
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
