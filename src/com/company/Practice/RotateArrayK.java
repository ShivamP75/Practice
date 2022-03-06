package com.company.Practice;

import java.util.Arrays;

public class RotateArrayK {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int k = -1;
        rotateArray(arr,arr.length, k);
        System.out.println(Arrays.toString(arr));
    }
    public static void rotateArray(int[] arr, int n , int k){
        if(k >= 0){
            k = k%n;
        }
        else{
            k = k + n;
        }
        arraySwap(arr,0,n-k-1);

        arraySwap(arr,n-k,n-1);

        arraySwap(arr,0,n-1);
    }

    public static void arraySwap(int[] arr, int l , int r){
        while(l <= r){
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
    }
}
