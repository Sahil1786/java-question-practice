package String;

import java.util.ArrayList;

public class Parmutations {
    public static void main(String[] args) {
//        permutstios("","abc");
//        ArrayList<String>ans=permutstioslist("","abc");
//        System.out.println(ans);
        System.out.println(permutstiosCount("","abcd"));

    }

    static void permutstios(String p,String up ){
        if (up.isEmpty()){
            System.out.println(p);
            return;

        }
        char ch=up.charAt(0);
        for (int i = 0; i <p.length() ; i++) {
            String f=p.substring(0,i);
            String s=p.substring(i,p.length());
            permutstios(f+ch,up.substring(1));
        }
    }

    static ArrayList<String> permutstioslist(String p, String up ){
        if (up.isEmpty()){
            ArrayList<String>list=new ArrayList<>();
            list.add(p);
            return list;


        }
        char ch=up.charAt(0);

        ArrayList<String>ans=new ArrayList<>();
        for (int i = 0; i <=p.length() ; i++) {
            String f=p.substring(0,i);
            String s=p.substring(i,p.length());
           ans.addAll(permutstioslist(f+ch+s,up.substring(1)));
        }
        return ans;
    }



    static int permutstiosCount(String p,String up ){
        if (up.isEmpty()){

            return 1;

        }
        int count=0;
        char ch=up.charAt(0);
        for (int i = 0; i <=p.length() ; i++) {
            String f=p.substring(0,i);
            String s=p.substring(i,p.length());
           count=count +  permutstiosCount(f+ch+s,up.substring(1));
        }
        return count;
    }


}
