package homeWork10_List_Implementation;



public class Main {
    public static void main(String[] args) {
        ArrayList_LIST container = new ArrayList_LIST();

        ArrayList_LIST container2 = new ArrayList_LIST();




        container.add(1);
        container.add(2);
        container.add(3);
        container.add(4);
        container.add(5);

        print(container.size());
        print(container);

        container2.add(2);
        container2.add(4);
        container2.add(10);
        container2.add(11);


        print(container);


        container.remove(4);

        print(container);

        print("contains: "+5+" "+container.contains(5));
        print("contains: "+4+" "+container.contains(4));

        print("size: "+container.size());

        container.add(5);
        print(container);

        print(container2);

        print("empty: "+container2.isEmpty());
        print("isNull: "+(container2 == null));



        container.addAll(2,container2);

        print("add all index 2:"+container);

        container.add(1,69);

        print("add  index 1:"+container);


        container.retainAll(container2);
        print(container);

        container.add(15);

        print(container);
        container.removeAll(container2);
        print(container);

        container.clear();
        print(container);

    }

    static void print(Object o){
        System.out.println(o);
    }
}
