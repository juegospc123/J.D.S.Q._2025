/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication62;
import java.util.Scanner;
/**
 char caracter = nombre
 */
public class EjeN_6 {
     public static void main(String[] args) {
        
     Scanner dato = new Scanner(System.in);
         System.out.println("Ingrese este año:");
        int año=dato.nextInt();
        int año_naci;
         System.out.println("Ingrese su año de nacimiento:");
         año_naci=dato.nextInt();
         int resta= año -año_naci;
         System.out.println("Su edad es:"+ resta);
    
    }
    
}
