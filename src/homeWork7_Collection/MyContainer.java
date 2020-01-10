package homeWork7_Collection;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;


public class MyContainer implements Collection {

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

        for (Object obj: objects
             ) {
            if(obj.equals(o)){
                contain=true;
            }

        }

        return contain;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
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
        if(contains(o)) {
            int size = size();

            Object[] temp = objects;

            objects = new Object[size - 1];

            for (int i = 0; i < temp.length; i++) {
                if(!temp[i].equals(o)) {
                    objects[i] = temp[i];
                }
            }


            return true;
        }else return false;
    }

    // New Method to implement retainAll
    private boolean retain (Object o) {
        if(contains(o)) {
            int size = size();

            Object[] temp = objects;

            objects = new Object[size - 1];

            for (int i = 0; i < temp.length; i++) {
                if(temp[i].equals(o)) {
                    objects[i] = temp[i];
                }
            }


            return true;
        }else return false;
    }

    @Override
    public boolean addAll(@NotNull Collection c) {
        try {
            for (Object o : c) {

                add(o);
            }
        }catch (Throwable e){
            System.out.println(e);
        }

        return true;
    }

    @Override
    public void clear() {
        objects = new Object[0];
    }

    @Override
    public boolean retainAll(Collection c) {
        for (Object o: c ) {
            if(c == null){
                continue;
            }
            retain(o);
        }
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {

        for (Object o: c ) {
            remove(o);
        }
        return true;
    }

    @Override
    public boolean containsAll(Collection c) {
        for (Object o: c) {
            if(!contains(o)){
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
        return "MyContainer{" +
                "objects=" + Arrays.toString(objects) +
                '}';
    }
}
