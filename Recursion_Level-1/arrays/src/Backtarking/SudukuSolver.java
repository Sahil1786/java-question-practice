package Backtarking;

import java.util.*;

public class SudukuSolver {
    public static void main(String[] args) {
        int [][]board=new int[][]{
                {3, 0, 6, 5, 0, 8, 4, 0, 0},
                {5, 2, 0, 0, 0, 0, 0, 0, 0},
                {0, 8, 7, 0, 0, 0, 0, 3, 1},
                {0, 0, 3, 0, 1, 0, 0, 8, 0},
                {9, 0, 0, 8, 6, 3, 0, 0, 5},
                {0, 5, 0, 0, 9, 0, 6, 0, 0},
                {1, 3, 0, 0, 0, 0, 2, 5, 0},
                {0, 0, 0, 0, 0, 0, 0, 7, 4},
                {0, 0, 5, 2, 0, 6, 3, 0, 0}
        };
       if (solve(board)){
           display(board);
       }
       else {
           System.out.println("Cannot solve");
       }

    }




    static  boolean solve(int [] [] board){
        int n =board.length;
        int row =-1;
        int col=-1;

        //this is hou we are replacing the r,c  from argumenets
        boolean emptyLeft=true;
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n ; j++) {
                if (board[i][j]==0){

                        row=i;
                        col=j;
                        emptyLeft=false;
                        break;

                }
            }

            //if you find some empty  element in ro ,then
            if (emptyLeft==false){
                break;
            }

        }
        if (emptyLeft==true){
            return true;
            //soduku is solve
        }
        //backtarack
        for (int number = 1; number <=9 ; number++) {
            if (isSave(board,row,col,number)){
                board[row][col]=number;
                if (solve(board)){

                    //found the ans
                    display(board);
                    return true;
                }
                else {
                    //backtarackb
                    board[row][col]=0;

                }            }

        }
        return false;

    }

    private static void display(int[][] board) {
       for(int [] row:board){
           for (int num:row){
               System.out.print(num + " ");
           }
           System.out.println();
       }
    }

    static  boolean isSave(int [] [] board,int row ,int col ,int num){

        for (int i = 0; i < board.length ; i++) {
            // check if the board is in the row or not
            if (board[row][col]==num){
                return false;
            }

        }

        // cheack the col
        for (int [] nums :board) {

            if (nums[col]==num){
                return false;
            }

        }

        int sqrt =(int)(Math.sqrt(board.length));
        int rowstart=row-row%sqrt;
        int colStrt=col-col%sqrt;

        for (int r = rowstart; r <rowstart+sqrt ; r++) {
            for (int c = colStrt; c < colStrt +sqrt; c++) {
                if (board[r][c]==num){
                    return false;
                }
            }

        }
        return true;
    }
}
