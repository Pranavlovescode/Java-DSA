package org.example;

import java.util.HashMap;

public class Maps {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
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
    }
}
