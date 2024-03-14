public class MountainArr {
    public static void main(String[] args) {

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
}
