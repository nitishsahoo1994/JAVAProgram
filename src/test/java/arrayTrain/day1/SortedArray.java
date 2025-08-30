package arrayTrain.day1;

public class SortedArray {

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,8,7,};
        System.out.println(checkSorted(arr));
    }
    public static boolean checkSorted(int[] arr){
        int n=arr.length;
        for (int i=1;i<n;i++){
            if (arr[i]>arr[i-1]){

            }
            else
                return false;
        }

        return true;
    }
}
