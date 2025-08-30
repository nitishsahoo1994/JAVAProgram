package arrayTrain.day2;

import java.util.Arrays;

public class NthIndexRotate {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        int d=3;
        int n=arr.length;
        int[] temp=new int[d];
        int j=0;
        for (int i=0;i<d;i++){
            temp[i]=arr[i];

            j++;
        }
        System.out.println(Arrays.toString(temp));
        for (int i=d;i<n;i++){
            arr[i-d]=arr[i];
        }

        for (int i=n-d;i<n;i++){
            arr[i]=temp[i-(n-d)];
        }
        System.out.println(Arrays.toString(arr));
    }
}
