package com.company.Practice;

public class SearchElementRotatedSortedArray {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 8, 1, 2, 3};
        int key = 3;

        System.out.println(bSearch(arr, 0, arr.length-1, key));
    }

    public static int bSearch(int[] arr, int low, int high, int k) {
        int mid = (low + high)/2;

        if(low > high) return -1;

        if(arr[mid] == k) return mid;
//      4, 5, 6, 8, 1, 2, 3
        else if(arr[low] < arr[mid]){
            if(arr[mid] > k  && k >= arr[low]) {
                return bSearch(arr, low, mid - 1, k);
            }
            else{
               return  bSearch(arr,mid+1,high, k);
            }
        }
        else{
            if(arr[mid] < k && k <= arr[high]){
                return bSearch(arr,mid+1, high, k);
            }
            else{
                return bSearch(arr,low, mid-1, k);
            }
        }

    }
}
