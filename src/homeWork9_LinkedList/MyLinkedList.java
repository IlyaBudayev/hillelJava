package homeWork9_LinkedList;


import java.util.Collection;
import java.util.EmptyStackException;
import java.util.Iterator;

public class MyLinkedList implements Collection {

    private Node head;

    private int cacheSize=0; //кешированыый размера списка


    @Override
    public int size() {

        return cacheSize;
    }

    @Override
    public boolean isEmpty() {

        return head.getNext()==null;
    }

    @Override
    public boolean contains(Object o) {

        Object[] arr = toArray();
        if(!isEmpty()){
            for (int i = 0; i <cacheSize ; i++) {
                if(arr[i]==o){
                    return true;
                }
            }

        }else{
            throw new EmptyStackException();
        }


        return false;
    }

    @Override
    public Iterator iterator() {
        return iterator();
    }

    @Override
    public Object[] toArray() {

        Object[] result = new Object[cacheSize];
        int i = 0;

        for ( Node node = head ; node != null; node = node.getNext()) {
            result[i++] = node.getObject();
        }
        return result;

    }


    @Override
    public boolean add(Object o) {
        Node node = new Node(o,null);

        if(head==null){
            head=node;
            cacheSize=1;
            return true;
        }else {
            Node current = head; // Перебор значнений от головы до хвоста!
            while (current.getNext()!=null){
                current = current.getNext();
            }
            current.setNext(node); // Вставляем новый последний элемент
            cacheSize++;
        }
        return true;
    }

    @Override
    public boolean remove(Object o) {
        if(o == null){
            return false;
        }
        if(head == null){ // To avoid null pointer exeception
            return false;
        }
        if(head.getObject().equals(o)){

            head = head.getNext();
            cacheSize--;
            return true;
        }

        Node prev;
        Node current = head;

        while(current.getNext()!=null){
            prev = current;
            current=current.getNext();
            if (current.getObject().equals(o)) {
                prev.setNext(current.getNext()); // сцепка из 101 в  1_1
                cacheSize--;
                return true;
            }
        }


        return false;
    }

    @Override
    public boolean addAll(Collection c) {

        Object[] cc=c.toArray();

        for (int i = 0; i < cc.length ; i++) {
            add(cc[i]);
        }


        return true;
    }

    @Override
    public void clear() {
        cacheSize=0;
        head.setNext(null);
    }

    @Override
    public boolean retainAll(Collection c) {
        Object[] cc=c.toArray();
        Object[] myArr = toArray();

        for (int i = 0; i < cacheSize ; i++) {
            if(!c.contains(myArr[i])){
                remove(myArr[i]);
            }
        }

        return true;
    }

    @Override
    public boolean removeAll(Collection c) {
        Object[] cc=c.toArray();

        for (int i = 0; i < cc.length ; i++) {
            remove(cc[i]);
        }

        return true;
    }

    @Override
    public boolean containsAll(Collection c) {

        Object[] arr = c.toArray();

        for (int i = 0; i <arr.length ; i++) {
            if(!contains(arr[i])){
                return false;
            }
        }


        return true;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }

    @Override
    public String toString() {
        String result = "[";

        Node current = head; // Перебор значнений от головы до хвоста!

        while (current!=null){
            result += current.getObject()+", ";
            current=current.getNext();

        }

        return result  + "]";
    }
}
