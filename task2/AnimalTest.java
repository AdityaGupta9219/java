package task2;
//task2
class Animal{
    protected String name;
    public Animal(String name){
        this.name = name;
    }
    public void makeSound(){
        System.out.println("Animal makes a sound");
    }
    public void printInfo(){
        System.out.println("Animal name: "+ name);
    }
}

class Dog extends Animal{
    private String breed;
    public Dog(String name, String breed){
        super(name);
        this.breed = breed;
    }
    public void makeSound(){
        System.out.println("Dog barks");
    }
    public void printInfo(){
        System.out.println("Dog name: "+ name+", Breed: "+breed);
    }
    public void sleep(){
        System.out.println("Dog is sleeping...  ");
    }
}
public class AnimalTest {
    public static void main(String [] args){
        Animal A1 = new Animal("lion");
        A1.makeSound();
        A1.printInfo();
        Dog dog1 = new Dog("rocky", "german");
        dog1.makeSound();
        dog1.printInfo();
        dog1.sleep();
        Animal a = new Dog("bruno","Labrador");
        a.makeSound();
        a.printInfo();
    }
}
