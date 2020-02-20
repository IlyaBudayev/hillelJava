package homeWork15_MapImplementation;



public class Main {
    public static void main(String[] args) {
        MyMap myMap = new MyMap();

        System.out.println(myMap.size());

        myMap.put("Alphabet", "Алфавит");
        myMap.put("Zepelin", "Дирижабль");
        myMap.put("Alphabet1", "Алфавит1");
        myMap.put("Zepelin1", "Дирижабль1");
        myMap.put("Zepelin2", "Дирижабль2");
        myMap.put("Zepelin3", "Дирижабль3");

        MyMap myMap2 = new MyMap();

        System.out.println(myMap.size());

        myMap2.put("Joint", "Сустав");
        myMap2.put("Leverage", "Плечо");
        myMap2.put("Pet", "Питомец");





        System.out.println(myMap);

        System.out.println(myMap2);
        String result = (String) myMap.get("Alphabet");
        System.out.println(result);

        System.out.println(myMap.containsKey("Alphabet"));
        System.out.println(myMap.containsKey("Zepelin"));
        System.out.println(myMap.containsKey(11));

        System.out.println(myMap.containsValue("Алфавит"));
        System.out.println(myMap.containsValue("No!"));

        System.out.println(myMap.values());
        System.out.println(myMap.keySet());
        System.out.println(myMap.entrySet());


       // myMap.putAll(myMap2);
        System.out.println(myMap);


    }
}
