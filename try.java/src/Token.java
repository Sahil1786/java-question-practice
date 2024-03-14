import java.util.StringTokenizer;

public class Token {
    public static void main(String[] args) {
        String s = "hello -hi -i am sahil";
        StringTokenizer stringTokenizer=new StringTokenizer(s,"-");
        int tockenCount=stringTokenizer.countTokens();
        for (int i = 0; i <tockenCount ; i++) {
            System.out.println("token[" +  i + "] -" +stringTokenizer.nextToken());

        }
    }
}
