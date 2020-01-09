package homeWork6;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

//                Животное,
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
        Animal fish = new Fish(2,1,0.05,"Golden",false,"Reebok");
        Animal kitty=new Cat(3,2,3.5,"Blue",true,"Barsik");
        Animal wolf= new Wild(4,15,120,"Grey",true);
        Animal lion = new Wild(5,1,53,"White",true);
        Animal jiraf = new Wild(6,2,200,"Yellow and black",false);
        Animal pet = new Pet(7,2,7,"red",true,"Tvarina");
        Animal crocodile= new Wild(8,2,100,"Green",true);
        Animal wild = new Wild(9, 10, 80,"Brown",false);
        Animal xhamster = new Pet(10,1,0.1,"grey",false,"Jerry");
        Animal povodir = new DogPovodir(11,2,50,"white",true,"Lessy",true);

        ArrayList<Animal> myAnimalArr = new ArrayList<>();
        myAnimalArr.add(animal);

        myAnimalArr.add(fish);

        myAnimalArr.add(kitty);
        myAnimalArr.add(wolf);
        myAnimalArr.add(lion);
        myAnimalArr.add(jiraf);
        myAnimalArr.add(pet);
        myAnimalArr.add(crocodile);
        myAnimalArr.add(wild);
        myAnimalArr.add(xhamster);
        myAnimalArr.add(povodir);

        for (Animal myclass : myAnimalArr
                ) {
            myclass.golos();
        }


    }
}
