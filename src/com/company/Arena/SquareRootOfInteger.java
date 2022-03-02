package com.company.Arena;

import java.util.Scanner;

public class SquareRootOfInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for (int i = 0; i < test; i++) {
            double a = sc.nextInt();
            System.out.println(binarySearch((int)Math.floor(a)));
        }

    }
    public static double binarySearch(int a){
//         if(l > r) return -1;
//         int mid = (l+r)/2;
//         if()
        double b = Math.sqrt(a);
        return b;
    }
}
