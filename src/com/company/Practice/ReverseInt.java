package com.company.Practice;

import java.util.Scanner;

public class ReverseInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int num1 = 0;
        while (num != 0) {
            int reminder = num % 10;
            num1 = num1 * 10 + reminder;
            num /= 10;
        }
        System.out.println(num1);
    }
}
