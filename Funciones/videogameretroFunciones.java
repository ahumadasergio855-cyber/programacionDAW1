
package com.mycompany.practicavideojuegofunciones;
import java.util.Scanner;
/**
 *
 * @author usuario
 */
public class PracticavideojuegoFunciones {
        
        
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //declaramos las variables
        int opcion = 0;
        do{
        System.out.println("-----VIDEOCLUB-----");
        System.out.println("1. Nuevo alquiler");
        System.out.println("0. Cerrar Videoclub");
        System.out.println("Selecciona una opcion");
        opcion =sc.nextInt();
        if(opcion == 1){
            System.out.println("Peliculas disponibles: ");
            System.out.println("Tipo Accion(codigo 1)- Precio 2 EUROS");
            System.out.println("Tipo Comedia(codigo 2 - Precio 3 EUROS");
            System.out.println("Tipo Ciencia Ficcion (codigo 3) - Precio 4 EUROS");
            System.out.println("Tipo Terror (codigo 4) - Precio 5 EUROS");
            System.out.println("Introduce el codigo de pelicula: ");
            int codigo = sc.nextInt();
            double precio = obtenerPrecio(codigo);
            System.out.println("Introduce el número de dias: ");
            int numDias = sc.nextInt();
            if(numDias >0){
                
            } else {
                System.out.println("El numero de dias no es valido");
            }
        } else {
            System.out.println("Opcion no valida");
        }
        }while(opcion !=0);
    }
    
    static double obtenerPrecio(int codigo){
        if( codigo == 1){
            return 2;
        } else if(codigo == 2){
            return 3;
        } else if(codigo == 3){
            return 4;
        }else if (codigo == 4 ){
            return 5;
        } else{
            return 0;
        }
    }
}
