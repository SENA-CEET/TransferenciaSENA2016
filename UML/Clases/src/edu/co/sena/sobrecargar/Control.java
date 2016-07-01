/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.sobrecargar;

/**
 *
 * @author hernando
 */
public class Control {

    int numeroTeclas;
    float tamano;

    public Control(int numeroTeclas) {
        this.numeroTeclas = numeroTeclas;
    }

    public Control(float tamano) {
        this.tamano = tamano;
    }

    public Control(int numeroTeclas, float tamano) {
        this.numeroTeclas = numeroTeclas;
        this.tamano = tamano;
    }

    public Control() {
    }

    public void apagar() {
        System.out.println("apago");
    }

    public void apagar(int minutos) {
        System.out.println("apago");
    }

    public void apagar(int a, int b) {
        System.out.println("apago");
    }

    public int enQueCanal() {
        return 10;

    }

}
