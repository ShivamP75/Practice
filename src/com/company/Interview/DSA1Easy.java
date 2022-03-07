package com.company.Interview;

public class DSA1Easy {
    public static void main(String[] args) {
//        0 2 3 4 5 2 1 0
//        Q1) to check if array is mountain or not.
        int[] arr = {0, 2, 3, 4, 5, 2, 1, 0};

        System.out.println(isMountainArray(arr));

//        Q2) to find length of last word of sentence;
        String s = "I am working in Infosys";
        s.trim();
        String[] str = s.split(" ");
        System.out.println(str[str.length-1].length());


    }

    public static boolean isMountainArray(int[] arr){
        int i = 0;
        while(i+1 < arr.length && arr[i] < arr[i+1] ){
            i++;

        }

        if(i == 0 || i == arr.length-1){
            return false;
        }
        while(i+1 < arr.length && arr[i] > arr[i+1] ){
            i++;

        }
        return i == arr.length-1;
    }
}
