package com.company.Arena;

import java.util.ArrayList;
import java.util.Scanner;

public class Permutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int j = 0; j < n; j++) {
            String s = sc.next();
            ArrayList<Integer> arrayList = new ArrayList<>();
            ArrayList<Integer> arrayList1 = per(arrayList, s, "", 0);
            boolean flag = false;
            for (Integer integer : arrayList1) {
                if (integer % 8 == 0) {
                    flag = true;
                    break;
                }
            }
            if (flag) System.out.println("Yes");
            else System.out.println("No");
        }
    }
    public static ArrayList<Integer> per(ArrayList<Integer> arrayList, String str, String perStr, int ind){
        if(str.length() == 0){
            arrayList.add(Integer.parseInt(perStr));
            return arrayList;
        }
        for(int i =0;i<str.length();i++){
            char currentChar = str.charAt(i);
            String newStr = str.substring(0,i) + str.substring(i+1);
            per(arrayList,newStr, perStr + currentChar, ind+1);

        }
        return arrayList;
    }
}
