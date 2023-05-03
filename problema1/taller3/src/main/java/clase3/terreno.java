/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase3;

/**
 *
 * @author Usuario PC
 */
public class terreno {
    private double costoTerreno;
    private int horas;
    private int ancho;
    private int largo;
    private int area;
    private int valorMetroCuadrado;

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public int getValorMetroCuadrado() {
        return valorMetroCuadrado;
    }

    public void setValorMetroCuadrado(int valorMetroCuadrado) {
        this.valorMetroCuadrado = valorMetroCuadrado;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public void calcularArea(){
        area = largo * ancho;
    }
    public double obtenerArea(){
        return area;
    }
     public void calcularCosto(){
        costoTerreno = area * valorMetroCuadrado;
    }
    public double obtenerCosto(){
        return costoTerreno;
    }
}
