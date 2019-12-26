package homeWork6;

public class Wild extends Animal {
    private boolean isPredator;

    public Wild(int id, int age, double weight, String color, boolean isPredator) {
        super(id, age, weight, color);
        this.isPredator = isPredator;
    }

    @Override
    public void golos() {
        super.golos();
        System.out.print("I am a wild animal");
        if (isPredator){
            System.out.println(" and I'm angry");
        }
    }
}
