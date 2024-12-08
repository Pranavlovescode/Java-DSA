package org.example.sorting;

import java.util.Arrays;

public class MergeSort {


//    This program is about merge sort using DAC approach.
    public int[] merge(int[] left,int[]right){
        int i = 0;
        int j = 0;
        int k = 0;
        int [] mix = new int[left.length+right.length];
        while(i < left.length && j < right.length){
            if (left[i] < right[j]){
                mix[k] = left[i];
                i++;
            }else{
                mix[k] = right[j];
                j++;
            }
            k++;
        }
        while (i<left.length){
            mix[k] = left[i];
            i++;
            k++;
        }
        while (j<right.length){
            mix[k] = right[j];
            j++;
            k++;
        }
        return mix;
    }

    public int[] mergeSort(int[] arr){
//        This is smaller problem
        int mid = arr.length/2;
        if (arr.length == 1 ){
            return arr;
        }
        else {
            int [] left = mergeSort(Arrays.copyOfRange(arr,0,mid));
            int [] right = mergeSort(Arrays.copyOfRange(arr,mid,arr.length));
            return merge(left,right);
        }
    }

    public static void main(String[] args) {
        MergeSort mergeSort = new MergeSort();
        int[] arr = {45,89,6,8,98,25,15,62};
        int[] ans = mergeSort.mergeSort(arr);
        System.out.println("The sorted array is "+ Arrays.toString(ans));
    }


}
