package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
//        Cat c = new Cat();
//        c.eat();
//
//        Animal animal = new Animal();
//        animal.eat();

        BabyCat babyCat = new BabyCat();
        babyCat.eat();

        Student newStudent = new Student(23, "Marco");
        newStudent.change();

        Student newStudent2 = new Student(23, "Alex");
        Student.change();

        StaticDemo3 test = new StaticDemo3();
        StaticDemo3 test2 = new StaticDemo3();

        Person person1 = new Person(1, "Alturk");

    }
}