package com.company.Searching;

public class LinearSearch {
    public static void main(String[] args) {
    int[] array = {2,4,6,9,1,3};
    int k = 13;
    int i = 0;
    System.out.println(linearSeach(array, k, i));
    }
    public static int linearSeach(int[] arr, int k, int i){
        if(i==arr.length) return -1;
        if(arr[i] == k) return i;

        return linearSeach(arr,k,i+1);
    }

}
