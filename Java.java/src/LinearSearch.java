public class LinearSearch {
    public static void main(String[] args) {
        int []arr= {12,15,17,19,32,-1,-3};
        int target=-3;
        int ans = linerSearch(arr,target);
        System.out.println(ans);
    }


    static  int linerSearch(int [] arr,int target){
        if (arr.length==0){
            return Integer.MAX_VALUE;
        }
        for (int index = 0; index < arr.length; index++) {
            int element=arr[index];
            if (element==target){
                return element;
            }

        }
        return Integer.MAX_VALUE;
    }

}
