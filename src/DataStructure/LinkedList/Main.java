package DataStructure.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.insert(5);
        ll.insert(7);
        ll.insert(9);
        ll.insert(11);
        ll.insert(13);
//        ll.display();
        ll.insertAtFirst(1);
//        ll.insertAtFirst(0);
//        ll.remove();
        ll.display();
//        ll.remove();
//        ll.display();
        ll.removeFirst();
//        ll.display();
//        ll.removeAtFirst();
        ll.display();
        ll.updateAt(3, 100);
        ll.display();
        ll.insertAt(2, 8);
        ll.display();

        ll.removeAt(1);
        ll.display();


       ll.insert(15);
       ll.display();

        System.out.println(ll.getMid());


        System.out.println(ll.getSize());
    }
}
