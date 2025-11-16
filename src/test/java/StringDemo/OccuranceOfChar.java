package StringDemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class OccuranceOfChar {
    public static void calculateOccurance(String str){
        Map<Character,Integer> countMap=new HashMap<>();
        String copyOfStr=str.replaceAll("[^a-zA-Z]]","").replaceAll("\\s","").toLowerCase();
        String copyOfStr2=copyOfStr.replaceAll("[^a-zA-Z]","");
        char[] strArray=copyOfStr2.toCharArray();

        for (char c:strArray){
            if (countMap.containsKey(c)){
                countMap.put(c,countMap.get(c)+1);
            }
            else
                countMap.put(c,1);
        }
         Set<Map.Entry<Character,Integer>> entrySet =countMap.entrySet();
        for (Map.Entry<Character, Integer> entry:entrySet){
            System.out.println(entry.getKey()+":"+entry.getValue());
        }


    }

    public static void main(String[] args) {
        calculateOccurance("My name is nitish kumar sahoo and I'm from Odisha");
    }
}
