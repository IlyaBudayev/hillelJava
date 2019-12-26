package homeWork6;

public class Animal {
//    id (у всех животных),
//    age(у всех животных),
//    weight(у всех животных),
//    color(у всех животных),

    private int id;
    private int age;
    private double weight;
    private String color;

    public Animal(int id, int age, double weight, String color) {
        this.id = id;
        this.age = age;
        this.weight = weight;
        this.color = color;
    }



    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    public void golos(){
        System.out.print("\n Hello, ");
    }
}
