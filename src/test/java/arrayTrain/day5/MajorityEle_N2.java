package arrayTrain.day5;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MajorityEle_N2 {
    public static void main(String[] args) {
        HashMap<Integer,Integer> prefixMap=new HashMap<>();
        int[] arr={7,7,5,7,5,1,5,7,5,5,7,7,5,5,5,5,7,7,7,7};
        int n=arr.length;

        for (int i=0;i<n;i++){
            if (prefixMap.containsKey(arr[i])){
                prefixMap.put(arr[i],prefixMap.get(arr[i])+1);
            }
            else prefixMap.put(arr[i],1);
        }
        Set<Map.Entry<Integer,Integer>> entries =prefixMap.entrySet();
        for (Map.Entry<Integer,Integer> entry:entries){
            //System.out.println(entry.getKey()+":"+entry.getValue());

            if (entry.getValue()>=(n/2)){
                System.out.println(entry.getKey());
            }
        }
    }
}
