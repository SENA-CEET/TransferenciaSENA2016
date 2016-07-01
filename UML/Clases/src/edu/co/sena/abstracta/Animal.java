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
public abstract class Animal {
    
    public int a = 5;
    
    public void comer(){
        System.out.println("como");
    };
    
    public abstract void morir();
    
}
