package arrayTrain.day2;

public class LinearSearchDemo {
    public static void main(String[] args) {
        int[] arr={1,3,9,8,4,2,3};
        System.out.println(findIndex(arr,9));
    }
    public static int findIndex(int[] arr,int num){
        for (int i=0;i<arr.length;i++){
            if (arr[i]==num) return i;
        }
        return -1;
    }

}
