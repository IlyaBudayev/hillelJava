package homeWork10_List_Implementation;

import java.util.Iterator;

public class MyIterator implements Iterator {
    private Node current;



public MyIterator (Node head)    {
    current = head;
}
    @Override
    public boolean hasNext() {

        return current != null;
    }

    @Override
    public Object next() {
    Object result = current.getObject();

    if(current.getNext()!=null) {
        current = current.getNext();
    }else {
        throw new IndexOutOfBoundsException();
    }

        return result;
    }
}
