package Asssignment1.Module3;
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

public class singleinheritanceanimal{
    public static void main(String[] args) {

        Dog d = new Dog();
        d.sound();   // inherited method
        d.bark();    // child method
    }
}