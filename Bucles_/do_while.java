/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bucles_;

/**
 *
 * @author LABO B CEN
 */
public class do_while {
    public static void main(String[] args) {
        int contador = 1; // Inicializamos la variable

        do {
            System.out.println("Iteración número: " + contador);
            contador++; // Incrementamos el contador
        } while (contador <= 5); // Verificamos la condición después de ejecutar el código

        System.out.println("Fin del bucle.");
    }
    /**Nota!!!
     * El bloque dentro de do { ... } se ejecuta al menos una vez, sin importar la condición.
     * Luego, while (contador <= 5) verifica si el bucle debe continuar.
     * Si contador = 6, la condición es falsa y el bucle termina.
     */
    
}
