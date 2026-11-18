
package com.mycompany.videogamefunciones;
import java.util.Scanner;
/**
 *
 * @author Carmen
 */
public class VideoGameFunciones {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //declaramos las variables
        
        int alquileresRealizados = 0;
        double recaudadoTotal = 0;
        double subtotal = 0;
        double alquilerMascaro = 0;
        double descuento = 0;
        int clientesAccion = 0;
        int clientesComedia = 0;
        int clientesCienciaFiccion = 0;
        int clientesTerror = 0;
        int opcion;
        do{
            //menu que se repetira para cuando termine el proceso del registro 
        System.out.println("-----VIDEOCLUB-----");
        System.out.println("1. Nuevo alquiler");
        System.out.println("0. Cerrar Videoclub");
        System.out.println("Selecciona una opcion");
        opcion =sc.nextInt();
        if(opcion == 1){
            System.out.println("Peliculas disponibles: Precios por dia ");
            System.out.println("Tipo Accion(codigo 1)- Precio 2 EUROS");
            System.out.println("Tipo Comedia(codigo 2 - Precio 3 EUROS");
            System.out.println("Tipo Ciencia Ficcion (codigo 3) - Precio 4 EUROS");
            System.out.println("Tipo Terror (codigo 4) - Precio 5 EUROS");
            System.out.println("Introduce el codigo de pelicula: ");
            int codigo = sc.nextInt();
            
              //Calculamos el precio dependiendo del codigo que acabamos de escanear
                double precio = obtenerPrecio(codigo);
                //si el precio es igual a 0 significa que el codigo no es valido
                if(precio == 0){
                    System.out.println("Codigo de pelicula no valido");
                    //si en tal caso el codigo es valido entonces se prosigue con el registro de la pelicula
                } else {
                    //se pide el numero de ideas y se escanea
                 System.out.println("Introduce el número de dias: ");
            int numDias = sc.nextInt();
            //validacion de el numero de dias sea mayor que 0 o mejor dicho que sea correcto
            if(numDias >0){
                //el subtotal es decir el importe antes del descuento y de calcular el total 
                //es el precio que se obtuvo de la funcion por el numero de daias escaneado hace un momento
                 subtotal = precio * numDias;
                 //ahora que tenemos el subtotal que es antes del descuento, falta el preico con el descuento aplicado
                  descuento = calcularDescuento (subtotal);
                // y finalmente si queremos el total, se resta el numero antes del descuento menos el precio con el descuento aplicado
                double total = subtotal - descuento;
                // el dato de los alquileres se actualiza cuando terminal el pedido, es decir, calcular el total
                alquileresRealizados++;
                // el += es asignar un valor a una variable, a la recaudacion acumulada de totales
                recaudadoTotal += total;
                //resumen del cliente
                System.out.println("RESUMEN");
                System.out.println("Subtotal: " + subtotal);
                System.out.println("Descuento: " + descuento);
                System.out.println("total: " + total);
                // contadores segun el genero de pelicula que eligan los clientes alquilar
                if(codigo == 1){
                    clientesAccion++;
                } else if (codigo == 2) {
                    clientesComedia++;
                } else if ( codigo == 3){
                    clientesCienciaFiccion++;
                } else {
                    clientesTerror++;
                       }
                // condicion para obtener el alquiler mas caro, este se actualizara hasta que termine
                // de comparar cual es el mas mayor y se cierre el videoclub con ese ultimo valor guardado definitivamente.
                if(total>alquilerMascaro){
                    alquilerMascaro = total;
                    
                }
                //si el numero de dias es menor que 0 entonces se mostrara el mensaje de error
                }else {
                System.out.println("El numero de dias no es valido");
            }
                
                }
        
           // esta condicion esta conectada a que si seleccionamos al opcion 1 se mostrara ese mensaje de error 
        } else if (opcion != 0) {
            System.out.println("Opcion no valida");
        }
         // esta es la condicion que cierra el Do While para que si pulsa 0 cierre el bucle
        }while(opcion !=0);
        
                // resumen final de la jornada
        System.out.println("VIDEOCLUB CERRADO");
        System.out.println("Alquileres realizados: " + alquileresRealizados);
        System.out.println("Recaudacion total: " +recaudadoTotal);
        System.out.println("Media de alquileres: " + CalcularMedia( recaudadoTotal, alquileresRealizados));
        System.out.println("Alquiler mas caro: " +alquilerMascaro);
        System.out.println("Alquileres Accion: " +clientesAccion);
        System.out.println("Alquilres Comedia: " +clientesComedia);
        System.out.println("Alquileres Ciencia Ficcion: " +clientesCienciaFiccion);
        System.out.println("Alquileres Terror: " +clientesTerror);
    }
    
    static double obtenerPrecio(int codigo){
        // dependiendo del codigo intrducido, se asignara un valor u otro,
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
    
      static double calcularDescuento(double subtotal){
          // ssitema para calcular el descuento
          // antes se compara el mayor y luego el menor del descuento del precio 
          if( subtotal >= 40){
              return  subtotal * 0.20;
          } else if (subtotal >= 20){
               return subtotal * 0.10;
          } else {
              return 0;
          }
      }
      static double CalcularMedia(double total, int alquileresRealizados){
          //si los alquileres son 0 entonces se retorna el valor 0
          if(alquileresRealizados == 0){
              return 0;
          }
          // sino se retorna el valor de el calculo de la media
          double media = total / alquileresRealizados;
          return media;
      }
}
