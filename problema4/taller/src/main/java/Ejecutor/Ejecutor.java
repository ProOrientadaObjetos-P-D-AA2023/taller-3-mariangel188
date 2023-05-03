/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejecutor;
import EquipoCelular.Celular;
/**
 *
 * @author Usuario PC
 */
public class Ejecutor {
    public static void main(String[] args) {
        Celular m = new Celular();
        m.setSistemaOperativo("Android");
        m.setTamano(4);
        m.setCostoInicial(250);
        m.setIvaPorcentaje(23);
        m.setIvaCostoInicial(12);
        m.setDireccionMac("d2:5c:dd:8d");
        m.setInformacionIMEI("3283764528385");
        m.calcularCostoFinal();

        System.out.println("El sistema operativo: " + m.getSistemaOperativo());
        System.out.println("El tamano: " + m.getTamano() );
        System.out.println("El costo inicial: " + m.getCostoInicial() );
        System.out.println("El iva en porcentaje: " + m.getIvaPorcentaje());
        System.out.println("El iva del costo inicial: " + m.getIvaCostoInicial() );
        System.out.println("La direccion mac: " + m.getDireccionMac());
        System.out.println("La informacion IMEI: " + m.getInformacionIMEI());
        System.out.println("El costo final del equipo es igual a: " + m.obtenerCostoFinal());

    }
  
}
