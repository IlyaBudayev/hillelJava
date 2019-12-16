package homeWork4;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Хранение данных о студентах (фамилии, оценки, посещение) - продумать реализацию.
 * Хранение данных о студентах (массив фамилий) реализовать функции :
 * добавление нового студента
 * удаление по фамилии
 * contains - есть ли студент с определенной фамилией в группе
 * clear - очистка массива
 * сортировка по фамилии*
 * print - красивый вывод на печать группы
 */

public class HomeWork4_3 {

    static ArrayList<MyStudents> myStudentClassArr = new ArrayList<>();

    public static void main(String[] args) {

        addNewStudent("Вася Васечкин");
        addNewStudent("Коля Николаев");
        addNewStudent("Петя Петров");
        addNewStudent("Алексей Алексеев");


        sortNames();
        checkIfContains("Алексей Алексеев");
        checkIfContains("Гоша");

        removeByName("Алексей Алексеев");

        printTable();

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
    }

    private static void print(Object object) {
        System.out.println(object);
    }

    private static void printTable() {

        for (MyStudents student : myStudentClassArr
        ) {
            //System.out.print(student.name + " ");

            print(student.name);
            print(Arrays.toString(student.marks));
            print(Arrays.toString(student.presence));
        }
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


                //presentDay = Math.random() < 0.5;


        }

        String name;
        int[] marks = new int[32];


        boolean[] presence = new boolean[32];

    }


}

