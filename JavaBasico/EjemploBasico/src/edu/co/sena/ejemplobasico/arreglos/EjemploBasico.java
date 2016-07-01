/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejemplobasico.arreglos;

/**
 *
 * @author hernando
 */
public class EjemploBasico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] arreglo = new int[10];
        arreglo[0]= 6;
        
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println(arreglo[i]);
        }
        
        int[][] matriz = new int[10][5];
        
        for (int i = 0; i < matriz.length;i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println(matriz[i][j]);   
            }
            
        }
        
    }
    
}
