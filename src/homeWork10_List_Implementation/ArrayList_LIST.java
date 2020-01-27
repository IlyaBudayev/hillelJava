package homeWork10_List_Implementation;

import org.jetbrains.annotations.NotNull;

import java.util.*;

public class ArrayList_LIST implements List {

    private Object[] objects=new Object[0];

    @Override
    public int size() {

        return objects.length;
    }

    @Override
    public boolean isEmpty() {
        return size()==0;
    }

    @Override
    public boolean contains(Object o) {
        boolean contain=false;

        for (Object obj: objects) {
            if(obj==(o)){
                contain=true;
                break;
            }

        }

        return contain;
    }

    @NotNull
    @Override
    public Iterator iterator() {
        return new Iterator() {

            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < objects.length;
            }

            @Override
            public Object next() {
                if (index == objects.length) {
                    throw new IndexOutOfBoundsException("");
                }
                Object result = objects[index];
                index++;
                return result;
            }
        };
    }

    @NotNull
    @Override
    public Object[] toArray() {
        Object[]  newObj = objects.clone();
        return newObj;
    }

    @Override
    public boolean add(Object o) {
        int size = size();

        Object[] temp = new Object[size+1];
        for (int i = 0; i <objects.length ; i++) {
            temp[i]=objects[i];
        }
        temp[size]=o;
        objects=temp;

        return true;
    }

    @Override
    public boolean remove(Object o) {

        Object[] temp = objects;

        objects = new Object[0];

        for (int i = 0; i < temp.length; i++) {
            if(!temp[i].equals(o)) {
                add(temp[i]) ;
            }
        }
        return true;
    }

    @Override
    public boolean addAll(@NotNull Collection c) {

        for (Object obj : c){
            add(obj);

        }
        return true;
    }

    @Override
    public boolean addAll(int index, @NotNull Collection c) {
        for (Object obj : c){
            add(index ,obj);
            index++;

        }
        return true;
    }

    @Override
    public void clear() {

        objects = new Object[0];

    }

    @Override
    public Object get(int index) {

        if (size() <= index){
            throw new IndexOutOfBoundsException("");

    }

    return objects[index];
    }

    @Override
    public Object set(int index, Object element) {

        if (size() <= index){
            throw new IndexOutOfBoundsException("");

        }

        return objects[index]=element;
    }

    @Override
    public void add(int index, Object element) {
        int size = size();

        Object[] temp = new Object[size+1];
       // Object[] secondPart = subList(index, size - 1).toArray();
        for (int i = 0; i <temp.length ; i++) {
            if (index==i){
                temp[index]=element;

            }else {

                if(i>index){
                    temp[i] = objects[i-1];
                }else {
                    temp[i] = objects[i];
                }
            }
        }

        objects=temp;

    }

    @Override
    public Object remove(int index) {

        if (size() <= index){
            throw new IndexOutOfBoundsException("");

        }

        Object[] temp = objects;

        objects = new Object[0];

        for (int i = 0; i < temp.length; i++) {
            if(i!=index) {
                add(temp[i]) ;
            }
        }
        return true;

    }

    @Override
    public int indexOf(Object o) {

        for (int i = 0; i < objects.length; i++) {
            if(objects[i].equals(o)) {
               return i;
            }
        }

        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        return -1;
    }

    @NotNull
    @Override
    public ListIterator listIterator() {

        return null;
    }

    @NotNull
    @Override
    public ListIterator listIterator(int index) {
        return null;
    }

    @NotNull
    @Override
    public List subList(int fromIndex, int toIndex) {

         if(objects.length>=fromIndex||objects.length>=toIndex){
             throw new IndexOutOfBoundsException();
         }

         List<Object> newsubList=new ArrayList_LIST();

        for (int i = toIndex; i < fromIndex ; i++) {
            newsubList.add(objects[i]);
        }




        return newsubList;
    }

    @Override
    public boolean retainAll(@NotNull Collection c) {

        for (Object o: objects){
            if(!c.contains(o)){
                remove(o);
            }
        }
        return true;
    }

    @Override
    public boolean removeAll(@NotNull Collection c) {
        for (Object o: c ) {
            remove(o);
        }
        return true;
    }

    @Override
    public boolean containsAll(@NotNull Collection c) {
        for (Object o: c) {
            if(!contains(o)){
                return false;
            }
        }
        return true;
    }

    @NotNull
    @Override
    public Object[] toArray(@NotNull Object[] a) {
        return new Object[0];
    }

    @Override
    public String toString() {
        return "MyContainer{" +
                "objects=" + Arrays.toString(objects) +
                '}';
    }
}
