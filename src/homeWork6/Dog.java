package homeWork6;

public class Dog extends Pets {
    public Dog(int id, int age, double weight, String color, boolean isVaccinated, String name) {
        super(id, age, weight, color, isVaccinated, name);
    }

    @Override
    public void golos() {
        super.golos();
        System.out.println(" Woof.");
    }

}
