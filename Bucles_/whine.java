/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bucles_;

/**
 *
 * @author LABO B CEN
 */
public class whine {
      public static void main(String[] args) {
        int contador = 1; // Inicializamos la variable

        while (contador <= 5) { // Se ejecuta mientras la condición sea verdadera
            System.out.println("Iteración número: " + contador);
            contador++; // Incrementamos el contador en cada vuelta
        }

        System.out.println("Fin del bucle.");
    }
    /** Nota!!
     * while (contador <= 5) ->> El bucle se ejecuta mientras contador sea menor o igual a 5.
     * En cada iteración, imprime "Iteración número: X" y luego incrementa contador.
     * Cuando contador llega a 6, la condición se vuelve falsa y el bucle se detiene.
     */
    
}
