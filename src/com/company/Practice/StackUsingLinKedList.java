package com.company.Practice;

public class StackUsingLinKedList {

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }

    static class Stack{
        public static Node head;

        public static boolean isEmpty(){
            if(head == null) return true;
            return false;
        }

        public static void push(int data){
            Node newNode = new Node(data);
            if(head == null) head = newNode;
            else{
                newNode.next = head;
                head = newNode;
            }
        }
        public static int pop(){
            if(head == null){
                return -1;
            }
            else{
                int val = head.data;
                head = head.next;
                return val;
            }
        }
        public static int peak(){
            if(head == null){
                return -1;
            }
            else{
                return head.data;
            }
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        while(!s.isEmpty()){
            System.out.println(s.peak());
            s.pop();
        }
    }
}
