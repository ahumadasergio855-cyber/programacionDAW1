package com.mycompany.ejerciciodearraysud5introductorios;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author Carmen
 */
public class EjerciciodeArraysUD5Introductorios {

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        // crear un programa que almacene 10 notas, por defecto todas valdran 5.0
        double notasAlumnado[];
        notasAlumnado =  new double[10];
        Arrays.fill(notasAlumnado , 5.0);
        System.out.println("Notas Alumnado: " + Arrays.toString(notasAlumnado));
        
        System.out.println("Introduce las notas :");
        for(int i = 0; i < notasAlumnado.length ; i++){
            System.out.println("nota" + (i + 1) + ":");
            notasAlumnado[i] = sc.nextDouble();
        }
        
        System.out.println("Notas finales: " + Arrays.toString(notasAlumnado));
        
       int posicion =  Arrays.binarySearch(notasAlumnado, 8.4);
      
        if(posicion > 0){
           System.out.println(" Encontrado en el indice :" +posicion);
       } else {
           System.out.println("Lo sentimos , no se ha encontrado");
       }
        
        int posicionInsertar = -posicion -1;
        System.out.println("Posicion de indice: " +posicionInsertar);
    }
}
