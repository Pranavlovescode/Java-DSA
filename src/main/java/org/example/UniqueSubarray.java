package org.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class UniqueSubarray {
    public static void main(String[] args) {
        int [] nums = new int[]{187,470,25,436,538,809,441,167,477,110,275,133,666,345,411,459,490,266,987,965,429,166,809,340,467,318,125,165,809,610,31,585,970,306,42,189,169,743,78,810,70,382,367,490,787,670,476,278,775,673,299,19,893,817,971,458,409,886,434};
        Set<Integer> arr = new HashSet<>();

        int i =0,j=0,sum = 0, maxVal = Integer.MIN_VALUE;

        while(j < nums.length){
            while(arr.contains(nums[j])){
                sum -= nums[i];
                arr.remove(nums[i]);
                i++;
            }
            arr.add(nums[j]);
            sum += nums[j];
            maxVal = Math.max(sum,maxVal);
            j++;
        }
        System.out.println(maxVal);
    }
}
