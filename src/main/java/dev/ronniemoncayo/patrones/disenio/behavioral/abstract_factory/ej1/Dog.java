/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dev.ronniemoncayo.patrones.disenio.behavioral.abstract_factory.ej1;

/**
 *
 * @author ronnie
 */
public class Dog implements Animal {

    @Override
    public String getAnimal() {
        return "Dog";
    }

    @Override
    public String makeSound() {
        return "guau guau";
    }

}