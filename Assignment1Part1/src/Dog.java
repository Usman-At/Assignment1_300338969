public class Dog extends Mammal{

    public Dog(){
        super();
        System.out.println("Dog constructor called");
    }

    public Dog(String name){
        super(name);
        System.out.println("Dog constructor with name called");
    }

    public void makeSound(){
        System.out.println("Woof!");
    }

    public String getAnimalType(){
        return "Dog";
    }

}
