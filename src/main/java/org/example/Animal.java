package org.example;

public class Animal {
    void eat() {
        System.out.println("Animal is eating the food.");
    }
}

class Cat extends Animal {
    void eat() {
        super.eat();
        System.out.println("Cat is eating the food.");
    }
}

class BabyCat extends Cat {
    void eat() {
        super.eat();
        System.out.println("Baby cat is eating food.");
    }
}


