import java.util.*;
class Animal{
    void eat(){
        System.out.println("eat() method of base class ");
        System.out.println("eating");
    }
    
}
class Dog extends Animal{
    void eat(){
        System.out.println("eat() method of derived class ");
        System.out.println("Dog is eating");
    }
}
public class MethodOverriding {
    public static void main(String args[]){
        Dog d1 = new Dog();
        Animal a1 = new Animal();

        d1.eat();
        a1.eat();

        //Animal anml = new Dog();
        //anml.eat();
    }
    
}
