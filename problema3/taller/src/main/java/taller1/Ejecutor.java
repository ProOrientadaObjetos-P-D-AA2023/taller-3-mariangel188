/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller1;
import taller.Instituciones;

/**
 *
 * @author Usuario PC
 */
public class Ejecutor {

    public static void main(String[] args) {
        Instituciones m = new Instituciones();
        m.setNombre("Eugenio Espejo");
        m.setTipoInstitucion("Privada");
        m.setAlumnos(300);
        m.setDocentes(40);
        m.setSedes(4);
        m.setGastosProyectados(1200);
        m.calcularPresupuesto();

        System.out.println("El nombre de la institucion: " + m.getNombre());
        System.out.println("El tipo de institucion: " + m.getTipoInstitucion());
        System.out.println("El numero de alumnos: " + m.getAlumnos());
        System.out.println("El numero de docentes: " + m.getDocentes());
        System.out.println("El numero de sedes: " + m.getSedes());
        System.out.println("Los gastos proyectados por estudiantes: " + m.getGastosProyectados());
        System.out.println("El presupuesto es igual a: " + m.obtenerPresupuesto());

    }

}
