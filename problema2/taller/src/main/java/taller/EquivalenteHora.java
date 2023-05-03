/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package taller;

/**
 *
 * @author Usuario PC
 */
public class EquivalenteHora {

    private int horas;
    private int minutos;
    private int segundos;
    private int dias;

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public int getHoras() {
        return horas;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int getMinutos() {
        return minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public void calcularHoras() {
        minutos = horas * 60;
        segundos = horas * 3600;
        dias = horas / 24;
    }

    public int obtenerHoras() {
        return minutos;

    }

    public int obtenerHoras2() {
        return segundos;
    }

    public int obtenerHoras3() {
        return dias;
    }
}
