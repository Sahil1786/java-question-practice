package String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subset {
    public static void main(String[] args) {
        int[] arr={1,2,2};
        List<List<Integer>> ans=SubsetDupilcte(arr);

        for(List<Integer> list:ans){
            System.out.println(list);
        }


    }
    static List<List<Integer>>Subset(int [] arr){
        List<List<Integer>> outerlist=new ArrayList<>();

        outerlist.add(new ArrayList<>());
        for(int num : arr){
            int n=outerlist.size();
            for (int i = 0; i < n; i++) {
                List<Integer>internal=new ArrayList<>(outerlist.get(i));
                internal.add(num);
                outerlist.add(internal);

            }
        }



        return outerlist;

    }
    static List<List<Integer>>SubsetDupilcte(int [] arr){
        Arrays.sort(arr);
        List<List<Integer>> outerlist=new ArrayList<>();

        outerlist.add(new ArrayList<>());
        int start=0;
        int end =0;

        for(int i =0; i<arr.length;i++){
            start=0;



            //if my current prev same ,s =end+1;
            if (i>0 && arr[i] ==arr[i-1]){
                start=end+1;
            }
            end=outerlist.size()-1;
            int n=outerlist.size();
            for (int j = start; j < n; j++) {
                List<Integer>internal=new ArrayList<>(outerlist.get(i));
                internal.add(arr[i]);
                outerlist.add(internal);

            }
        }



        return outerlist;

    }
}
