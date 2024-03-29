package String;

import java.util.ArrayList;

public class SubSequences {
    public static void main(String[] args) {

        System.out.println(  subseq("","abc"));
    }


    static  void sub(String p,String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        sub(p+ch,up.substring(1));
        sub(p,up.substring(1));


    }
    static ArrayList<String> subseq(String p, String up){
        if (up.isEmpty()){
          ArrayList<String>list=new ArrayList<>(); // base condition
          list.add(p);
          return list;
        }
        char ch=up.charAt(0);
        ArrayList<String>left=subseq(p+ch,up.substring(1));
        ArrayList<String>right= subseq(p,up.substring(1));
        left.addAll(right);
        return left;

    }

}
