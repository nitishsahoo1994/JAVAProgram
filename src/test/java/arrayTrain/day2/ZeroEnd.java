package arrayTrain.day2;

import java.util.Arrays;

public class ZeroEnd {
    public static void main(String[] args) {
        int[] arr={1,0,2,3,2,0,0,4,5,1};
        int n =arr.length;
        int j=-1;
        for (int i=0;i<n;i++){
            if (arr[i]==0){
                j=i;
                break;
            }
        }

        for(int i=j+1;i<n;i++){
            if (arr[i]!=0) {
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j+=1;
            }
        }
        System.out.print(Arrays.toString(arr));
    }
}
