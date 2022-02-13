package com.company.Arena;

import java.util.Scanner;

public class Buildings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        int count = 1;
//        n = 5, i = 0,1  i = 1,2 , i=2,3, i = 4, 5;
        for (int i = 0; i < n-1; i++) {
            if(array[i+1] >= array[i]) {
                count++;
                if(i+1 == n){
                    count++;
                }
            }
            else break;
        }
        System.out.println(count);
    }
}
