package com.company;

import java.util.Arrays;

public class PrimeSieve {
    public static void main(String[] args) {
        int n = 100;
        int count = 0;
        boolean[] arr = prime(n);
        for (int i = 0; i <=n; i++) {
            if(arr[i]){
                count +=1;
            }
        }
        System.out.println(count);
    }
    public static boolean[] prime(int n){
        boolean[] array = new boolean[n+1];
        Arrays.fill(array, true);
        array[0] = false;
        array[1] = false;
        for(int i = 2;i*i<=n;i++){
            for(int j = i*2;j<=n;j+=i){
                array[j] = false;
            }
//            2,3,4,5,6,7,8,9,10
//                j   j   j j  j
        }
        return array;
    }
}
