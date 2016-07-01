/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.clases.clase.b;

/**
 *
 * @author hernando
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = 5;
        
        String saludo="hola mundo";
        
        
        
        System.out.println(a);
        
        cambiarSaludo(saludo);
        
        System.out.println(saludo);
        
        
    }
    
    
    public static void cambiarNumero(int [] numero){
       
    }
    
    public static void cambiarSaludo(String saludo){
       saludo = "hola nuevo saludo";
    }
    
}
