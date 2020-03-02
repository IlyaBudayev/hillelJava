package homeWork13_ObjectIntoTreeSet;



public class Main {
    public static void main(String[] args) {
        MyTreeSet myTreeSet = new MyTreeSet();
        Student student1 = new Student("Ivan",2);
        Student student2 = new Student("Goga",6);
        Student student3 = new Student("Misha",1);

        System.out.println(student1);


        myTreeSet.add(student1);
        myTreeSet.add(student2);
        myTreeSet.add(student3);


        myTreeSet.print();
    }
}
