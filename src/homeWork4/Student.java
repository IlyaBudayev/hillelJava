package homeWork4;

public class Student {
    Student student;
    String name = "";
    int[] marks=new int[32];

    public Student( String name) {
        this.student = student;
        this.name = name;
        this.marks = marks;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getMarks() {
        return marks;
    }

    public void setMarks(int lesson ,int mark) {        // Поставить оценку за конкретный урок
        marks[lesson] = mark;
    }
}
