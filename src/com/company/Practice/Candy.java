package com.company.Practice;

import java.util.Scanner;

public class Candy {
    static int count = 0;
    static int MOD = 1000000007;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = "";
        for (int i = 1; i <=n ; i++) {
            s += i;
        }
        int a = sc.nextInt();
        int b = sc.nextInt();
        candyWays(s, 0,"", a ,b);
        System.out.println((count-1)%MOD);
    }
    public static void candyWays(String s,int i, String curr, int a, int b){
        if(i==s.length()){
            if(curr.length() == a || curr.length() == b){
            }
            else{
                count++;
            }
            return;
        }
        candyWays(s,i+1,curr + s.charAt(i),a, b);
        candyWays(s,i+1, curr, a, b);
    }
}
