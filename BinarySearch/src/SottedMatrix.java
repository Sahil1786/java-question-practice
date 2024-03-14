import java.util.Arrays;

public class SottedMatrix {
    public static void main(String[] args) {

        int [][] arr={
                {1,2,3},
                {4,5,6},
                {7,8,9},

        };
        System.out.println(Arrays.toString(serach(arr,99)));
    }
    //search in row provided ,btwn the col rovided
    static int[] binarySerch(int [][] metrix,int row,int cstart, int cend ,int target){
        while(cstart<=cend){
            int mid=cstart + (cend-cstart)/2;
            if (metrix[row][mid]==target){
                return new int[]{row,mid};
            } if (metrix[row][mid]<target){
                cend=mid-1;

            }else {
                cstart=mid+1;
            }
        }
        return new int[]{-1,-1};
    }
    static int[] serach (int [] []metrix,int target){
        int rows= metrix.length;
        int cols = metrix[0].length;//be cutious ,may be empty;
        if(rows==1){
          return   binarySerch(metrix,0,0,cols-1,target);

        }
        int rstart=0;
        int rend=rows-1;
        int cmid=cols/2;
        //run the loop till 2 rows are reaminig
        while (rstart<(rend-1)){ //whilethis is true it willhav to more rows elemnate
            int mid=rstart+(rend-rstart)/2;
            if (metrix[mid][cmid]==target){
                return new int[]{mid,cmid};
            }
            if (metrix[mid][cmid]<target){
                rstart=mid;
            }else {
                rend=mid;
            }
        }

        //now we have rows
        //cheack weather the target is in the col of 2 rows
        if(metrix[rstart][cmid] == target){
            return new int[]{rstart,cmid};
        }  if(metrix[rstart+1][cmid] == target){
            return new int[]{rstart +1,cmid};
        }
        // search in 1st ,2nd ,3rd ,4th half
        if(target<=metrix[rstart][cmid-1]){
            return binarySerch(metrix,rstart,0,cmid-1,target);
        }
//        2nd
        if(target>=metrix[rstart][cmid+1] && target <=metrix[rstart][cols-1]){
            return binarySerch(metrix,rstart,cmid,cols-1,target);
        }
//        3rd
        if(target<=metrix[rstart+1][cmid-1]){
//4th
            return binarySerch(metrix,rstart +1,0,cmid-1,target);
        }else {
            return binarySerch(metrix,rstart+1,cmid+1,cols-1,target);
        }



    }

}
