abstract class Animal{
    abstract void walk();
    public void eat(){
        System.out.println("animal eatts");
    }
    Animal(){
        System.out.println("you are creating a new animal");
    }
}

class Horse extends Animal{
    Horse(){
        System.out.println("creating a horse");
    }
    public void walk(){
        System.out.println("Walk on 4 legs");
    }
    
}

class Chicken extends Animal{
    public void walk(){
        System.out.println("walk on 2 legs");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.walk();
        horse.eat();
    }
}
