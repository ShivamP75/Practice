package com.company.Arena;

import java.util.HashMap;
import java.util.Map;

public class CountDulicate {
    public static void main(String[] args) {
        int[] array = {1,2,3,1,1,3};
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int i = 0; i < array.length ; i++) {
            if(freq.containsKey(array[i])) freq.put(array[i],freq.get(array[i]) + 1);
            else freq.put(array[i],1);
        }
        System.out.println(freq);
        for(Map.Entry<Integer, Integer> entry : freq.entrySet()){
            if(entry.getValue()>1){
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        }
    }

}
