/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.abstracta;

/**
 *
 * @author hernando
 */
public class NewClass {
    public static void main(String[] args) {
        Animal a1 = new Gato();
        
        System.out.println(a1.getClass().getCanonicalName());
        
        Gato g1 = new Gato();
    }
    
}
