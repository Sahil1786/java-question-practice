package Shorting;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Marge {


    public static void main(String[] args) {
      int [] arr={5,4,3,2,1};
    margeShortimplace(arr,0, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    static int [] margeShort(int [] arr ){
        if (arr.length==1){
            return arr;
        }
        int mid =arr.length/2;
        int [] left=margeShort(Arrays.copyOfRange(arr,0,mid));
        int [] right= margeShort(Arrays.copyOfRange(arr,mid,arr.length));
        return marge(left,right);

    }

    private static int[] marge(int[] first, int[] seccend) {
        int [] mix=new int[first.length+seccend.length];
        int i=0;
        int j=0;
        int k=0;
        while (i<first.length && j<seccend.length){
            if (first[i]<seccend[j]){
                mix[k]=first[i];
                i++;
            }else {
                mix[k]=seccend[j];
                j++;
            }
            k++;
        }
        // it may be posible that one of the arrays is not complete;
        //copy the remenening elements
        while (i<first.length){
            mix[k]=first[i];
            i++;
            k++;
        }
        while (j<seccend.length){
            mix[k]=seccend[j];
            j++;
            k++;
        }
        return mix;

    }















    static void margeShortimplace(int [] arr ,int s,int e){
        if (e-s==1){
            return ;
        }
        int mid =(s+e)/2;
       margeShortimplace(arr,s,mid);
        margeShortimplace(arr,mid,e);
      margeimplace(arr,s,mid,e);

    }

    private static void margeimplace(int []arr, int s,int mid ,int e) {
        int [] mix=new int [e-s];
        int i=s;
        int j=mid;
        int k=0;
        while (i<mid && j<e){
            if (arr[i]<arr[j]){
                mix[k]=arr[i];
                i++;
            }else {
                mix[k]=arr[j];
                j++;
            }
            k++;
        }
        // it may be posible that one of the arrays is not complete;
        //copy the remenening elements
        while (i<mid){
            mix[k]=arr[i];
            i++;
            k++;
        }
        while (j<e){
            mix[k]=arr[j];
            j++;
            k++;
        }
        for (int l = 0; l < mix.length; l++) {
            arr[s+l]=mix[l];


        }
    }

}
