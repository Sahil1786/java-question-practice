public class Pratice1 {
    public static void main(String[] args) {
        int [] arr={12,34,45,78,56,18,-1,-2};
        int target =-1;
        int ans = Serch(arr,target,2,5);
        System.out.println(ans);
    }
    static int Serch(int [] arr ,int target, int start , int end){
//        if (arr[0]==0){
//            return Integer.MAX_VALUE;
//        }
        for (int index = start; index < end; index++) {
            int element=arr[index];
            if ( element==target){
                return element;
            }

        }
        return Integer.MAX_VALUE;
    }
}
