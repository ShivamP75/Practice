package com.company.Arena;

import java.util.Arrays;
import java.util.Scanner;

public class MaxMinInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for (int i = 0; i < test; i++) {
            int n = sc.nextInt();
            int[] array = new int[n];
            for (int j = 0; j < n; j++) {
                array[j] = sc.nextInt();
            }
            int max = array[0];
            int min = array[0];
            for (int j = 1; j < n; j++) {
                if(array[j]>max) max = array[j];
                if(array[j]<min) min = array[j];
            }
            System.out.println(max + " " + min);
        }
    }
}
