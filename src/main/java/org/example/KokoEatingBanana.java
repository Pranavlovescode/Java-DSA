package org.example;

import java.util.Arrays;

public class KokoEatingBanana {
    public static boolean canFinish(int[] arr, int k, int h){
        int hour = 0;
        for (int p:arr){
            hour += (p+k -1)/k;
            if(hour>h) return false;
        }
        return hour<=h;
    }
    public static int minEating(int [] arr, int h){
        int low = 1, high = Arrays.stream(arr).max().getAsInt();
        while(low < high){
            int mid = low + (high - low)/2;
            if(canFinish(arr,mid,h)) high = mid;
            else{
                low = mid+1;
            }
        }
        return low;
    }
    public static void main(String[] args) {
        int [] arr = {5,10,15,20};
        int h = 7;
        System.out.println(minEating(arr, h));
    }
}
