package homeWork4;


import java.util.*;

/**
 * 1 Хранение данных о студентах (фамилии, оценки, посещение) - продумать реализацию.
 * 2 Хранение данных о студентах (массив фамилий) реализовать функции :
 * 3 добавление нового студента
 * 4 удаление по фамилии
 * 5 contains - есть ли студент с определенной фамилией в группе
 * 6 clear - очистка массива
 * 7 сортировка по фамилии*
 * 8 print - красивый вывод на печать группы
 */

public class HomeWork4_3 {

    static ArrayList<MyStudents> myStudentClassArr = new ArrayList<>();

    public static void main(String[] args) {

        //1 -3
        addNewStudent("Вася Васечкин");
        addNewStudent("Коля Николаев");
        addNewStudent("Петя Петров");
        addNewStudent("Алексей Алексеев");

        //7
        sortNames();

        //5
        checkIfContains("Алексей Алексеев");
        checkIfContains("Гоша");

        //4
        removeByName("Коля Николаев");

        //8
        printTable();

        //6
        clearAnArray();
    }

    private static void addNewStudent(String name) {
        MyStudents student = new MyStudents(name);
        myStudentClassArr.add(student);

    }

    private static boolean checkIfContains(String name) {
        boolean contains = false;

        for (MyStudents localStudentPArameteres : myStudentClassArr
        ) {
            if (localStudentPArameteres.name.equals(name)) {
                contains = true;
                print("Name " + name + "is here");
                break;
            }
        }

        if(!contains){
            print(name +" doesn't exist. Please try again later...when... when it will appear");

        }
        return contains;
    }

    private static void removeByName(String name) {

            for (MyStudents localStudentPArameteres : myStudentClassArr
            ) {
                if (localStudentPArameteres.name.equals(name)) {
                    myStudentClassArr.remove(localStudentPArameteres);
                    break;
                }


        }
    }

    private static void clearAnArray() {
        myStudentClassArr.clear();
    }

    private static void sortNames() {
        // myStudentClassArr.sort(myStudentClassArr);
        Collections.sort(myStudentClassArr, Comparator.comparing(myStudents -> myStudents.name));
    }

    private static void print(Object object) {
        System.out.println(object);
    }

    private static void printTable() {

        print("-----------------------------------------------------------------------------------------------");
        for (MyStudents student : myStudentClassArr
        ) {
            //System.out.print(student.name + " ");

            print(student.name);
            print("Оценки: "+ Arrays.toString(student.marks));
            print("Посещений: "+Arrays.toString(student.presence));
        }
        print("-----------------------------------------------------------------------------------------------");

    }

    private static class MyStudents {

        public MyStudents(String name) {
            this.name = name;

            for(int i =0; i<marks.length;i++){
                this.marks[i] = (int) ((Math.random() * (5)))+1;

            }

            for(int i =0; i<presence.length;i++){
                this.presence[i] = Math.random() <0.5;

            }

        }

        String name;
        int[] marks = new int[32];


        boolean[] presence = new boolean[32];

    }


}

