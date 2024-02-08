package org.example;

public class StaticDemo3 {
    static int newValue = 234;
    static {
        System.out.println("Do you think it will be printed?");
    }

    static int cube (int a) {
        return a * a * a;
    }

    void display() {
        System.out.println(newValue);
    }
}
