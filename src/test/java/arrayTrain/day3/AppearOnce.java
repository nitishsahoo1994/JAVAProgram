package arrayTrain.day3;

public class AppearOnce {
    public static void main(String[] args) {
        int[] arr={1,1,2,3,4,4,5,5};
        int n=arr.length;
        for (int i=0;i<n;i++){
            int num=arr[i];
            int count=0;
            for (int j=0;j<n;j++){
                if (arr[j]==num){
                    count++;
                }
            }
            if (count==1)
                System.out.println(arr[i]);
        }
    }
}
