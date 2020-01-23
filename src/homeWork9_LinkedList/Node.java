package homeWork9_LinkedList;

public class Node {
    private Object object; // Объект
    private  Node next;   // Ссылка на объект

    public Node(Object object, Node next) {
        this.object = object;
        this.next = next;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
