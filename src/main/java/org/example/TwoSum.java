package org.example;

import java.util.Arrays;

class T {
    int t;
}

public class TwoSum{
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        int i = 0, j = n-1;
        while(i<j){
            int sum = numbers[i]+numbers[j];
            if(sum == target){
                return new int[]{i + 1, j + 1};
            }
            else if(sum < target) {
                i++;
            }
            else{
                j--;
            }
        }
        return new int[]{-1,-1};
    }

    public static void main(String[] args) {
        TwoSum ts = new TwoSum();
        int[] arr = ts.twoSum(new int[]{2,7,11,15},9);
        System.out.println(Arrays.toString(arr));
//        char[] array = {'a','b','c'};
//        String s = new String(array);
//        System.out.println(s);
//        for(int i = 2; i<=20; --i){
//            System.out.println(i);
//        }
//        byte b = 50;
//        b = b*50;
//        System.out.println(b);
        int a = 5;
        int b = ++a;
        System.out.println(b);
        assert (a>5):"assertion failed";
        System.out.println("finished");

        T t1 = new T();
        System.out.println(t1.t);

    }
}
