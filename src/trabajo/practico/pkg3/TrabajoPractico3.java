/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajo.practico.pkg3;

/**
 *
 * @author juamp
 */
public class TrabajoPractico3 {

    public static void main(String[] args) {
        
        // Estudiante
        System.out.println("Ejercicio 1");
        Estudiante estudiante = new Estudiante();
        
        estudiante.nombre = "Juan Pablo";
        estudiante.apellido = "Ribero Mazzoni";
        estudiante.curso = "Programación II";
        estudiante.calificacion = 9.5;
        
        System.out.println("Estado inicial:");
        estudiante.mostrarInfo();
        estudiante.subirCalificacion(0.5);
        estudiante.bajarCalificacion(1.5);
        
        System.out.println("Estado final:");
        estudiante.mostrarInfo();
        
        // Mascota
        System.out.println("\nEjercicio 2");
        Mascota mascota = new Mascota();
        
        mascota.nombre = "Nina";
        mascota.especie = "Gato";
        mascota.edad = 10;
        
        System.out.println("Estado inicial:");
        mascota.mostrarInfo();
        
        System.out.println("Simulando el paso del tiempo...");
        for (int i = 1; i <= 5; i++) {
            mascota.cumplirAnios();
            System.out.println("Año " + i + " después:");
            mascota.mostrarInfo();
        }
        
        // Libro
        System.out.println("\nEjercicio 3");
        Libro libro = new Libro();
        
        libro.setTitulo("El Principito");
        libro.setAutor("Antoine de Saint-Exupéry");
        libro.setAnioPublicacion(3000);
        libro.setAnioPublicacion(1999);
        libro.mostrarInfo();
        
        
        // Gallina
        System.out.println("\nEjercicio 4");
        Gallina gallina1 = new Gallina();
        Gallina gallina2 = new Gallina();
        
        gallina1.setIdGallina(1);
        gallina2.setIdGallina(2);
        
        gallina1.envejecer();
        gallina1.envejecer();
        gallina1.ponerHuevo();
        gallina2.envejecer();
        gallina2.ponerHuevo();
        gallina2.ponerHuevo();
        
        gallina1.mostrarEstado();
        gallina2.mostrarEstado();
        
        // Nave Espacial
        System.out.println("\nEjercicio 5");
        NaveEspacial nave = new NaveEspacial();
        
        nave.setNombre("Apollo");
        nave.setCombustible(50);
        
        nave.mostrarEstado();
        
        nave.avanzar(30);
        
        nave.recargarCombustible(40);
        
        nave.avanzar(20);
        
        nave.mostrarEstado();
        
    }
    
}
