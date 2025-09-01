package arrayTrain.day3;

public class MissingNumber {
    public static void main(String[] args) {
            int[] arr={1,2,3,4,6,7};
        System.out.println("Missing num is:"+missNum(arr));
    }

    public static int missNum(int[] arr){
        int n=arr.length;

        for (int i=1;i<n;i++){
            int flag=0;
            for (int j=0;j<n-1;j++){
                if (arr[j]==i){
                    flag=1;
                    break;
                }
            }
            if (flag==0)
                return i;
        }
        return -1;
    }
}
