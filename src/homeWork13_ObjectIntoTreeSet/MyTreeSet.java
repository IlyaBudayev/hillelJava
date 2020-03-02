package homeWork13_ObjectIntoTreeSet;

import org.jetbrains.annotations.NotNull;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public class MyTreeSet implements Set {

    private Node root;

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        if (root.getData().equals(o)){

            return true;
        }
        return searchRecuresively(root, o);
    }

    private boolean searchRecuresively(Node treeRoot, Object o){
        Student objStudent = (Student) o;

        Student  currentInt = (Student) treeRoot.getData();

        if( objStudent.compareTo(currentInt)>0 ){
            if(treeRoot.getRight()==null){
                return false;
            }else if (treeRoot.getRight().getData()==(o)){
                return true;
            }

                return    searchRecuresively(treeRoot.getRight(),o);

        }else if(objStudent.compareTo(currentInt)<0) {
             if(treeRoot.getLeft()==null){
                return false;
            } else if (treeRoot.getLeft().getData()==o){
                 return true;
             }
            return    searchRecuresively(treeRoot.getLeft(),o);
        }
        return false;
    }

    @NotNull
    @Override
    public Iterator iterator() {
        return null;
    }

    @NotNull
    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public boolean add(Object o) {
        Node node = new Node(o);

        if (root ==null){
            root = node;
            return true;
        }

        return addRecursivelyToTree(root, o);
    }

    private boolean addRecursivelyToTree(Node treeRoot, Object o){
        Student anotherStud = (Student) o;

        Student thisStud = (Student) treeRoot.getData();

        if(anotherStud.compareTo(thisStud)>0){
            if (treeRoot.getRight()==null){
                treeRoot.setRight(new Node(o));
                return true;
            }

            return    addRecursivelyToTree(treeRoot.getRight(),o);
        }else if(anotherStud.compareTo(thisStud)<0) {
            if (treeRoot.getLeft()==null){
                treeRoot.setLeft(new Node(o));
                return true;
            }
            return    addRecursivelyToTree(treeRoot.getLeft(),o);
        }
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean addAll(@NotNull Collection c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean removeAll(@NotNull Collection c) {
        return false;
    }

    @Override
    public boolean retainAll(@NotNull Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(@NotNull Collection c) {
        return false;
    }

    @NotNull
    @Override
    public Object[] toArray(@NotNull Object[] a) {
        return new Object[0];
    }

    public static class Node{
        private Object data;
        private  Node node, left, right;

        public Node getRight() {
            return right;
        }

        public void setRight(Node right) {
            this.right = right;
        }

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return data;
        }

        public void setData(Object data) {
            this.data = data;
        }

        public Node getNode() {
            return node;
        }

        public void setNode(Node node) {
            this.node = node;
        }

        public Node getLeft() {
            return left;
        }

        public void setLeft(Node left) {
            this.left = left;
        }
    }

//    @Override
//    public String toString() {
//        String result = "[";
//
//        Node current = root; // Перебор значнений от головы до хвоста!
//        while (current!=null){
//            result += current.getData()+", ";
//            current=current.getRight();
//
//        }
//
//        return result  + "]";
//    }


    public void print(){
        if(root==null){
            System.out.print("[]");
            return;
        }
        printInternal(root);
    }

    private void printInternal(Node node){
        if(node.getLeft()!=null){
            printInternal(node.getLeft());
        }
        System.out.print(node.getData()+", ");
        if(node.getRight()!=null){
            printInternal(node.getRight());
        }
    }

    public static class Main{public static void main(String[] args) {

        MyTreeSet set = new MyTreeSet();

        set.add(5);
        set.add(8);
        set.add(4);
        set.add(9);
        set.add(7);
        set.add(2);

        System.out.println(set.contains(5));
        System.out.println(set.contains(18));

    }}
}
