

public class CountNumber {
    public static void main(String[] args) {
        System.out.println(counnt(120203004));
    }
    static int counnt(int n){
        return helpeer(n,0);
    }

    private static int helpeer(int n, int c) {
        if (n==0){
            return c;
        }
        int rem =n%10;
        if (rem ==0){
            return helpeer(n/10,c+1);
        }
        return helpeer(n/10,c);
    }

}
