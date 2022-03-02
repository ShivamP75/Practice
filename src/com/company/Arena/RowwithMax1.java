package com.company.Arena;

import java.util.Scanner;

public class RowwithMax1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int count = 0;
        int k = 0;
        for (int i = 0; i < n; i++) {
            int max = 0;
            for (int j = 0; j < m; j++) {
                if(arr[i][j] == 1){
                    max++;
                }
            }
            if(max > count) {
                count = max;
                k = i;
            }
        }
        System.out.println(k);

    }
}
