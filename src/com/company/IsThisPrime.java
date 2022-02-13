package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class IsThisPrime {
    static int MOD = 1000000007;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        long n = sc.nextLong();
        boolean[] array = prime(x);
        ArrayList<Integer> primeNumbers = new ArrayList<>();
//        Prime numbers which are divisor of x.
        for(int i =2;i<x;i++){
            if(array[i] == true){
                if(x%i == 0) {
                    primeNumbers.add(i);
                }
            }
        }

        int mul = 1;
        for(int k = 1;k<=n;k++){
            for (int i : primeNumbers) {
                int max = 0;
                for (int j = 1; j < Math.pow(n, 3); j++) {
                    int pow = (int) Math.pow(i, j);
                    if (k % pow == 0) {
                        if (pow > max) {
                            max = pow;
                        }
                    }
                }
                if (max > 0) {
                    mul = ((mul%MOD)*(max%MOD))%MOD;
                }
            }

        }
        System.out.println(mul);
    }
//    Calculating prime numbers till x.
    public static boolean[] prime(int x){
        boolean[] array = new boolean[x+1];
        Arrays.fill(array, true);
        array[0] = false;
        array[1] = false;
        for(int i = 2;i*i<=x;i++){
            for(int j = i*2;j<=x;j+=i){
                array[j] = false;
            }
//            2,3,4,5,6,7,8,9,10
//                j   j   j j  j
        }
        return array;
    }
}
