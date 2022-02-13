package com.company;

import java.util.Scanner;

public class Factorial {
    static int mod = 1000000007;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        long sum = 0;
        long factOfN = fact(n);
        for(int i = 1;i<=n;i++) {
            if(i == a || i == b) continue;
            sum += (factOfN/(fact(i)*fact(n-i)));
        }
        System.out.println(sum%mod);
    }
    public static long fact(int n){
        int mul = 1;
        for(int i = 1; i <= n; i++)
        {
            mul = mul * i;
        }
        return mul;
    }
}
