package arrayTrain.Train2.day1;

import java.util.Arrays;

public class ZeroOptimal {
    public static void main(String[] args) {
        int[] arr={1,0,2,3,0,4,0,5,0};
        int n=arr.length;
        int j=1;
        for (int i=0;i<n;i++){
            if (arr[i]==0) {
                j=i;
                break;
            };
        }

        //now swap
        for (int i=j+1;i<n;i++){
            if (arr[i]!=0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
