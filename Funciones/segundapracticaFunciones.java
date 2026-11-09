
package com.mycompany.practicadefunciones;
import java.util.Scanner;
/**
 *
 * @author Carmen
 */
public class Practicadefunciones {

    public static double areaRectangulo(double base , double altura){
        
         return base * altura;
    }
    
    
    public static void main(String[] args) {
        
        Scanner sc =  new Scanner(System.in);
        System.out.println("-----------------------");
        System.out.println("  mini calculadora SAA");
        System.out.println("-----------------------");
        System.out.println("1. Funcion mayor de dos numeros");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Salir");
        
        System.out.println("Seleccion opción: ");
        int menu = sc.nextInt();
        while( menu !=5){
            switch(menu){
                case 1: 
                    System.out.println("Introduce el primer numero entero:");
                    int n1 = sc.nextInt();
                    System.out.println("Introduce el seguno numero entero:");
                    int n2 = sc.nextInt();
                    int resultado = mayor( n1, n2 );
                    System.out.println(+resultado);
                    break;
                case 2:
                    
                    
                    
                    
              default:
            System.out.println("Fin de la ejecucion");      
                        
            }
            
            
        }
        
    }
    
    public static int mayor (int n1, int n2){
        if(n1 > n2){
            return n1;
        } else{
            return n2;
        }
    }
    
    
}
