public abstract class Animal implements SoundMaker{

    protected static int numberOfAnimals = 0;
    protected String name;

    public Animal(){

        numberOfAnimals += 1;
        this.name = "Uknown Animal";
        System.out.println("Animal Constructor called");

    }

    public Animal(String name){
        numberOfAnimals += 1;
        System.out.println("Animal Constructor with name called");
        this.name = name;
    }

    public abstract String getAnimalType();

    public static int getNumberOfAnimals(){
        return numberOfAnimals;
    }
}
