import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int [ ]arr = {1,3,23,9,18};
//        swap(arr,1,3);
//        System.out.println(max(arr,0,2));
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }





    static void swap(int[] arr , int index1,int index2 ){
        int temp=arr[index1];
       arr[index1] =arr[index2];
        arr[index2]=temp;

    }

    static void reverse(int []arr) {
       int start= 0;
       int end=arr.length-1;
        while (start<end ){
            swap(arr,start,end);
            start++;
            end--;

        }


    }




//    static int max(int []arr , int start, int end){
//        if (end >start){
//            return -1;
//        }
//        if (arr==null){
//            return -1;
//        }
//
//        int maxVal=arr[0];
//        for (int i = start; i <end; i++) {
//            if (arr[i]>maxVal){
//                maxVal=arr[i];
//            }
//
//
//        }
//        return maxVal;
//    }

}
