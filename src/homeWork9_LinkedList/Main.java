package homeWork9_LinkedList;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        MyLinkedList myLinkedList=new MyLinkedList();

        LinkedList originalOne = new LinkedList();



        myLinkedList.add(1);
        myLinkedList.add(2);
        myLinkedList.add(3);
        myLinkedList.add(4);

        MyLinkedList arr = new MyLinkedList();
        arr.add(345);
        arr.add(4);
        arr.add(8);
        arr.add(15);


        myLinkedList.addAll(arr);

        print(myLinkedList);

        print(myLinkedList.size()); // - size


        myLinkedList.removeAll(arr);
        print(myLinkedList);

        print(myLinkedList.contains(2));
        print(myLinkedList.contains(5));


        print(myLinkedList.containsAll(myLinkedList));

        print(myLinkedList.containsAll(arr));


        myLinkedList.retainAll(arr);

        print(myLinkedList);







    }

    private static void print(Object o) {
        System.out.println(o);
    }

}
