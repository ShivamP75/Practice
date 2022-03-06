package com.company.Practice;

import java.util.Arrays;
import java.util.Scanner;

public class QuickSort {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        quickSort(arr, 0, n-1);
        System.out.println(Arrays.toString(arr));
    }

    private static void quickSort(int[] arr, int l, int r) {

        if(l > r) return;

        int pivotIndx = partition(arr, l , r);

        quickSort(arr, l , pivotIndx-1);
        quickSort(arr, pivotIndx+1, r);
    }
    public static int partition(int[] arr, int l, int r){
        int pivot = arr[r];

        int i = l;
        int j = l;
        while(i <= r){
            if(arr[i] <= pivot){
                if(i!=j) swap(arr,i,j);
                j++;
            }
            /*
            pivot= 4
            3 1 5 2 4
            0 1 2 3 4
            i 3
            j 2
            3 1 2 4 5
            i = 5
            j = 4
             */
            i++;
        }
        return j-1;
    }
    public static void swap(int[] arr, int i, int minIdx) {
        int temp = arr[i];
        arr[i] = arr[minIdx];
        arr[minIdx] = temp;
    }
}
