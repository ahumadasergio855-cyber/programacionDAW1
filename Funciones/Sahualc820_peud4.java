/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sahualc820_peud4;
import java.util.Scanner;
/**
 *
 * @author usuario
 */
public class Sahualc820_peud4 {

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        //variables declaradas
        int numRondas = 0;
        int jugador = 0;
        int numtiradajugador = 1;
        int cantidadtirada = 0;
        int Mayortirada = 0;
        int puntos  = 0;
        int puntos1 = 0;
        int puntos2 = 0;
        int puntos3 = 0;
        //validacion del numero de rondas que introduce el usuario
        do{
            //pedimos el numero de rondas
            
            System.out.println("Introduce el numero de rondas");
             numRondas = sc.nextInt();
             // Si el numero de rondas sigue siendo 0, se muestra el mensaje de errro y se vuelve a pedir el numero de rondas hasta que se salga del bucle
            if( numRondas < 0){
                System.out.println("ERROR");
            }
            // que se ejecute hasta que el numero de rondas no sea menor que 0 
        }while(numRondas < 0);
        /**se ejecuta partiendo de que i es igual 1 y que cada vez que el numero de rondas se ejecute se restara 1 a ese numRondas hasta que ya no se cumpla la condicion de que
        sea i sea igual a numRondas es decir, menor 1 , quiere decir que cuando sea 0 se rompera el bucle y no continuara
        **/
        for( int i = 1 ; i == numRondas ; i--){
            System.out.println("--- Ronda " +numRondas + "---");
            /**si el numero  de  jugadores maximo es 3, se empieza con el jugador con valor 1, 
             * si j es igual a 3 en el bucle se ejecutara pedir tirada del paticipante hasta que 1 sea igual a 3 pero en cada ronda
             * que se ejecuta , J suma 1 , es decir, contando hasta maximo 3 jugadores y jugador como vale 1 para que se muestre
             * el numero de jugador 1 , jugador 2 y jugado 3 se le suma uno a jugador hasta que sea 3 y se cumpla la ejecucion, por que 
             * cuando el jugador valga 4 en esa ronda , se termina el bucle y se pasa a cumplir el bucle de fuera
             * que seria hasta que el numero de rondas sea igual a 1 y termine el juego
             */
            for( int j = 3 ; numtiradajugador == j; j++ ){
     //mientras que j sea igual a 3 se ejecuta el bucle
            // se pide al usuario la tirada de cada participante
            System.out.println("Tirada del participante " + numtiradajugador + ":");
            // ese valor de tirada jugador sea el numero de jugador, mientras que jugador sera la tirada en si del numero de jugador correspondiente
            jugador = sc.nextInt();
             puntos  =  leerTirada( jugador);
            if( jugador  == 1){
                puntos = puntos1;
            } else if (jugador == 2){
                puntos  = puntos2;
            } else if ( jugador == 3){
                puntos = puntos3;
            }
             
            // acumulador de jugador, cada vez que se ejecute esto, se le suma una tirada , de este modo sabremos que numero de jugador y tirada hay en ese turno
            numtiradajugador++;
            
            }
            puntos += cantidadtirada ;
            // el total pasa a valer la asignacion de ronda tras ronda de cantidadtirada
            int total =  cantidadtirada;
            /** si el total fuera  cantidad tirada es decir del total es mayor que la tirada se le asgina ese valor hasta que termina el bucle while
             *  y se mostrara el valor final de la comparacion hasta que se quedo con el valor mas grande 
             */
            
            if( total > Mayortirada){
                total = Mayortirada;
            }
        }
        // resumen de las rondas
        // se mostrara el valor introducido por el jugador con la funcion de leer tirada, a la vez que validamos que sea una tirada valida es decir, entre 1 y 6
            System.out.println("Tirada participante " + numtiradajugador + ":" + mostrarResultadoJugador( jugador , puntos));
            System.out.println(" El ganador es el participante: " + calcularGanador( puntos1, puntos2, puntos3));
            System.out.println("La puntuacion maxima es: ");
    }
    // declaracion de las funciones fuera del main para que no afecte
    static int leerTirada ( int jugador){
        // si el dato introducido por el jugador no esta comprendido entre 1 y 6, es decir, menor que 1 y mayor que 6 , se pedira de nuevo la tirada del numero de jugador
        while(jugador < 1 && jugador > 6){
            System.out.println("Tirada del participante " + jugador + ":");
        }
        // y cuando el numero de tirada este correcto , se retornara el valor de la tirada del jugador
        return jugador;
    }
    
    static int mostrarResultadoJugador ( int jugador , int puntos){
        jugador = puntos ;
        return puntos ;
    }
    static int calcularGanador ( int puntos1, int puntos2 , int puntos3){
        int jugador1 = puntos1;
        int jugador2 = puntos2;
        int jugador3= puntos3;
        if( jugador1 > jugador2 && jugador3 < jugador2 && jugador1 > jugador3){
           return jugador1 = 1;
    } else if( jugador1 < jugador2 && jugador3 < jugador2){
       return jugador2 = 2;
    } else if(jugador1 < jugador3 && jugador2 < jugador3){
        return jugador3 = 3 ;
    } else if ( jugador1 == jugador2){
        jugador1 = 1 ;
    } else if ( jugador2 ==  jugador3){
        jugador2 = 2;
    } else
        return jugador3;
        return 0;
    }
    
   static boolean(int puntos){
       if( puntos >= 20){
           return true;
       } else{
           return false;
       }
   }

     
       
}

        


