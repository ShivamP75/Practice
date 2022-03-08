package com.company.OOPS;

import java.beans.Customizer;
import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        Customer cust = new Customer();
        cust.name = "Shivam";
        cust.setId(1);
        cust.age = 25;
        cust.displayDetails();
        cust.payBill(100, 5);

    }
}


