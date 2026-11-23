
package com.mycompany.correcionexamen;
import java.util.Scanner;
/**
 *
 * @author usuario
 */
public class Correcionexamen {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //pedimos rondas
            System.out.println("MENU DE LOS DADOS");
        int numeroRondas = 0;
        int leerTirada1= 0  ;
        int leerTirada2 = 0;
        int  leerTirada3 = 0;
        do{
            System.out.println("Introduce el numero de rondas");
            numeroRondas = sc.nextInt();
            if(numeroRondas > 0){ System.out.println("Error");
            }
            // se ejecuta el bucle hasta que el numero de rondas sea menor o igual a 1
            for(int i =1; i<=numeroRondas ; i++){
                System.out.println("---Ronda" + i + "----");
                // se guarda de cada tirada el ID de cada jugador para reutilizar la función para diferentes jugadores
                leerTirada1 += leerTirada(1);
                leerTirada2 +=leerTirada(2);
                leerTirada3 += leerTirada(3);
            }
        }while(numeroRondas < 0);
        mostrarResultadoJugador(1, leerTirada1);
        mostrarResultadoJugador(2, leerTirada2);
        mostrarResultadoJugador(3, leerTirada3);
        int ganador = calcularGanador ( leerTirada1 , leerTirada2, leerTirada3);
        System.out.println("El ganador es el particpante" + ganador );
        //como obtener la puntuacion maxima 
        int max = obtenerMaximo ( leerTirada1, leerTirada2);
        max = obtenerMaximo (max, leerTirada3);
        System.out.println("La punutuacion maxima es: " + max);
        
        // obtener jugadores con mas de 20 puntos
        int mas20Puntos = 0;
        if(esParticipanteDestacado( leerTirada1)) mas20Puntos++;
        if(esParticipanteDestacado( leerTirada2)) mas20Puntos++;
        if(esParticipanteDestacado (leerTirada3)) mas20Puntos++;
    }
    
    public static int leerTirada (int jugador){
        Scanner sc  = new Scanner(System.in);
        int leertirada = 0;
        do{
            System.out.println("Tirada del participante " + jugador + " : ");
        }while(leertirada >= 1 || leertirada <= 6);
        return leertirada;
    }
    
    public static void mostrarResultadoJugador(int jugador, int puntos){
        System.out.println("PARTICIPANTE " + jugador + ":" + puntos);
    }
    
    public static int calcularGanador (int puntos1 , int puntos2 , int puntos3 ){
        int ganador = 0;
        if(puntos1< puntos2 && puntos1>= puntos3){
            ganador = 1;
            
        }else if(puntos2 > puntos1 && puntos2 >= puntos3){
            ganador = 2;
        } else {
            ganador = 3;
        }
        return ganador ;
    }
    public static int obtenerMaximo ( int valor1 , int valor2){
        if( valor1 >= valor2){
           return valor1;
           
    } else {
            return valor2;
            }
    }
    
    public static boolean esParticipanteDestacado ( int puntos){
        if(puntos >= 20){
          return true;  
        } else {
            return false;
        }
    }
}
