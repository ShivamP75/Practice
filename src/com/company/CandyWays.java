package com.company;

import java.util.Scanner;

public class CandyWays {
    static int mod = 1000000007;
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int a = sc.nextInt();
        int b = sc.nextInt();
        long sum = ((n*(n-1)/2));
        System.out.println(sum);

    }
}
