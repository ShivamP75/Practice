package com.company;

public class ModuleInverse {
    public static void main(String[] args) {
        System.out.println(moduleInver(5,7));
    }
    public static int moduleInver(int a,  int m){
        for(int i =1;i<m-1;i++){
            if(((a*i)%m == 1)) return i;
            }
        return -1;
    }
}
