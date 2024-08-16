package org.example;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class ArraySum {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length ; j++) {
                if (nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        ArraySum arraySum = new ArraySum();
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] result = arraySum.twoSum(nums,target);
        System.out.println(result);
    }
}