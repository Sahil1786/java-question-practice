public class LinearSurch {
    public static void main(String[] args) {
        int [] nums ={23,45,1,2,8,19,-3,16,-11,28};
        int target=-1;
        int ans = Linear(nums,target);
        System.out.println(ans);

    }

    // search ihe arr  : return the index if item found
    // other wise if item not found return -1;

    static int Linear(int []arr ,int target ){
        if (arr.length==0){
            return Integer.MAX_VALUE;

        }
        //rn a forloop
        for (int index = 0; index <arr.length ; index++) {
            //check for element every index if it is = target
            int element =arr[index];
            if(element==target){
                return index;
            }

        }
        //this line will excute if no of the retun statsment avobe excute
        // hence target not found ;
        return Integer.MAX_VALUE;
    }

}
