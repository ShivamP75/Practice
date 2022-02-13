package com.company.Arena;

import java.util.Scanner;

public class ArrayInsertAtEnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i <t ; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int[] array1 = new int[a];
            for (int j = 0; j < array1.length; j++) {
                array1[j] = sc.nextInt();
            }
            int[] array2 = new int[a+1];
            for (int j = 0; j < array1.length; j++) {
                array2[j] = array1[j];
            }
            array2[array1.length] = b;
            for(int k : array2){
                System.out.print(k + " ");
            }

        }
    }

}
