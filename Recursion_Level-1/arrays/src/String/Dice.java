package String;

import java.util.ArrayList;

public class Dice {
    public static void main(String[] args) {
//diceChange("",4);
        System.out.println(diceChangeList("",4));
    }

    static void diceChange(String p, int target, int face){

        if (target==0){
            System.out.println(p);
            return;
        }
        for (int i = 1; i <=6 && i<=target ; i++) {
            diceChange(p+i,target-i, face);


        }
    }

    static ArrayList<String> diceChangeList(String p, int target){

        if (target==0){
           ArrayList<String> list=new ArrayList<>();
           list.add(p);
            return list;
        }
        ArrayList<String> list1=new ArrayList<>();
        for (int i = 1; i <=6 && i<=target ; i++) {
            list1.addAll(  diceChangeList(p+i,target-i));


        }
        return list1;
    }



    static void diceChangeface(String p,int target,int face){

        if (target==0){
            System.out.println(p);
            return;
        }
        for (int i = 1; i <=face && i<=target ; i++) {
            diceChangeface(p+i,target-i,face);


        }
    }
}
