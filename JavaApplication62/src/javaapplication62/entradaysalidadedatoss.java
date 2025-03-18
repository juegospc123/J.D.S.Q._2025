
 
package javaapplication62;

 import java.util.Scanner;

public class entradaysalidadedatoss {
    public static void main(String[] args) {
        
     Scanner dato = new Scanner(System.in);
     Scanner datocomida = new Scanner(System.in);
        String comida;
        int edad;
        String nombre;
        
         System.out.println("Ingrese su monbre: ");
         nombre= dato.next();
        System.out.println("Ingrese el tipo de comida que prefiere: ");
        comida = datocomida.nextLine();
        System.out.println("ingrese su edad:");
         edad= dato.nextInt();
         
         
        System.out.println("Su nombre es "+ nombre +" de edad "+ edad +", y su comida favorota son:"+ comida);
        
    
    
    }
    
}
