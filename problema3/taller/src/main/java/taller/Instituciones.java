/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package taller;

/**
 *
 * @author Usuario PC
 */
public class Instituciones {
    private String nombre;
    private String tipoInstitucion;
    private int alumnos;
    private int docentes;
    private int sedes;
    private double gastosProyectados;
    private double presupuesto;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoInstitucion() {
        return tipoInstitucion;
    }

    public void setTipoInstitucion(String tipoInstitucion) {
        this.tipoInstitucion = tipoInstitucion;
    }

    public int getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(int alumnos) {
        this.alumnos = alumnos;
    }

    public int getDocentes() {
        return docentes;
    }

    public void setDocentes(int docentes) {
        this.docentes = docentes;
    }

    public int getSedes() {
        return sedes;
    }

    public void setSedes(int sedes) {
        this.sedes = sedes;
    }

    public double getGastosProyectados() {
        return gastosProyectados;
    }

    public void setGastosProyectados(double gastosProyectados) {
        this.gastosProyectados = gastosProyectados;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }
    
    
    public void calcularPresupuesto(){
        presupuesto = alumnos * gastosProyectados;
    }
    
    public double obtenerPresupuesto(){
        return presupuesto;
    }
   
}
