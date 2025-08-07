package org.example;

import java.util.ArrayList;

public class BasketsAndfruits {
    public static void main(String[] args) {
        int [] fruits = new int[]{4,2,5};
        int [] baskets = new int[]{3,5,4};
        int n = fruits.length;
        int j = 0;
        ArrayList<Integer> track = new ArrayList<>();
        ArrayList<Integer> basket = new ArrayList<>();
        for(int b : baskets){
            basket.add(b);
        }
        for (int i = 0; i < n; i++) {
            while (j < basket.size() && fruits[i] > basket.get(j)) {
                j++;
            }
            if (basket.size() == 1 && fruits[i] > basket.get(j-1)){
                track.add(fruits[i]);
                break;
            }
            basket.remove(basket.get(j));
            j = 0;
        }
        System.out.println(track.size());
    }
}
