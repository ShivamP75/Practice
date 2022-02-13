package com.company;

class Animal{
    private int legs = 4;
    public int getLegs(){
        return this.legs;
    }

    Animal(){
        System.out.println("Animal Class Construtor");
    }
    String walk() {
        return ("can walk");
    }
}


class Horse extends Animal{
     void print(){
         System.out.println("Horse " + walk() + " on " + getLegs() + " legs");
     }
}
public class Main {

    public static void main(String[] args) {
	// write your code here
        Horse horse = new Horse();
        horse.print();

    }
}
