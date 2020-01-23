package homeWork7_Collection;



import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;


 class MyContainer implements Collection {

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
                    throw new IndexOutOfBoundsException("oh-oh");
                }
                Object result = objects[index];
                index++;
                return result;
            }
        };
    }

    @Override
    public Object[] toArray() {
        return objects;
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

            int size = size();

            Object[] temp = objects;

            objects = new Object[0];

            for (int i = 0; i < temp.length; i++) {
                if(!temp[i].equals(o)) {
                   add(temp[i]) ;
                }
            }
            return true;

    }

    // New Method to implement retainAll


    @Override
    public boolean addAll(Collection c) {
        for (Object o : c) {
            add(o);
        }
        return true;
    }

    @Override
    public void clear() {
        objects = new Object[0];
    }

    @Override
    public boolean retainAll(Collection c) {

        for (Object o: objects){
            if(!c.contains(o)){
                remove(o);
            }
        }
        return true;
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
