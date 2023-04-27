/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase01;

import clase02.terreno;

/**
 *
 * @author UTPL
 */
public class Ejecutor {

    public static void main(String[] args) {
        terreno m = new terreno();
        double costo_terreno;
        int ancho=12;
        int largo=13;
        int area;
        int valorMetroCuadrado=15;
        
        m.setAncho(ancho);
        m.setLargo(largo);
        m.setValorMetroCuadrado(valorMetroCuadrado);
        m.calcularArea();
        m.calcularCosto();
        
        System.out.println("El ancho del terreno es: "+ m.getAncho());
        System.out.println("El largo del terreno es: " + m.getLargo());
        System.out.println("El costo del metro cuadrado es: "+ m.getValorMetroCuadrado());
        System.out.println("El area del terreno es: " + m.obtenerValorArea());
        System.out.println("El costo del terreno es: " + m.obtenerValorCosto());
        
    }
}
