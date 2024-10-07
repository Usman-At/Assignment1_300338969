public class Parrot extends Bird{

    public Parrot(){
        System.out.println("Parrot constructor called");
    }

    public Parrot(String name){
        super(name);
        System.out.println("Parrot constructor with name called");
    }

    public void makeSound(){
        System.out.println("Squawk!");
    }

    public String getAnimalType(){
        return "Parrot";
    }

}
