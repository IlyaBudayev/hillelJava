package homeWork6;

public class Pets extends Animal {

    private boolean isVaccinated;
    private String name;


    public Pets(int id, int age, double weight, String color, boolean isVaccinated, String name) {
        super(id, age, weight, color);
        this.isVaccinated = isVaccinated;
        this.name = name;
    }

    @Override
    public void golos() {
        super.golos();
        System.out.println("my name is: "+name);

    }
}
