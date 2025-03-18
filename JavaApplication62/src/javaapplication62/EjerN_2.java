
package javaapplication62;
 import java.util.Scanner;
public class EjerN_2 {
    public static void main(String[] args) {
        
     Scanner dato = new Scanner(System.in);
     
        int edad;
        String nombre;
        
         System.out.println("Ingrese su monbre: ");
         nombre= dato.next();
         
         int can= nombre.length();
         for(int i=0;i<can;i++){
         System.out.println(nombre.charAt(i));
         
         }
        
        System.out.println("ingrese su edad:");
         edad= dato.nextInt();
         
         
        System.out.println("Su nombre es "+ nombre +", y tiene "+ edad+" años de edad");
        
    
    
    }
    
}
