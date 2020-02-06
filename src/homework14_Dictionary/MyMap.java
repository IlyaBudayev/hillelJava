package homework14_Dictionary;




public class MyMap {
    private Entry[] array = new Entry[0];

    public MyMap() {
    }

    public String get(String key){
        int hash  = hash(key);
        return array[hash].value;
    }


    public void add(String key, String value) {


        Entry entry = new Entry(key, value);

        int number = hash(key);

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

        public Entry(String key, String value) {
            this.key = key;
            this.value = value;
        }


    }

    private int hash(String s){

        System.out.println(s.length());
        return s.length();
    }

}
