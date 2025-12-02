package arrayTrain.Train2.day1;

import java.util.Map;

public class LongestSumSubArray {

    public static void main(String[] args) {
        int[] arr={1,2,3,1,1,1,0,2,4,5};
        int n=arr.length;
        int k=3;

        int len=0;
        for (int i=0;i<n;i++){
            int sum=0;
            for (int j=i;j<n;j++){
                sum+=arr[j];
                if (sum==k){
                    len=Math.max(len,j-i+1);
                }
            }

        }

        System.out.println(len);

    }
}
