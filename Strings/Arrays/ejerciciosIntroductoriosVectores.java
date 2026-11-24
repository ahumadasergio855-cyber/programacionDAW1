package com.mycompany.ejerciciosud5vectores;
import java.util.Scanner;
/**
 *
 * @author usuario
 */
public class EjerciciosUD5Vectores {

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        // Crea un programa que le pida al usuario 3 numeros y luego los muestre en el mismo orden que los ha introducido
        int numerosUsuario [] =  new int [3];
        
        for(int i = 0 ; i < 3 ; i++){
            System.out.println("Introduce 3 numeros: ");
            numerosUsuario[i] =  sc.nextInt();
        }
        
        for ( int i = 0; i < 3; i++){
            
            System.out.print(numerosUsuario[i] + " ");
        }
        
        
        // Crea un programa que pida cuantos numeros quiere introducir . Luego los leeera de teclado de uno a uno y mostrara la suma total de todos ellos.
        System.out.println("Cuantos numeros desea introducir: ");
        int cantidadUsuario2 =  sc.nextInt();
        
        int numerosUsuario2 [] = new int [cantidadUsuario2];
        for(int i = 0 ; i < cantidadUsuario2 ; i++){
            System.out.println("Introduce el numero entero: ");
            numerosUsuario2[i] = sc.nextInt();
            
        }
        
        for(int i = 0 ; i < cantidadUsuario2 ; i++){
            System.out.print(numerosUsuario2[i] + " ");
            numerosUsuario2 += int totalUsuario;
            System.out.println("total: " + totalUsuario);
        }
        
        
        
       // Crea un programa que pida la cantidad de temperatura registradas. Despues , muestra un mensaje con la temperatura mas alta de todas y la temperatura media.
       
       
    }
}
