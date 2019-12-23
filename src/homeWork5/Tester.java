package homeWork5;

public class Tester {
    public static void main(String[] args) {
        int i = 1;
        int[] anothercontainer={2,12,13,22,4,65};

        MyArray numbersInArray=new MyArray();

         numbersInArray.add(i);
         numbersInArray.add(2);
         numbersInArray.add(10);
         numbersInArray.add(11);
        numbersInArray.add(3);

        numbersInArray.addAll(anothercontainer);

        print(numbersInArray.get(7));

       print("if countains: i " +numbersInArray.contains(i));

       numbersInArray.sort();
       print("sorted: "+ numbersInArray.toString());

       print("size: "+numbersInArray.getSize());

       print("index of i: " + numbersInArray.indexOf(i));

       print("");

        numbersInArray.clear();




    }

    static void print(Object o){
        System.out.println(o);
    }
}
