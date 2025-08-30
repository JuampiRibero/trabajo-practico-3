/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajo.practico.pkg3;

/**
 *
 * @author juamp
 */
public class NaveEspacial {
    
    private String nombre;
    private int combustible;
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public int getCombustible() {
        return combustible;
    }
    
    public void setCombustible(int combustible) {
        this.combustible = combustible;
    }
    
    public void despegar(){
        if (combustible >= 10) {
            combustible -= 10;
            System.out.println(nombre + " ha despegado. Combustible restante: " + combustible);
        } else {
            System.out.println(nombre + " no tiene suficiente combustible para despegar.");
        }
    }
    
    public void avanzar(int distancia){
        int consumo = distancia * 2; // Supongo que consume 2 unidades por km
        if (combustible >= consumo) {
            combustible -= consumo;
            System.out.println(nombre + " avanzó " + distancia + " km. Combustible restante: " + combustible);
        } else {
            System.out.println(nombre + " no tiene suficiente combustible para avanzar " + distancia + " km");
        }
    }
    
    public void recargarCombustible(int cantidad){
        combustible += cantidad;
        if (combustible > 100) {
            combustible = 100; // Le pongo un límite, capacidad del tanque.
        }
        System.out.println(nombre + " recargó combustible. Nivel actual: " + combustible);
    }
    
    public void mostrarEstado(){
        System.out.println(nombre + " - Combustible: " + combustible);
    }
    
}
