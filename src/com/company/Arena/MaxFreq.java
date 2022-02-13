package com.company.Arena;

import java.util.HashMap;
import java.util.Map;

public class MaxFreq {
    public static void main(String[] args) {
        int[] array = {1,2,3,1,1,3,3};
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int i = 0; i < array.length ; i++) {
            if(freq.containsKey(array[i])) freq.put(array[i],freq.get(array[i]) + 1);
            else freq.put(array[i],1);
        }
        int max = 0;
        for(Map.Entry<Integer, Integer> entry : freq.entrySet()){
            if(entry.getValue()>max){
                max = entry.getValue();
            }
        }
        int max1 = 0;
        for(Map.Entry<Integer, Integer> entry : freq.entrySet()){
            if(entry.getValue() == max){
                if(entry.getKey() > max1) max1 = entry.getKey();
            }
        }
        System.out.println(max1);
    }
}
