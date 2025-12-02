package arrayTrain.Train2.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ZeroEndBrute {

    public static void main(String[] args) {
        List<Integer> output=new ArrayList<>();
        int[] arr={1,0,2,3,0,4,0};
        Arrays.sort(arr);
        int n=arr.length;


        //step 1
        for (int i=0;i<n;i++){
            if (arr[i]!=0){
                output.add(arr[i]);
            }
        }
        //System.out.println(output);
        int noOfNz0=output.size();
        System.out.println(n+"::"+noOfNz0);

        //2nd step
        for (int i=0;i<output.size();i++){
            arr[i]=output.get(i);
        }

       // System.out.println(Arrays.toString(arr));

        for (int i=noOfNz0;i<n;i++){
            arr[i]=0;
        }
        System.out.println(Arrays.toString(arr));
    }
}
