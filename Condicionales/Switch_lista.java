/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Condicionales;
import java.util.Scanner;
/**
 *
 * @author LABO B CEN
 */
public class Switch_lista {
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
                
        int n1=0,n2=0;
        int com=0;
        while(com != 1){
                System.out.println("Eliga un numro dependienfo de la opreacion");
                System.out.println("1. suma");
                System.out.println("2. resta");
                System.out.println("3. multiplicar");
                System.out.println("4. divicion");
        int lista= dato.nextInt();
                
            switch(lista){
         case 1:
                 System.out.println("ingrese los dos muneros a sumar:");
                  n1=dato.nextInt();
                  n2=dato.nextInt();
                 int suma= n1+n2;
                 System.out.println("La suma es: "+suma);
                 com=1;
                 break;
                 
                 case 2:
                    System.out.println("ingrese los dos muneros a restar:");
                    n1=dato.nextInt();
                    n2=dato.nextInt();
                    int resta= n1-n2;
                 System.out.println("La suma es: "+resta);
                 com=1;
                    
                 break;
                 
                 case 3:
                  System.out.println("ingrese los dos muneros a multiplicar:");
                    n1=dato.nextInt();
                    n2=dato.nextInt();
                    int multi= n1*n2;
                 System.out.println("La suma es: "+multi);
                 com=1;
                 break;
                 case 4:
                 System.out.println("ingrese los dos muneros a dividir:");
                    n1=dato.nextInt();
                    n2=dato.nextInt();
                    float dividir= n1/n2;
                 System.out.println("La suma es: "+dividir);
                 com=1;
                 break;
             default:
                 System.out.println("Opción no válida.");
            
        }
        
  
    
    } 
    }
}
