package partterns;

import java.util.Arrays;

public class Triangle {
    public static void main(String[] args) {
//        trainggle2(4,0);
        int [] arr ={4,3,2,1};
    bubble(arr,4,0);
        System.out.println(Arrays.toString(arr));
    }

    static  void trainggle(int row , int col){
        if (row==0){
            return;
        }
        if (col<row){
            System.out.print("*");
            trainggle(row,col+1);

        }   else {
            System.out.println();
            trainggle2(row-1,0);

        }
    }

    static  void trainggle2(int row , int col){
        if (row==0){
            return;
        }
        if (col<row){

            trainggle2(row,col+1);
            System.out.print("*");

        }   else {

            trainggle2(row-1,0);
            System.out.println();

        }
    }
    static  void bubble(int [] arr,int row , int col){
        if (row==0){
            return;
        }
        if (col<row){
       if(arr[col]>arr[col+1]) {
          int temp=arr[col];
          arr[col]=arr[col+1];
          arr[col+1]=temp;
       }
            bubble(arr, row, col + 1);
        }   else {

            bubble(arr,row-1,0);

        }
    }

    static  void seclection(int [] arr,int row , int col,int max){
        if (row==0){
            return;
        }
        if (col<row){
      if (arr[col]>arr[max]){
          seclection(arr,row,col+1,col);
      }else {
          seclection(arr,row,col+1,max);
      }


        }   else {
      int temp=arr[max];
      arr[max]=arr[row-1];
            arr[row-1]=temp;
            seclection(arr,row-1,0,0);
        }
    }

}
