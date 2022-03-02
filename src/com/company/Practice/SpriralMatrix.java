//package com.company.Practice;
//
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class SpriralMatrix {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int[][] twoDArray = new int[3][3];
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                twoDArray[i][j] = sc.nextInt();
//            }
//        }
//        System.out.println(spiralArray(twoDArray));
//
//
//
//    }
//
//    private static ArrayList spiralArray(int[][] twoDArray) {
//        ArrayList<Integer> spiralArr = new ArrayList<>();
//        int sr = 0,sc=0,er=twoDArray.length-1,ec = twoDArray[0].length-1;
//        int count = 0;
//        int total = twoDArray.length * twoDArray[0].length;
//        while(count < total){
//            for (int i = sc; i < ec; i++) {
//                spiralArr.add(twoDArray[sr][i]);
//                count++;
//
//            }
//            sr++;
//            for (int i = sr; i < er; i++) {
//                spiralArr.add(twoDArray[ec][i]);
//            }
//
//            }
//        }
//        return spiralArr;
//    }
//}
