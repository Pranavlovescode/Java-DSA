package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"Pranav");
        map.put(2,"Pramod");
        map.put(3,"Siddhant");
        map.put(4,"Neha");
        map.put(5,"Arnav");
        System.out.println(map);
        System.out.println(map.get(3));
        map.remove(5);
        System.out.println(map.values());
        System.out.println(map.containsKey(3));


        Map<Character,Integer> freqMap = new HashMap<>();
        String str = "abababhfdslfkdsfbabf";
        for (char i:str.toCharArray()){
            freqMap.put(i,freqMap.getOrDefault(i,0)+1); //used when we want to count the frequency of the elements in string, array,etc
//            if(freqMap.containsKey(i)){
//                freqMap.put(i,freqMap.get(i)+1);
//            }
//            else{
//                freqMap.put(i,1);
//            }
        }
        System.out.println(freqMap);

        String string = "abababhfdslfkdsfbabf";
        int window = 4;
        List<String> result = new ArrayList<>();
        for (int i=0;i<string.length()-window;i++){
            String substr = string.substring(i,i+window);  //window size management->use only when window size is fixed
            result.add(substr);
        }
        System.out.println(result);
    }
}
