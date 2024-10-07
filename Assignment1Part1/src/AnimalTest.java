import java.lang.reflect.Array;

import java.util.ArrayList;
import java.util.List;

public class AnimalTest {
    public static void main(String[] args) {
        List<Animal> animalList = new ArrayList<>();
        List<Mammal> mammalList = new ArrayList<>();
        List<Bird> birdList = new ArrayList<>();
        List<Dog> dogList = new ArrayList<>();
        List<Parrot> parrotList = new ArrayList<>();

        mammalList.add(new Mammal());
        mammalList.add(new Mammal());
        mammalList.add(new Mammal("Elephant"));
        mammalList.add(new Mammal("Whale"));


        birdList.add(new Bird());
        birdList.add(new Bird());
        birdList.add(new Bird("Eagle"));
        birdList.add(new Bird("Sparrow"));


        dogList.add(new Dog());
        dogList.add(new Dog());
        dogList.add(new Dog("Bulldog"));
        dogList.add(new Dog("Golden Retriever"));


        parrotList.add(new Parrot());
        parrotList.add(new Parrot());
        parrotList.add(new Parrot("Macaw"));
        parrotList.add(new Parrot("Cockatoo"));



        System.out.println("\nMammals making sounds:");
        for (Mammal mammal : mammalList) {
            mammal.makeSound();
        }

        System.out.println("\nBirds making sounds:");
        for (Bird bird : birdList) {
            bird.makeSound();
        }

        System.out.println("\nDogs making sounds:");
        for (Dog dog : dogList) {
            dog.makeSound();
        }

        System.out.println("\nParrots making sounds:");
        for (Parrot parrot : parrotList) {
            parrot.makeSound();
        }


        System.out.println("\nTotal number of animals created: " + Animal.getNumberOfAnimals());
        System.out.println("Total number of mammals created: " + Mammal.getNumberOfMammals());
        System.out.println("Total number of birds created: " + Bird.getNumberOfBirds());
    }
}
