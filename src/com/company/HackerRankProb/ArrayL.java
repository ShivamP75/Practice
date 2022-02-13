package com.company.HackerRankProb;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayL {
    public static void main(String[] args) {
        ArrayList[] list = new ArrayList[20002];
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            list[i] = new ArrayList();
            int x = sc.nextInt();
            for(int j = 1 ;j<=x;j++){
                int val = sc.nextInt();
                list[i].add(val);
            }
        }
    }
}
