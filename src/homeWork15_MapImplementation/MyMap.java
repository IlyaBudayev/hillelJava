package homeWork15_MapImplementation;


import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.*;

public class MyMap implements Map {
    private int capacity = 10;
    private Entry[] array = new Entry[capacity];


    public MyMap() {
    }

    @Override
    public int size() {
        return array.length;
    }

    @Override
    public boolean isEmpty() {
        return array.length==0;
    }

    @Override
    public boolean containsKey(Object key) {
    int hash = index(key);
        if(size()>0&& size()>= index(key)) {
            if (array[hash] != null) {
                if (array[index(key)].key.equals(key)) {
                    return true;
                }
            }
        }

        return false;
    }

    @Override
    public boolean containsValue(Object value) {

        if(size()>0){
            for (Entry current: array
                 ) {

                if (current!=null) {
                    if (current.value.equals(value)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override
    public Object get(Object key){

        int hash  = index(key);
        if(array[hash]!=null){
            Entry current = array[hash];
            while (true){
                if(current.key.equals(key)){
                    return current.value;
                }
                if(current == null){
                    return null;
                }
                current = current.next;
            }
        }
        return array[hash].value;
    }


    @Nullable
    @Override
    public Object put(Object key, Object value) {


        Entry entry = new Entry(key, value);

        int number = index(key);

        add(entry, number);

        return true;
    }

    public boolean add(Entry o, int index) {

        //  int size = array.length+1;
        Entry[] temp = new Entry[capacity];

        temp = array;

        temp[index]=o;

        array=temp;
        //    capacity=size;
        return true;
    }

    @Override
    public Object remove(Object key) {
        return null;
    }

    @Override
    public void putAll(@NotNull Map m) {

    }

    @Override
    public void clear() {
        array = new Entry[capacity];
    }

    @NotNull
    @Override
    public Set keySet() {

        ArrayList<Object> key = new ArrayList<>();

        if(size()>0){
            for (Entry current: array
            ) {
                if (current!=null) {
                    key.add(current.key);
                }
            }
        }

        Set set =new HashSet(key);

        return set;
    }

    @NotNull
    @Override
    public Collection values() {
        ArrayList<Object> values = new ArrayList<>();

        if(size()>0){
            for (Entry current: array
            ) {
                if (current!=null) {
                  values.add(current.value);
                }
            }
        }

        return values;
    }

    @NotNull
    @Override
    public Set<Map.Entry> entrySet() {

        HashSet<Map.Entry> mySet = new HashSet<>();

        for (Entry currEntry: array
             ) {
            mySet.add(currEntry);
        }

        return mySet;
    }


    private static class Entry implements Map.Entry {
        Object key;
        Object value;
        Entry next;

        public Entry(Object key, Object value) {
            this.key = key;
            this.value = value;
        }


        @Override
        public Object getKey() {
            return key;
        }

        @Override
        public Object getValue() {
            return value;
        }

        @Override
        public Object setValue(Object value) {
            return this.value=value;
        }
    }

    private int index(Object s){

        int hash = s.hashCode();

        hash = Math.abs(hash);
        hash = hash % capacity;
        return hash;
    }

    @Override
    public String toString() {

        String head = "MyMap{" +
                "capacity=" + capacity +
                ", array=[";

        Entry[] current = array;

        for (Entry curr: current
             ) {
            if(curr==null) {
                head += "null, ";
            }
            while (curr!=null){
                head +="(" + curr.key+", "+ curr.value+")"+", ";
                curr=curr.next;

            }

        }



        return  head +']'+'}';
    }
}
