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

        int size = array.length+1;
        Entry[] temp = new Entry[size];

        if (size==0){
            temp = new Entry[index+1];
            temp[index]=o;
            array=temp;
            return true;
        }
        if(size<=index) {
            temp = new Entry[index+1];

        }


        for (int i = 0; i <temp.length ; i++) {
            if(i==index){
                temp[index]=o;

            }else if(array.length>i) {

                temp[i] = array[i];
            }else{
                temp[i] = null;

            }
        }
        array=temp;

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

    private int index(String s){

        int hash = s.length();

        hash = Math.abs(hash);
        hash = hash % capacity;
        return hash;
    }


}
