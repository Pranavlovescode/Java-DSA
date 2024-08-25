package org.example;

public class BinarySearch_Iterative {

    public static int binarySearch(int[] arr,int key){
        int l = 0;
        int r = arr.length-1;
        while(l<=r){
            int mid = (l+r)/2;
            if (arr[mid]==key){
                return mid;
            }
            else if (arr[mid]>key){
                r = mid-1;
            }
            else{
                l = mid+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int [] arr = {12,34,45,56,78,90};
        int key = 45;
        if (binarySearch(arr,key)==-1){
            System.out.println("Element is not present in the given array");
        }
        System.out.println("The "+key+" is found at index "+binarySearch(arr,key));
    }
}
