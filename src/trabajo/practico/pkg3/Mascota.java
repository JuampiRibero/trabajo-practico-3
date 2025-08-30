/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajo.practico.pkg3;

/**
 *
 * @author juamp
 */
public class Mascota {
    
    String nombre;
    String especie;
    int edad;
    
    public void mostrarInfo(){
        System.out.println(nombre + " " + "- Especie: " + especie + " - Edad: " + edad);
    }
    
    public void cumplirAnios(){
        edad ++;
    }
    
}
