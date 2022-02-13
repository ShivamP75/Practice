package com.company;

public class BackTracking {
    public static void printPermu(String str, String perStr, int indx){
        if(str.length() == 0){
            System.out.println(perStr);
            return;
        }
        for(int i =0;i<str.length();i++){
            char curentChar = str.charAt(i);
            String newStr = str.substring(0,i) + str.substring(i+1);
            printPermu(newStr, perStr + curentChar, indx+1);
        }
    }
    public static void main(String[] args) {
        String str = "ABC";
        printPermu(str, "",0);
    }
}
