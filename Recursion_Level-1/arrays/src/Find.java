import java.util.ArrayList;

public class Find {
    public static void main(String[] args) {
        int [] arr ={1,2,3,6,5,5,9};
//
//        System.out.println(find(arr,6,0));
//        System.out.println(findIndex(arr,6,0));
//        System.out.println(findIndexLast(arr,6, arr.length-1));
//
//     findAllIndex(arr,5,0);
//        System.out.println(list);
//       ArrayList<Integer> ANS= findAllIndexArraylist(arr,5,0,new ArrayList<>());
//        System.out.println(ANS);
        System.out.println(findAllIndexArraylist2(arr,5,0));

    }

    static boolean find (int [] arr , int target , int index){
        if (index== arr.length-1){
            return false;

        }
        return arr[index]==target || find(arr,target,index+1);

    }


    static int findIndex (int [] arr , int target , int index){
        if (index== arr.length-1){
            return -1;

        }
        if (arr[index]==target){
            return index;
        }
        else {
            return findIndex(arr, target, index + 1);
        }

    }
    static int findIndexLast (int [] arr , int target , int index){
        if (index== -1){
            return -1;

        }
        if (arr[index]==target){
            return index;
        }
        else {
            return findIndexLast(arr, target, index - 1);
        }

    }

         static  ArrayList<Integer>list=new ArrayList<>();
    static int findAllIndex (int [] arr , int target , int index){
        if (index== arr.length-1){
            return -1;

        }
        if (arr[index]==target){
           list.add(index);
        }
        return findAllIndex ( arr , target ,  index+1);

    }


    static ArrayList<Integer> findAllIndexArraylist (int [] arr , int target , int index,ArrayList<Integer> list){
        if (index== arr.length-1){
         return list;

        }
        if (arr[index]==target){
            list.add(index);
        }
        return findAllIndexArraylist ( arr , target ,  index+1,list);

    }



    static ArrayList<Integer> findAllIndexArraylist2 (int [] arr , int target , int index){
        ArrayList<Integer> list =new ArrayList<>();
        if (index== arr.length-1){
            return list;

        }
        // content ans for function called only
        if (arr[index]==target){
            list.add(index);
        }
      ArrayList<Integer> ansFromBillowcalles= findAllIndexArraylist2 ( arr , target ,  index+1);
        list.addAll(ansFromBillowcalles);
        return list;

    }

}
