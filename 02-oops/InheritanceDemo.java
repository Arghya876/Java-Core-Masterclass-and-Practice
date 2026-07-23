/**
 * 02-object-oriented-programming: InheritanceDemo.java
 * ======================================================
 * 💡 What is Inheritance? (Beginner Friendly Guide)
 * --------------------------------------------------
 * Analogy: Parent & Child 👨‍👦
 * Just like a child inherits traits (eye color, surname) from parents,
 * a Child Class (Subclass) inherits fields & methods from a Parent Class (Superclass) using `extends`.
 *
 * Benefits: Code Reusability! No need to write duplicate code.
 */

// Parent Class (Superclass)
class Animal {
    String name;

    public void eat() {
        System.out.println(name + " is eating food... Nom nom!");
    }

    public void sleep() {
        System.out.println(name + " is sleeping... Zzz!");
    }
}

// Child Class (Subclass) inherits from Animal
class Dog extends Animal {
    // Unique feature of Dog
    public void bark() {
        System.out.println(name + " says: Woof! Woof!");
    }
}

// Another Child Class inheriting from Animal
class Cat extends Animal {
    // Unique feature of Cat
    public void meow() {
        System.out.println(name + " says: Meow! Meow!");
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        System.out.println("=========================================");
        System.out.println("       Inheritance Demo (Animal Kingdom) ");
        System.out.println("=========================================");

        // Create Dog object
        Dog myDog = new Dog();
        myDog.name = "Buddy";
        
        // Dog gets eat() and sleep() from Animal automatically!
        myDog.eat();
        myDog.bark();
        myDog.sleep();

        System.out.println("-----------------------------------------");

        // Create Cat object
        Cat myCat = new Cat();
        myCat.name = "Whiskers";

        // Cat gets eat() and sleep() from Animal automatically!
        myCat.eat();
        myCat.meow();
        myCat.sleep();

        System.out.println("=========================================");
    }
}
