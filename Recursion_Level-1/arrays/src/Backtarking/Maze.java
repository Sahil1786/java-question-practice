package Backtarking;

import java.util.ArrayList;

public class Maze {
    public static void main(String[] args) {
//        System.out.println(pathList("",3,3));
//        System.out.println(pathListDragional("",3,3));
        boolean [][]bord= {
                {true,true,true},
                {true,true,true},
                {true,false,true},
        };
        pathRestictions("",bord,0,0);
    }

    static int count (int r ,int c ){
        if (r==1 || c==1){
            return 1;
        }
        int left=count(r-1,c);
        int right=count(r,c-1);
        return left+right;
    }
    static  void path(String p,int r , int c ){
        if (r==1 && c==1){
            System.out.println(p);
            return;
        }
        if (r>1){
            path(p+'D',r-1,c);
        }if (c>1){
            path(p+'R',r,c-1);
        }
    }

     static ArrayList<String> pathList(String p, int r , int c ){
        if (r==1 && c==1){
            ArrayList<String>list=new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String>list=new ArrayList<>();
        if (r>1){
            list.addAll(pathList(p+'D',r-1,c));
        }if (c>1){
            list.addAll( pathList(p+'R',r,c-1));
        }return list;
    }

    static ArrayList<String> pathListDragional(String p, int r , int c ){
        if (r==1 && c==1){
            ArrayList<String>list=new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String>list=new ArrayList<>();
        if (r>1&&c>1){
            list.addAll(pathListDragional(p+'D',r-1,c-1));
        }
        if (r>1){
            list.addAll(pathListDragional(p+'v',r-1,c));
        }if (c>1){
            list.addAll( pathListDragional(p+'h',r,c-1));
        }return list;
    }

    static  void pathRestictions(String p,boolean [][] maze,int r , int c ){
        if (r== maze.length-1 && c==maze[0].length-1 ){
            System.out.println(p);
            return;
        }
        if (maze[r][c]==false){
            return;
        }
        if (r< maze.length-1 ){
            pathRestictions(p+'D',maze,r+1,c);
        }if (c<maze[0].length-1){
            pathRestictions(p+'R',maze,r,c+1);
        }
    }




}
