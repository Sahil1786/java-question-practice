public class Try2 {
    public static void main(String[] args) {
        int [] arr = {23,44,56,65,67,88};
        int target= 65;
        int ans =search(arr,target);
        System.out.println(ans);
    }

    static  int search(int [] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        boolean Acc = arr[start] < arr[end];
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (Acc) {
                if (target > arr[mid]) {
                        end = mid + 1;
                } else {
                    start = mid - 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid+ 1;
                }
            }
        }

        return -1;
        }


}
