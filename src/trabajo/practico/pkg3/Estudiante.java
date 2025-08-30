/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajo.practico.pkg3;

/**
 *
 * @author juamp
 */
public class Estudiante {
    
    String nombre;
    String apellido;
    String curso;
    double calificacion;
    
    public void mostrarInfo(){
        System.out.println(nombre + " " + apellido + " - Curso: " + curso + " - Calificación: " + calificacion);
    }
    
    public void subirCalificacion(double puntos){
        calificacion += puntos;
    }
    
    public void bajarCalificacion(double puntos){
        calificacion -= puntos;
    }
    
}
