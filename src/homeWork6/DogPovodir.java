package homeWork6;

public class DogPovodir extends Dog {
    private boolean isTrained;


    public DogPovodir(int id, int age, double weight, String color, boolean isVaccinated, String name, boolean isTrained) {
        super(id, age, weight, color, isVaccinated, name);
        this.isTrained = isTrained;
    }

    @Override
    public void golos() {
        super.golos();
        System.out.println(" come with me if you wonna live");
    }

}
