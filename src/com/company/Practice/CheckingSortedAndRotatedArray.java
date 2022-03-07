package com.company.Practice;

import java.util.Scanner;

public class CheckingSortedAndRotatedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        for (int i = 0; i < testCase; i++) {
            int num = sc.nextInt();
            int[] arr = new int[num];
            for (int j = 0; j < num; j++) {
                arr[j] = sc.nextInt();
            }
            if (rotatedSorted(arr, 0, arr.length)) System.out.println("Yes");
            else System.out.println("No");

        }


    }

    private static boolean rotatedSorted(int[] arr, int low, int high) {
        boolean flag = true;
        if (arr[0] > arr[high - 1]) {
            int minIndx = low;
            for (int i = 1; i < high; i++) {
                if (arr[minIndx] > arr[i]) minIndx = i;
            }
            for (int i = 0; i < minIndx - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    flag = false;
                    break;
                }
            }
            for (int i = minIndx; i < high - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    flag = false;
                    break;
                }
            }
        } else {
            int maxIndx = high-1;
            for (int i = 1; i < high; i++) {
                if (arr[maxIndx] < arr[i]) maxIndx = i;
            }
            for (int i = 0; i < maxIndx - 1; i++) {
                if (arr[i] < arr[i + 1]) {
                    flag = false;
                    break;
                }
            }
            for (int i = maxIndx; i < high - 1; i++) {
                if (arr[i] < arr[i + 1]) {
                    flag = false;
                    break;
                }
            }
        }
        return flag;
    }
}
