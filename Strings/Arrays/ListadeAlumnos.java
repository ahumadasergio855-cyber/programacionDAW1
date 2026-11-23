
package com.mycompany.ejerciciolistadealumnos;
import java.util.Scanner;
/**
 *
 * @author usuario
 */
public class EjercicioListadeAlumnos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String [] listaNombresAlumnos =  new String [5];
        
        for( int i = 0; i < listaNombresAlumnos.length ; i++){
            System.out.println("Introduce el nombres: ");
            listaNombresAlumnos[i] = sc.nextLine();
        }
        
         System.out.println("\nNombres Guardados");
         
         for( int i = 0 ; i <listaNombresAlumnos.length ; i++){
             System.out.println(listaNombresAlumnos[i]);
         }
         
         System.out.println("\nCantidad de letras: ");
         for(int i = 0; i < listaNombresAlumnos.length ; i++){
             // la diferencia es que se muestra el nombre y se imprime la lonigutd de cada nombre 
             // que son caracteres y usamos el metodo length
             System.out.println(listaNombresAlumnos[i] + " ->" + listaNombresAlumnos[i].length() + "letras");
         }
         
         // se hara el bucle hasta que la longitud de los nombres sea menor que i , es decir 0
         for( int i = 0 ; i < listaNombresAlumnos.length; i++){
             // Si el nombre tiene menos de 4 letras, mostramos el nombre
             // y la cantidad de letras que contiene.

             if( listaNombresAlumnos[i].length() < 4){
                 System.out.println(listaNombresAlumnos[i] + " -->" + listaNombresAlumnos[i].length() + " letras .");
             }
         }
    }
}
