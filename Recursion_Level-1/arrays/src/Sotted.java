



public class Sotted {
    public static void main(String[] args) {
        int [] arr ={1,2,3,14,5,6,7};
        System.out.println(isSotted(arr,0));



    }

    static  boolean isSotted(int [] arr , int index){
        //base condoition
        if (index== arr.length-1) {
            return true;
        }
        return arr[index]<arr[index+1] && isSotted(arr,index+1);
    }

}