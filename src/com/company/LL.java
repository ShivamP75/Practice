package com.company;

public class LL {
    Node head;
    class Node{
        String data;
        Node next;
        Node(String data){
            this.data = data;
            this.next = null;
        }
    }
    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public void printList(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }

    }
    public static void main(String[] args) {
        LL list = new LL();

    }
}
