/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajo.practico.pkg3;

/**
 *
 * @author juamp
 */
public class Libro {
    
    private String titulo;
    private String autor;
    private int anioPublicacion;
    
    public String getTitulo(){
        return titulo;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public String getAutor(){
        return autor;
    }
    
    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    public int getAnioPublicacion(){
        return anioPublicacion;
    }
    
    public void setAnioPublicacion(int anioPublicacion){
        if (anioPublicacion > 0 && anioPublicacion <= 2025){
            this.anioPublicacion = anioPublicacion;
        } else {
            System.out.println("Año inválido: " + anioPublicacion);
        }
    }
    
    public void mostrarInfo(){
        System.out.println("Libro: " + titulo + " de " + autor + " (" + anioPublicacion + ")\n");
    }
    
}
