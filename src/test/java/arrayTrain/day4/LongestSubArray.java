package arrayTrain.day4;

import java.util.HashMap;
import java.util.Map;

public class LongestSubArray {

    public static int longestSubarray(int[] arr,int k){
        int n=arr.length;
        int sum=0;
        int maxLen=0;
        HashMap<Integer,Integer> prefixMap=new HashMap<>();
        for (int i=0;i<n;i++){
            sum+=arr[i];

            //
            if(sum==k){
                maxLen=i+1;
            }

            //if (sum-k) seen before on prefixMap
            if(prefixMap.containsKey(sum-k)){
                int len=i-prefixMap.get(sum-k);
                maxLen= Math.max(len,maxLen);
            }

            //keep all sum in prefixMap if not visible
            prefixMap.putIfAbsent(sum,i);
        }
        return maxLen;
    }

    public static void main(String[] args) {
        int[] array={10,5,2,7,19};
        int length=longestSubarray(array,15);
        System.out.printf("length is:"+length);
    }
}
