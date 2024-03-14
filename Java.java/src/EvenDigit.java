

package  com.sahil;


public class EvenDigit {
    public static void main(String[] args) {
        int [ ] nums ={12,345,2,6,7896};
        System.out.println(findNumber(nums));
//        System.out.println(digit2(-63743));

    }
    static  int findNumber (int []nums ){
        int count =0;
        for (int num:nums )
        if(even(num)){
            count++;
        }

        return count;
    }



    static int digit2(int num ){

        if (num <0){
            num=num*-1;
        }
        return (int )(Math.log10(num))+1;

    }
//    function is contained even digit or not
    static boolean even(int num){
int numberofDigit=digits(num);


    return numberofDigit %2 ==0 ;

}



//    count number in a number
    static int digits(int num){
        if (num <0){
            num=num*-1;
        }
        if (num==0){
            return 1;
        }
        int count =0;
        while (num>0){
            count++;
            num=num/10;
        }
        return count;
    }
}
