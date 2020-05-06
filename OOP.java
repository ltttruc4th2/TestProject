
//abstract class includes: abstract method, property color, Getter, Setter, Constructor
abstract class Animal{
    String color;

    //Getter
    public String getColor(){
        return color;
    }
    //Setter
    public void setName(String color) {
        this.color = color;
    }

    //Constructor
    public Animal(){
        System.out.println("Constructor of Animal....");
    }
    //abstract method
    abstract public void animalSound();
}

//Dog will extends Animal and override Animal sound
class Dog extends Animal{
    public void animalSound(){
        System.out.println("The dog says: goes  goes");
    }
}

//Cat will extends Animal and override Animal sound
class Cat extends Animal{
    public void animalSound(){
        System.out.println("The cat says: meow  meow");
    }
}

interface IFlyable{
    abstract public void fly();
}

//Bird class will extend this abstract class and override the animalSound method
class Bird extends Animal implements IFlyable{
    public void animalSound(){
        System.out.println("The cat says: chip  chip");
    }
    public void fly(){
        System.out.println("The bird can fly");
    }
}

public class OOP {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.animalSound();

        Cat cat = new Cat();
        cat.animalSound();

        Bird bird = new Bird();
        bird.animalSound();
        bird.fly();

    }
}
