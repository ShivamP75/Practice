package com.company.OOPS;

public class Customer {
    private int id;
    String name;
    int age;

    public void setId(int id){
        this.id = id;
    }
//    public int getId(){
//        return this.id;
//    }

     void displayDetails(){
        System.out.println("ID: " + this.id);
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }
    void payBill(double totalPrice, double discount){
         totalPrice = totalPrice*(1 - discount/100);
        System.out.println("Total price is " + (int)(totalPrice*100) / 100.0);
    }


}
