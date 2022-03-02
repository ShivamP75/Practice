package com.company.Arena;

import java.util.HashMap;
import java.util.Scanner;

public class SubArrayWithGivenSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = sc.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }
        subArray(arr, num, sum);
    }

    private static void subArray(int[] arr, int num, int sum) {
        HashMap<Integer, Integer> map = new HashMap<>();

        int start = 0;
        int end = -1;
        int currSum = 0;

        for (int i = 0; i < num; i++) {
            currSum += arr[i];

            if(currSum - sum == 0){
                end = i;
                break;
            }
            if(!map.containsKey(currSum-sum)){
                map.put(currSum, i);
            }
            if(map.containsKey(currSum - sum)){
                end = i;
                start = map.get(currSum-sum) + 1;
            }
        }
        if(end == -1) System.out.println(-1);
        else System.out.println(start + " " + end);
    }
}
