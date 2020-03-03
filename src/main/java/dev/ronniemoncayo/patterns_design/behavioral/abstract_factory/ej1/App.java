/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dev.ronniemoncayo.patterns_design.behavioral.abstract_factory.ej1;

/**
 * From: https://www.baeldung.com/java-abstract-factory-pattern
 *
 * @author ronnie
 */
public class App {

    public static void main(String[] args) {
        System.out.println("**********************");
        System.out.println("Abstract factory Ej. 1");
        System.out.println("**********************");

        AbstractFactory afColor = FactoryProvider.getFactory("Color");
        Color color = (Color) afColor.create("yellow");
        System.out.println(color.getHexColor());
        color = (Color) afColor.create("red");
        System.out.println(color.getHexColor());

        AbstractFactory afAnimal = FactoryProvider.getFactory("Animal");
        Animal animal = (Animal) afAnimal.create("dog");
        System.out.println(animal.makeSound());
        animal = (Animal) afAnimal.create("cat");
        System.out.println(animal.makeSound());
    }

}
