package homeWork6;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

//        Животное,
//                Рыбка,
//                Собака,
//                Кот,
//                Волк,
//                Лев,
//                Жираф,
//                Домашнее,
//                Крокодил,
//                Дикое,
//                Хомяк,
//                Собака-поводырь.
        Animal animal=new Animal(1,15,150,"Grey");
        Fish fish = new Fish(2,1,0.05,"Golden",false,"Reebok");
        Cat kitty=new Cat(3,2,3.5,"Blue",true,"Barsik");
        Wild wolf= new Wild(4,15,120,"Grey",true);
        Wild lion = new Wild(5,1,53,"White",true);
        Wild jiraf = new Wild(6,2,200,"Yellow and black",false);
        Pets pet = new Pets(7,2,7,"red",true,"Tvarina");
        Wild crocs= new Wild(8,2,100,"Green",true);
        Wild wild = new Wild(9, 10, 80,"Brown",false);
        Pets xhamster = new Pets(10,1,0.1,"grey",false,"Jerry");
        DogPovodir povodir = new DogPovodir(11,2,50,"white",true,"Lessy",true);

        ArrayList<Animal> myAnimalArr = new ArrayList<>();
        myAnimalArr.add(animal);
        myAnimalArr.add(fish);


    }
}
