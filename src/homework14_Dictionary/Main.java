package homework14_Dictionary;

public class Main {
    public static void main(String[] args) {
        MyMap myMap = new MyMap();



        myMap.add("Alphabet", "Алфавит");
        myMap.add("Zepelin", "Дирижабль");
        myMap.add("Alphabet1", "Алфавит");
        myMap.add("Zepelin1", "Дирижабль");
        myMap.add("Alphabet2", "Алфавит2");
        myMap.add("Zepelin2", "Дирижабль2");
        myMap.add("Alphabet", "Алфавит");
        myMap.add("Zepelin", "Дирижабль");



        System.out.println(myMap);
        String result = myMap.get("Alphabet");
        System.out.println(result);
    }
}
