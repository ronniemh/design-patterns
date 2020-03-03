/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dev.ronniemoncayo.patrones.disenio.behavioral.abstract_factory.ej1;

import dev.ronniemoncayo.patrones.disenio.behavioral.abstract_factory.ej1.AbstractFactory;
import dev.ronniemoncayo.patrones.disenio.behavioral.abstract_factory.ej1.Cat;
import dev.ronniemoncayo.patrones.disenio.behavioral.abstract_factory.ej1.Dog;

/**
 *
 * @author ronnie
 */
public class AnimalFactory implements AbstractFactory<Animal> {

    @Override
    public Animal create(String animalType) {
        if (animalType.equalsIgnoreCase("Dog")) {
            return new Dog();
        } else if (animalType.equalsIgnoreCase("Cat")) {
            return new Cat();
        }
        return null;
    }

}
