package arrayTrain.day2;

import java.util.ArrayList;
import java.util.List;

public class UnionArray {

    public static List<Integer> unionArray(int[] arr1,int[] arr2){
        List<Integer> result=new ArrayList<>();
        int left = 0,right=0;

        while (left<arr1.length || right<arr2.length){

            //skip duplicate
            while (left>0 && left+1<arr1.length && arr1[left]==arr1[left-1])
                left++;

            while (right>0 && right+1<arr2.length && arr2[right]==arr2[right-1])
                right++;

            //one array exch
            if (left>=arr1.length){
                result.add(arr2[right]);
                right++;
                continue;
            } else if (right>=arr2.length) {
                result.add(arr1[left]);
                left++;
                continue;
            }

            //comparison
            if (arr1[left]<arr2[right]){
                result.add(arr1[left]);
                left++;
            } else if (arr2[right]<arr1[left]) {
                result.add(arr2[right]);
                right++;
            }
            else{
                result.add(arr1[left]);
                left++;
                right++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr1={1,2,2,3,4,5,8,9};
        int[] arr2={1,2,3,5,6,7,7};

        System.out.println(unionArray(arr1,arr2));
    }
}
