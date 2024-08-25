package org.example;

public class BinarySearch_Recursive {
    public static int RBinarySearch(int l , int h, int key, int[] arr){
        if (l==h){
            if (arr[l]==key){
                return l;
            }
            else return -1;
        }
        else {
            int mid = (l+h)/2;
            if (key == arr[mid]){
                return mid;
            }
            else if(key>arr[mid]){
                return RBinarySearch(mid+1, h,key,arr);
            }
            else return RBinarySearch(l,mid-1,key,arr);
        }
    }

    public static void main(String[] args) {
        int [] arr = {12,34,45,56,78,90};
        int key = 78;
        System.out.println("The "+key+" is found at index "+RBinarySearch(0,arr.length-1,key,arr));
    }
}
