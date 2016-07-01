/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejemplobasico.colections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 *
 * @author hernando
 */
public class NewClass {
    public static void main(String[] args) {
        
        Carro c1 = new Carro();
        Gato g1 = new Gato();
        
        List a = new ArrayList();
        a.add(c1);
        a.add(g1);
        
        for (Object object : a) {
            System.out.println(object.getClass().getCanonicalName());
        }
        
        if (a.get(0) instanceof Carro){
            System.out.println("es un carro");
        }
        if (a.get(0) instanceof Gato){
            System.out.println("es un carro");
        }
        
        
    }
    
}
