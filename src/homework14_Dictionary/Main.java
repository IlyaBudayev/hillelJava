package homework14_Dictionary;

public class Main {
    public static void main(String[] args) {
        MyMap myMap = new MyMap();
        myMap.add("Alphabet", "Алфавит");
        myMap.add("Zepelin", "Дирижабль");


        System.out.println(myMap);
        String result = myMap.get("Alphabet");
        System.out.println(result);
    }
}
