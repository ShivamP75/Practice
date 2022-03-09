package DataStructure.LinkedList;

//public class LinkedList {
//
//    public class Node {
//        int data;
//        Node next;
//
//        Node(int data) {
//            this.data = data;
//            this.next = null;
//        }
//    }
//
//    Node head;
//    int size = 0;
//
//    public Node insert(int data) {
//        Node node = new Node(data);
//        if (this.head == null) {
//            this.head = node;
//
//        } else {
//            Node i = this.head;
////              0    1   2    3    4
////            1    2   3    4    5   node
////            head
////            i    i   i    i    i   i
//            while (i.next != null) {
//                i = i.next;
//            }
//            i.next = node;
//        }
//        size++;
//        return node;
//    }
//
//    public Node insertAtFirst(int data) {
//        Node node = new Node(data);
//        Node i = this.head;
//        head = node;
//        node.next = i;
//        size++;
//        return node;
//
//    }
//
//    public Node remove() {
//        if (size == 0) return null;
//        else if (size == 1) {
//            Node a = head;
//            this.head = null;
//            size--;
//            return a;
//        } else {
//            int i = 0;
//            Node secondLast = this.head;
//            while (i < this.size - 2) {
//                i++;
//                secondLast = secondLast.next;
//            }
//            Node ans = secondLast.next;
//            secondLast.next = null;
//            size--;
//            return ans;
//        }
//    }
//    public Node removeAtFirst(){
//        if(size == 0) return null;
//        else if(size == 1){
//            Node a = this.head;
//            head = null;
//            size--;
//            return a;
//        }
//        else{
//            this.head = head.next;
//            size--;
//            return head;
//        }
//    }
//
//    public void display() {
//        Node i = head;
//        while (i != null) {
//            System.out.print(i.data + " - > ");
//            i = i.next;
//        }
//        System.out.println("Null");
//    }
//
//}


public class LinkedList {

    public class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    private Node head;
    private int size;

    public Node insert(int data) {
        Node node = new Node(data);
        if (head == null) {
            this.head = node;
            size++;
            return this.head;
        } else {
            Node i = this.head;
            while (i.next != null) {
                i = i.next;
            }
            i.next = node;
            size++;
            return node;
        }
    }

    public Node insertAtFirst(int data) {
        Node node = new Node(data);
        if (size == 0) {
            this.head = node;
            return node;
        } else {
            Node i = this.head;
            this.head = node;
            node.next = i;
            size++;
            return node;
        }
    }

    public Node remove() {
        if (size == 0) return null;
        if (size == 1) {
            Node i = this.head;
            this.head = null;
            size--;
            return i;
        } else {
            int i = 0;
            Node a = this.head;
            while (i < size - 2) {
                i++;
                a = a.next;
            }
            Node k = a.next;
            a.next = null;
            size--;
            return k;
        }
    }

    public void removeFirst() {
        if (size == 0) return;
        else {
            this.head = this.head.next;
            size--;
            return;
        }
    }

    public void updateAt(int indx, int data) {
        if (indx < 0 || indx >= size) {
            System.out.println("Invalid Index");
            return;
        } else {
            int i = 0;
//            5 7 9
//              a
//            i
            Node a = this.head;
            while (i < indx) {
                i++;
                a = a.next;
            }
            a.data = data;
        }
    }

    public void insertAt(int indx, int data) {
        Node node = new Node(data);
        int i = 0;
        Node a = this.head;
        while (i < indx - 1) {
            i++;
            a = a.next;
        }
        Node b = a.next;
        a.next = node;
        node.next = b;
        size++;
    }

    public void removeAt(int indx) {
        if (indx == 0) {
            this.head = this.head.next;
            size--;
        } else {
            int i = 0;
            Node a = this.head;
            while (i < indx - 1) {
                a = a.next;
                i++;
            }

            Node b = a.next;
            a.next = b.next;
            b = null;
            size--;
        }
    }
    public int getAt(int indx){
        int i = 0;
        Node a = this.head;
        while(i < indx){
            i++;
            a = a.next;
        }
        return a.data;
    }

    public int getMid(){
        Node i = this.head;
        Node j = this.head;
        while(j != null && j.next != null){
            i = i.next;
            j = j.next.next;
        }
        return i.data;
    }

    public void display() {

        Node i = this.head;
        while (i != null) {
            System.out.print(i.data + " - > ");
            i = i.next;
        }
        System.out.println("Null");
    }

    public int getSize() {
        return this.size;
    }
}
