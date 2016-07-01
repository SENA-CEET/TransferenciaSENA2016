/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejemplomaven.ciclos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author hernando
 */
public class NewClass1 {
    public static void main(String[] args) {
        
        for (int i = 0; i < 10; i++) {
            
        }
        
        List lista = new ArrayList();
        lista.add("1");
        lista.add("2");
        
        
        Iterator i = lista.iterator();
        
        for (Iterator iterator = lista.iterator(); iterator.hasNext();) {
            Object next = iterator.next();
            System.out.println(next);
            
        }
        
        for (Object object : lista) {
            System.out.println(object);
        }
        
        
        
        
        
        
        
    }
    
}
