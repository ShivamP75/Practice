package com.company.HackerRankProb;

public class Pelidrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }
    public static boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        boolean flag = true;
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                flag = false;
                break;

            }
            i++;
            j--;
        }
        return flag;
    }

}
