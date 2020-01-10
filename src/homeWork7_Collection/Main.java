package homeWork7_Collection;

import sun.awt.windows.WPrinterJob;

public class Main {
    public static void main(String[] args) {
        MyContainer container = new MyContainer();

        MyContainer container2 = new MyContainer();




        container.add(1);
        container.add(2);
        container.add(3);
        container.add(4);
        container.add(5);

        container2.add(2);
        container2.add(4);
        container2.add(10);
        container2.add(11);


        print(container);


        container.remove(5);

        print(container);

        print("contains: "+5+" "+container.contains(5));
        print("contains: "+4+" "+container.contains(4));

        print("size: "+container.size());

        container.add(5);
        print(container);

        print(container2);

        print("empty: "+container2.isEmpty());
        print("isNull: "+(container2 == null));



        container.addAll(container2);

        print(container);


        container.retainAll(container2);
        print(container);

        container.removeAll(container2);
        print(container);

        container.clear();
        print(container);





    }

    private static void print(Object o) {
        System.out.println(o.toString());
    }
}
