package com.company.Practice;

import jdk.swing.interop.SwingInterOpUtils;

public class Recursion {
    public static void main(String[] args) {
    int n = 5;
//    int a = 0;
//    int b = 1;
//    System.out.print(a + " " +b + " ");
//    fib(n,a,b);
//    System.out.println(fact(n));
//    System.out.println(revString("Shivam", "", 5));
//        count(n);
//        int[] array = {1,2,3,4,5,6,9};
//        System.out.println(binarySearch(array,0,array.length-1,8));
        String s = "ABCEA";
        boolean flag = false;
        System.out.println(pelidrome(s,0,s.length()-1, flag));

    }
    public static boolean pelidrome(String s, int i, int j, boolean flag){
        if(i >= j) return flag;
        if(s.charAt(i) != s.charAt(j)){
            flag = false;
        }
        else{
            flag = true;
        }
        return pelidrome(s,i+1,j-1,flag);
    }

    public static int binarySearch(int[] array,int low, int high, int k){
        int mid = (low+high)/2;
        if(low>high){
            return -1;
        }
        if(array[mid] == k){
            return mid;
        }
        else if(array[mid]>k){
            return binarySearch(array, low,mid-1,k);
        }
        else{
            return binarySearch(array,mid+1,high,k);
        }
    }
    public static void count(int n){
        if(n<0) return;
        System.out.println(n);
        count(n-1);
    }
    public static String revString(String s, String newS, int i){
        if(i<0) return newS;
        newS += s.charAt(i);
        return revString(s, newS, i-1);
    }
    public static int fact(int n){
        if(n==0) return 1;
        return n*fact(n-1);
    }
    public static void fib(int n, int a, int b){
    if(n==0) return;
    int temp = b;
    b = a+b;
    a = temp;
    System.out.print(b+" ");
    fib(n - 1, a, b);

    }

}
