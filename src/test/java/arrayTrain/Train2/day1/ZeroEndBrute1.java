package arrayTrain.Train2.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ZeroEndBrute1 {

    public static void main(String[] args) {
        int[] arr={1,0,2,3,0,4,5,6,0};
        int n=arr.length;

        List<Integer> output=new ArrayList<>();
        for (int i=0;i<n;i++){
            if (arr[i]!=0) output.add(arr[i]);
        }

        System.out.println(output);
        //
        for (int i=0;i<output.size();i++){
            arr[i]=output.get(i);
        }
        System.out.println(Arrays.toString(arr));

        int noOfNz=output.size();

        for (int i=noOfNz;i<n;i++) arr[i]=0;


        System.out.println(Arrays.toString(arr));




    }
}
