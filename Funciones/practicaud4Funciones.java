package com.mycompany.ud4ejerciciofunciones;
import java.util.Scanner;
import java.lang.Math;
        
    

/**
 *
 * @author usuario
 */
public class Ud4EjercicioFunciones {
     
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("------Ejercicio de Funciones-----");
        System.out.println("Ejercicio superficie");
        System.out.println("Ejercicio pares ");
        System.out.println("Ejercicio distancia ");
        System.out.println("Ejercicio calculo segundos ");
        System.out.println(" SALIR ");
        System.out.println("Seleccione una opcion: ");
        
        int menu = sc.nextInt();
        
        switch(menu){
            case 1:
                System.out.println("Dame el número de radio de la superficie:");
                double radio = sc.nextDouble();
                double resultadosuperficie;
                resultadosuperficie = superficie( double radio);
        }
    }
    public static double superficie(double radio){
         double superficie = (4 * Math.PI) * Math.pow(radio, 2);
         System.out.println("la superficie es " +superficie);
         return superficie;
    }
}
