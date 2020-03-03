/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dev.ronniemoncayo.patterns_design.behavioral.abstract_factory.ej1;

/**
 *
 * @author ronnie
 */
public class ColorFactory implements AbstractFactory<Color> {

    @Override
    public Color create(String color) {
        if (color.equalsIgnoreCase("yellow")) {
            return new YellowColor();
        } else if (color.equalsIgnoreCase("red")) {
            return new RedColor();
        }
        return null;
    }

}
