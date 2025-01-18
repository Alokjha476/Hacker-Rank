package OOPS;
// All examples
class Animal{
    void bark(){
        System.out.println("Barking:");
    }
      void sum(){
        System.out.println("Sum");
    }

}
class Dog {
    void bark(){
        System.out.println("Dog is working: ");
    }

}
class Cat extends Dog{
    void bark(){
        System.out.println("Cat is meow");
    }
}
public class Inheritance {
    public static void main(String[] args) {

        Cat cat = new Cat();
        cat.bark();
       /* Animal animal = new Dog();
        animal.bark();
        animal.sum();*/


    }
}
