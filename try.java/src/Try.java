public class Try {
    static void IsCooment(String str){
       char [] line =str.toCharArray();
        if(line[0]=='/' && line[1]=='/'){
            System.out.println("Sinngle Line Comment");
        } else if (line[0]=='/' && line[1]=='*' && line[line.length-2]=='*' && line[line.length-1]=='/' ) {
            System.out.println("this is a multi line comment ");

        }
        else {
            System.out.println("this not a comment ..enter a Valid Comment");
        }
       
    }

    public static void main(String[] args) {
        String coment ="/*this is my */";
        IsCooment(coment);
    }
}
