package com.company.Searching;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9};
        int k = 2;
        int low = 0;
        int high = array.length-1;
        System.out.println(binarySearch(array,k,low,high));

    }
    public static int binarySearch(int[] array, int k,int low,int high){
        int mid = (low + high)>>1;
            if (low>high) return -1;
            if(array[mid] == k) return mid;

            if(array[mid]>k){
                return binarySearch(array, k, low, mid-1);
            }
            else{
                return binarySearch(array,k, mid+1,high);
            }
        }
}
