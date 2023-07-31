class Pen{
    String color;
    String type; //ballpoint,gel

    public void write(){
        System.out.println("writing something");
        
    }
    public void printColor(){
        System.out.println(this.color); 
    }
}

class Student{
    String name;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    Student(String name , int age){
        System.out.println("constructor called");
        this.name  = name;
        this.age  = age;
    }
    // copy constructor
    Student(Student s2){
        this.name  = s2.name;
        this.age  = s2.age;
    }
}


public class OOPS {
    public static void main(String[] args) {
        Pen pen1 = new Pen();
        pen1.color = "blue";
        pen1.type = " gel";
        pen1.write();
        
        Pen pen2 = new Pen();
        pen2.color = "black";
        pen2.type = "ballpoint";

        pen1.printColor();
        pen2.printColor();


        Student s1 = new Student("aman",24);
        

        Student s2 = new Student(s1);

        s2.printInfo();
    }
}