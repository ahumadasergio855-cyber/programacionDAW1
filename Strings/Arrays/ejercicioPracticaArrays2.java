
package com.mycompany.ejerciciopracticaarraysud5;
import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author usuario
 */
public class EjercicioPracticaArraysUD5 {

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        //como insertar elementos en esa posicion y con tablas que sin estan ordenadas
       // un ejemplo donde pidan eliminar un objeto de la tabla y si no existe saber el indice e insertarlo
       // algoritmo de burbuja
       // La funcion de ordenacion solo para pocos elementos como ahora
       
       //Ejercicio para practicar:
       //Crea un programa que vaya pidiendo al usuario sus notas hasta que escriba -1 
       //  con todas ellas deberia calcular la media
       // No sabes cuantas notas vas a introducir, asi como pista, vas a tener que utilizar las funciones de copias de tablas
       int tamanyoNotas = 1;
       double nota;
       double notasAlumno[] =  new double [0];
       double total= 0;
       do{
          
           System.out.println("Introduce tu nota: ");
           nota = sc.nextDouble();
           if( nota >= 0 && nota <= 10 ){
              notasAlumno =  Arrays.copyOf(notasAlumno, notasAlumno.length + 1);
            notasAlumno[notasAlumno.length -1] =  nota;
            total += nota;
            tamanyoNotas++;
          }
          
            
       }while( nota == -1);
      
       double media = total / notasAlumno.length;
       System.out.println("Notas: " +Arrays.toString(notasAlumno));
       System.out.println("Media:" + media);
       
    }
}
