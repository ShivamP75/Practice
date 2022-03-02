package com.company.Arena;

import java.util.Scanner;

public class SeasonOfLOVE {
    public static void main(String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int j = 2;
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if(i == 1){
                continue;
            }
            if (j % i == 0) {
                j = j + 3;
                count++;
            }

        }
        System.out.println(count);
    }
}
