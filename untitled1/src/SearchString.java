public class SearchString {
    public static void main(String[] args) {
        String nam="sahil";
        char target='i';
        System.out.println(Surch(nam,target) );
    }
    static boolean Surch(String str , char target){
        if (str.length()==0){
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (target==str.charAt(i)){
                return true;
            }

        }
        return false;

    }

}
