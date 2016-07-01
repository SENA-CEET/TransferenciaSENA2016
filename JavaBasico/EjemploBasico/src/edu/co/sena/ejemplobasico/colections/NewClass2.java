/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejemplobasico.colections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author hernando
 */
public class NewClass2 {
    public static void main(String[] args) {
           List<Carro> lista = new ArrayList<>();
        Carro c1 = new Carro();
        c1.setPlaca("12345");
        Carro c2 = new Carro();
        c2.setPlaca("123456");
        Carro c3 = new Carro();
        c3.setPlaca("123457");
        Carro c4 = new Carro();
        c4.setPlaca("123458");
        Carro c5 = new Carro();
        c5.setPlaca("123459");
        lista.add(c1);
        lista.add(c2);
        lista.add(c3);
        lista.add(c4);
        lista.add(c5);
        
        Carro ce = new Carro();
        ce.setPlaca("123456");
        Carro cr = new Carro();
        cr.setPlaca("123456");
        
        
        
        for (Carro carro : lista) {
            if(ce.equals(carro)){//"123456".equesl("sdfasdf")
            
            }
        }
        
        
        
        
        
        for (Carro carro : lista) {
            System.out.println(carro.getPlaca());
        }
    }
}
