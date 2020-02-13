package homeWork15_MapImplementation;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.*;

public class MyImplMap implements Map {

    private int capacity = 10;
    private Entry[] array = new Entry[capacity];
    private ArrayList<Entry> myEntry = new ArrayList<>();

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
        return get(key)!=null;
    }

    @Override
    public boolean containsValue(Object value) {
        return false;
    }

    @Override
    public Object get(Object key) {
        return null;
    }

    @Nullable
    @Override
    public Object put(Object key, Object value) {


        return null;
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
        array= new Entry[0];
    }

    @NotNull
    @Override
    public Set keySet() {
        return null;
    }

    @NotNull
    @Override
    public Collection values() {
        return Arrays.asList(array);
    }

    @NotNull
    @Override
    public Set<Entry> entrySet() {
        return null;
    }
}
