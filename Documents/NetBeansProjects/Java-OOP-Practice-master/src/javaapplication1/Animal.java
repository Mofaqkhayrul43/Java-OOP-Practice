/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Islam43
 */
public class Animal {

    void eat() {
        System.out.println("eating...");
    }
}

class Dog extends Animal {

    void walk() {
        System.out.println("Waling...");
    }

}

class Cat extends Animal {

    void meow() {
        System.out.println("Mewing...");
    }

}

class Test {

    public static void main(String args[]) {
        
        Dog ob=new Dog();
        ob.eat();
        ob.walk();

    }
}
