interface Animal{
    int eyes =2;
    void walk();
}

interface Hervivores{

}

class Horse implements Animal,Hervivores{
    public void walk(){
        System.out.println("walk on  4 legs");
    }
}

public class Interface {
    public static void main(String[] args) {
        
    }
}
