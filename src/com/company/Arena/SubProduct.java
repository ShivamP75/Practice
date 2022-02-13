package com.company.Arena;

import java.util.Scanner;

public class SubProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println(product(array, n));
    }
    public static int product(int[] array, int n){
        if(n == 1) return 1;
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if(array[i] * array[j] > 0) count++;
            }
        }
        return  count;
    }
}
