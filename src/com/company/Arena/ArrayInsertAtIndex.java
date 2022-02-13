package com.company.Arena;

import java.util.Scanner;

public class ArrayInsertAtIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int[] array1 = new int[a];
            for (int j = 0; j < a; j++) {
                if(j==c){
                    array1[j] = b;
                }
                else
                {
                    array1[j] = sc.nextInt();
                }
            }
           for(int k : array1){
               System.out.print(k + " ");
           }
        }
        System.out.println();
    }
}
