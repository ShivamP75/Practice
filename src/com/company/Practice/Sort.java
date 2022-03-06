package com.company.Practice;

import java.util.Arrays;


public class Sort {
    public static void main(String[] args) {

        int[] arr = {3, 1, 5, 2, 4};

//        System.out.println(Arrays.toString(bubbleSort(arr, arr.length)));
//        System.out.println(Arrays.toString(selectionSort(arr, arr.length)));
//        System.out.println(Arrays.toString(insertionsSort(arr, arr.length)));
        System.out.println(Arrays.toString(mergeSort(arr, 0, arr.length-1)));
    }

    public static int[] mergeSort(int arr[], int l, int r) {
        // Your code here
        if (l >= r) {
            int[] res = new int[1];
            res[0] = arr[l];
            return res;
        }

        int mid = (l + r) / 2;
        int[] lArr = mergeSort(arr, l, mid);
        int[] rArr = mergeSort(arr, mid + 1, r);
        return mergeTwoSortedArray(lArr, rArr);
    }

    private static int[] mergeTwoSortedArray(int[] lArr, int[] rArr) {
        int lenLArr = lArr.length;
        int lenRArr = rArr.length;
        int i = 0;
        int j = 0;
        int[] arr = new int[lenLArr + lenRArr];
        for (int k = 0; k < (lenLArr + lenRArr); k++) {
            if (i != lenLArr && j != lenRArr) {
                arr[k] = (lArr[i] > rArr[j]) ? rArr[j++] : lArr[i++];
            }
            else if (i < lenLArr) arr[k] = lArr[i++];
            else {
                arr[k] = rArr[j++];
            }
        }
        return arr;
    }

//    private static int[] insertionsSort(int[] arr, int length) {
//        for (int i = 0; i <length; i++) {
//            int current = arr[i];
//            int j = i - 1;
//            while (j >= 0 && arr[j] > current) {
//                arr[j+1] = arr[j];
//                j--;
//            }
//            arr[j+1] = current;
//        }
//        return arr;
//    }

//    private static int[] selectionSort(int[] arr, int n) {
//        for (int i = 0; i < n-1; i++) {
//            int min = arr[i];
//            int k = i;
//            for (int j = i+1; j < n; j++) {
//                if(min > arr[j]){
//                    min = arr[j];
//                    k = j;
//                }
//            }
//            swap(arr,i,k);
//        }
//        return arr;
//    }

//    private static int[] bubbleSort(int[] arr, int n) {
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n - 1; j++) {
//                if (arr[j] > arr[j + 1]) swap(arr, j, j + 1);
//            }
//        }
//        return arr;
//    }


    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
