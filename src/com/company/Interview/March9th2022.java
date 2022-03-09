package com.company.Interview;

import java.util.Arrays;

public class March9th2022 {
    //    public static void main(String[] args) {
//        int[] arr = {7, 5, 6, 2, 3, 1};
//        int max = -1;
//
//        int[] arr1 = new int[arr.length];
//        arr1[arr.length-1] = max;
//        for (int i = arr.length-1; i > 0; i--) {
//            if(arr[i] > max) max = arr[i];
//            arr1[i-1] = max;
////            i = arr.lenth - 1 = 5
//
//        }
//        System.out.println(Arrays.toString(arr1));
//    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3 ,5 ,6 , 6, 6, 7};
        int k = 6;
        int l = 0;
        int r = arr.length-1;
        int i = -1;
        while(l < r){
            int mid = (l  + r )/2;

            if(arr[mid] >= k){
                r = mid - 1;

            }
            else{
                l = mid+1;
                i = l;
            }
        }
        System.out.println(i);
    }

}
