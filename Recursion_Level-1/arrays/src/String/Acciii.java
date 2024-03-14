package String;

import java.util.ArrayList;

public class Acciii {
    public static void main(String[] args) {
//        asccii("","abc");
        System.out.println(subseq("","abc"));
    }
    static  void asccii(String p,String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        asccii(p+ch,up.substring(1));
        asccii(p,up.substring(1));
        asccii(p+(ch+0),up.substring(1));

    }

    static ArrayList<String> subseq(String p, String up){
        if (up.isEmpty()){
            ArrayList<String>list=new ArrayList<>(); // base condition
            list.add(p);
            return list;
        }
        char ch=up.charAt(0);
        ArrayList<String>first=subseq(p+ch,up.substring(1));
        ArrayList<String>second= subseq(p,up.substring(1));
        ArrayList<String>third= subseq(p+(ch+0),up.substring(1));
        first.addAll(second);
        first.addAll(third);
        return first;

    }


}
