import java.util.Arrays;

class linearSearchString {
    public static void main(String[] args) {
        String name="Sahil Nibba ";
        char target='i';
        System.out.println(SearchString(name,target));
//        System.out.println(name);

    }
    static boolean SearchString(String str,char target){
        if (str.length() == 0) {

            return false;

        }
        for (char ch:str.toCharArray()) {
            if (ch==target){
                return true;

        }
//        for (int index = 0; index <str.length() ; index++) {
//
//            if (target==str.charAt(index)){
//                return true;
//            }


        }
        return false;
    }


}
