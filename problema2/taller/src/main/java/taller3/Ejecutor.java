/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller3;
import taller.EquivalenteHora;
/**
 *
 * @author Usuario PC
 */
public class Ejecutor {
public static void main(String[] args) {
        EquivalenteHora m = new EquivalenteHora();
        int horas;
        int minutos= 0 ;
        int segundos= 0 ;
        int dias = 0;
        m.setHoras(48);
        m.setMinutos(minutos);
        m.setSegundos(segundos);
        m.setDias(dias);
        m.calcularHoras();
  
        System.out.println("Las horas son: " + m.getHoras());
        System.out.println("El equivalente en minutos es: " + m.obtenerHoras());
        System.out.print("El equivalente en segundos es: " + m.obtenerHoras2() + "\n");
        System.out.println("El equivalente en dias es: " + m.obtenerHoras3());
        
    }
}
