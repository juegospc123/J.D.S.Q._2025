/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication62;
import java.util.Scanner;

/**
EsEcribir un programa en Java que solicite al usuario que ingrese su nombre,
* apellido y edad. Luego, el programa debe imprimir un mensaje que indique
* el nombre,la edad del usuario y el cuarto carácter de su apellido.La solución para este enunciado puede ser 
* muy similar a la anterior, solo se debe agregar una línea para obtener 
* el cuarto carácter del apellido del usuario y una variable para almacenar dicho carácter.@author LABO B CEN
 */
public class EjeN_5 {
    public static void main(String[] args) {
        
     Scanner dato = new Scanner(System.in);
     
        int edad;
         String nombre;
        
         System.out.println("Ingrese su monbre: ");
         nombre= dato.next();
         
         int can = nombre.length();
        
      
        System.out.println("ingrese su edad:");
         edad= dato.nextInt();
         
         //char caracter = nombre.length(4);
         char caracter = nombre.charAt(3);
        System.out.println("Su edad es de: "+edad+", su nombres "+nombre+", el cuarto caracter del nombre es:"+caracter );
        
    
    
    }
    
}
