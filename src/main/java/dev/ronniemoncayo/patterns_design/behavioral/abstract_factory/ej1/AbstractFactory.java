/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dev.ronniemoncayo.patterns_design.behavioral.abstract_factory.ej1;

/**
 *
 * @author ronnie
 * @param <T>
 */
public interface AbstractFactory<T> {
    T create(String type);
}
