/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package EquipoCelular;

/**
 *
 * @author Usuario PC
 */
public class Celular {

    private String sistemaOperativo;
    private double tamano;
    private double costoInicial;
    private double ivaPorcentaje;
    private double ivaCostoInicial;
    private double costoFinal;
    private String direccionMac;
    private String informacionIMEI;

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    public double getTamano() {
        return tamano;
    }

    public void setTamano(double tamano) {
        this.tamano = tamano;
    }

    public double getCostoInicial() {
        return costoInicial;
    }

    public void setCostoInicial(double costoInicial) {
        this.costoInicial = costoInicial;
    }

    public double getIvaPorcentaje() {
        return ivaPorcentaje;
    }

    public void setIvaPorcentaje(double ivaPorcentaje) {
        this.ivaPorcentaje = ivaPorcentaje;
    }

    public double getIvaCostoInicial() {
        return ivaCostoInicial;
    }

    public void setIvaCostoInicial(double ivaCostoInicial) {
        this.ivaCostoInicial = ivaCostoInicial;
    }

    public String getDireccionMac() {
        return direccionMac;
    }

    public void setDireccionMac(String direccionMac) {
        this.direccionMac = direccionMac;
    }

    public String getInformacionIMEI() {
        return informacionIMEI;
    }

    public void setInformacionIMEI(String informacionIMEI) {
        this.informacionIMEI = informacionIMEI;
    }

    public void calcularCostoFinal() {
        costoFinal = costoInicial + ivaCostoInicial;
    }
    
    public double obtenerCostoFinal(){
        return costoFinal;
    }
}
