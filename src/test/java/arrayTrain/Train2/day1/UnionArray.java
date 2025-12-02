package arrayTrain.Train2.day1;

import java.util.ArrayList;
import java.util.List;

public class UnionArray {
    public static void main(String[] args) {
        int[] x={1,2,3,4,4};
        int[] y={1,2,3,6,6};
        System.out.println(unionArray(x,y));
    }
    public static List<Integer> unionArray(int[] arr1,int[] arr2){
        List<Integer> output=new ArrayList<>();
        int m=arr1.length;
        int n=arr2.length;

        int i = 0,j=0;
        while (i<m && j<n){
            while (i+1<m && arr1[i+1]==arr1[i])
                i++;
            while (j+1<n && arr2[j+1]==arr2[j])
                j++;

            if (arr1[i]<arr2[j]){
                output.add(arr1[i]);
                i++;
            } else if (arr2[j]<arr1[i]) {
                output.add(arr2[j]);
                j++;
            }
            else{
                output.add(arr1[i]);
                i++;
                j++;
            }

        }

//        Print remaining elements of the larger array

        while (i<m && arr1[i+1]==arr1[i]){
            i++;
        }
        output.add(arr1[i]);
        i++;

        while (j<n && arr2[j+1]==arr2[j]){
            j++;
        }
        output.add(arr2[j]);
         j++;

        return output;

    }
}
