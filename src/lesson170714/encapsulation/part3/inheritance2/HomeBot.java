package lesson170714.encapsulation.part3.inheritance2;

import java.util.Arrays;
import java.util.List;

public class HomeBot {
    public static void main(String[] args) {
        List<Pet> pets = Arrays.asList(new Hamster(), new Dog(), new Cat());

        for (Pet pet :
                pets) {
            pet.feed();
            pet.feed();
        }

        Pet pet = new Dog();
        pet.feed();
        Dog dog = (Dog) pet;
        if (pet instanceof Cat) {
            Cat cat = (Cat) pet;
        }
//        pet = new Pet(); ERROR

        Rat rat = new Rat();
        rat.feed();
    }
}
