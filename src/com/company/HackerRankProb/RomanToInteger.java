package com.company.HackerRankProb;

public class RomanToInteger {
    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
    }

    public static int romanToInt(String s) {
        int integer = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i != (s.length() - 1) && charValue(s.charAt(i)) < charValue(s.charAt(i + 1))) {
                integer += charValue(s.charAt(i+1)) - charValue(s.charAt(i));
            }
            else{
                integer += charValue(s.charAt(i));
            }
        }
        return integer;
    }

    public static int charValue(char c) {

        if (c == 'M') return 1000;
        else if (c == 'D') return 500;
        else if (c == 'C') return 100;
        else if (c == 'L') return 50;
        else if (c == 'X') return 10;
        else if (c == 'V') return 5;
        else return 1;

    }
}
