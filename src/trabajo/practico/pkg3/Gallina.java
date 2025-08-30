/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajo.practico.pkg3;

/**
 *
 * @author juamp
 */
public class Gallina {
    
    private int idGallina;
    private int edad;
    private int huevosPuestos;
    
    public void setIdGallina(int idGallina) {
        this.idGallina = idGallina;
    }
    
    public void ponerHuevo(){
        huevosPuestos ++;
    }
    
    public void envejecer(){
        edad ++;
    }
    
    public void mostrarEstado(){
        System.out.println("Gallina " + idGallina + " - Edad: " + edad + " años, Huevos: " + huevosPuestos);
    }
    
}
