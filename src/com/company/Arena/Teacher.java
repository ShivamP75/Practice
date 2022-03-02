package com.company.Arena;

import java.util.Arrays;
import java.util.Scanner;

public class Teacher {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }
        int[] arr1 = new int[num];
        int k = 0;
        int j = 1;

        for (int i = 0; i < num; i++) {
            k = arr[i];
            arr1[k-1] = j;
            j++;
        }
        System.out.println(Arrays.toString(arr1));
    }
}
