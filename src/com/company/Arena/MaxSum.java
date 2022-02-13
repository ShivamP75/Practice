package com.company.Arena;

import java.util.Scanner;

public class MaxSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            int k = sc.nextInt();
            if(k<0) continue;
            array[i] = k;
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += array[i];
        }
        System.out.println(sum);
    }
}
