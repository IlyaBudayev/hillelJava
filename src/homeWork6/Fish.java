package homeWork6;

public class Fish extends Pets {
    public Fish(int id, int age, double weight, String color, boolean isVaccinated, String name) {
        super(id, age, weight, color, isVaccinated, name);
    }

    @Override
    public void golos() {
        super.golos();
        System.out.println("........");
    }
}
