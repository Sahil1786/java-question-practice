
public class SearchIn2dArray {

    public static void main(String[] args) {
        int [][] arr ={
                {10,20,30,40},
                {15,25,35,45},
                {28,29,37,49},
                {33,34,38,50}
        };


        System.out.println(Arrays.toString(search(arr,37)));



    }


    static int [] search(int [][] metrix,int target){
        int r=0;
        int c = metrix.length-1;

        while (r<metrix.length && c>=0){
            if (metrix[r][c]=target){
                return new int[]{r,c};

            }
            if(metrix[r][c]<target){
                r++;

            }else {
                c--;
            }
        }
        return new int[]{-1,-1};

    }
}
