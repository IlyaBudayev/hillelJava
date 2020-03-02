package homeWork17_Generics;

import homeWork10_List_Implementation.ArrayList_LIST;




public class Main {

    public static void main(String[] args) {
        ArrayList_LIST<String> myAnyList = new ArrayList_LIST<>();
        myAnyList.add("String");
        myAnyList.add("text");


        System.out.println(myAnyList);

        ArrayList_LIST<Object> objectArrayList= new ArrayList_LIST<>();


        objectArrayList.add("123");
        objectArrayList.add(1);
        objectArrayList.add(1.2);

        System.out.println(objectArrayList);

        ArrayList_LIST<Double> doubleArrayList= new ArrayList_LIST<>();

        doubleArrayList.add(12.3);
        doubleArrayList.add(11.3);



        System.out.println(doubleArrayList);
    }
}
