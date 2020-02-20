package homework14_Dictionary;




public class MyMap {
    private int capacity = 10;
    private Entry[] array = new Entry[capacity];


    public MyMap() {
    }

    public String get(String key){

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


    public void add(String key, String value) {


        Entry entry = new Entry(key, value);

        int number = index(key);

        add(entry, number);

    }

    public boolean add(Entry o,int index) {

      //  int size = array.length+1;
        Entry[] temp = new Entry[capacity];

        temp = array;

         temp[index]=o;

        array=temp;
    //    capacity=size;
        return true;
    }


    private static class Entry{
        String key;
        String value;
        Entry next;

        public Entry(String key, String value) {
            this.key = key;
            this.value = value;
        }


    }

    private int index(Object s){

        int hash = s.hashCode();

        hash = Math.abs(hash);
        if(capacity!=0) {
            hash = hash % capacity;
        }else{
            hash = hash % 1;

        }
        return hash;
    }

    @Override
    public String toString() {

        String head = "MyMap{" +
                "capacity=" + capacity +
                ", array=[";

        MyMap.Entry[] current = array;

        for (MyMap.Entry curr: current
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
