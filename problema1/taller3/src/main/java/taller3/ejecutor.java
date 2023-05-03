/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller3;
import clase3.terreno;
/**
 *
 * @author Usuario PC
 */
public class ejecutor {
    public static void main(String[] args) {
        terreno m = new terreno();
        double costo_terreno;
        int ancho=12;
        int largo=13;
        int area;
        int valorMetroCuadrado=15;
        
        m.setAncho(ancho);
        
        m.setAncho(ancho);
        m.setAncho(ancho);
        m.setLargo(largo);
        m.setValorMetroCuadrado(valorMetroCuadrado);
        m.calcularArea();
        m.calcularCosto();
        
        System.out.println("El ancho del terreno es: "+ m.getAncho());
        System.out.println("El largo del terreno es: " + m.getLargo());
        System.out.println("El costo del metro cuadrado es: "+ m.getValorMetroCuadrado());
        System.out.println("El area del terreno es: " + m.obtenerArea());
        System.out.println("El costo del terreno es: " + m.obtenerCosto());
        
    
    }
     
}
