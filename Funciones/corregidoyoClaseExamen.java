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
        // usamos do-while ya que mientras que numero de rondas sea menor que 0 es decir, que si el usuario pone un numero de rondas que sea negativo el mensaje se repetira hasta que sea correcto
        // y en caso de que sea mayor que 0 se hace la verificacion de que dara error
        do{
            System.out.println("Introduce el numero de rondas");
            numeroRondas = sc.nextInt();
            if(numeroRondas <= 0){ System.out.println("Error");
            }
            // se ejecuta el bucle hasta que el numero de rondas sea menor o igual a 1
            for(int i =1; i<=numeroRondas ; i++){
                System.out.println("---Ronda" + i + "----");
                // se guarda de cada tirada el ID de cada jugador para reutilizar la función para diferentes jugadores
                leerTirada1 += leerTirada(1);// El signo de += lo que hace es asginar ese dato de leerTirada1 a la funcion de leerTirada al jugador 1
                leerTirada2 +=leerTirada(2);
                leerTirada3 += leerTirada(3);
            }
        }while(numeroRondas <= 0);
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
        int leerTirada = 0;
        do{
            System.out.println("Tirada del participante " + jugador + " : ");
            leerTirada = sc.nextInt();
            // verifica que el dato de leer tirada estre introducido correctamente dentro del bucle de do-while
            if( leerTirada < 1|| leerTirada > 6){
                System.out.println("Error. El dado debe dar entre 1 y 6 .");
            }
            // pero a la vez que verifica si esta bien, debe saberse que se ejecutara mientra que la tirada sea
            // menor que 1 o mayor que 6, de este modo si el usuario introduce un errro erroneo, se encargara
            // de repetir la pregunta hasta que de un dato valido
        }while(leerTirada < 1 || leerTirada > 6);
        return leerTirada;
    }
    
    public static void mostrarResultadoJugador(int jugador, int puntos){
        System.out.println("PARTICIPANTE " + jugador + ":" + puntos);
    }
    
    public static int calcularGanador (int puntos1 , int puntos2 , int puntos3 ){
        int ganador = 0;
        // si puntos 1 es mayor que puntos dos y puntos 1 tambien gana o igual a 3, ganara ganador 1
        if(puntos1 > puntos2 && puntos1>= puntos3){
            ganador = 1;
            // si puntos 2 gana a puntos 1 y gana a puntos 3 entonces gana el 2
        }else if(puntos2 > puntos1 && puntos2 >= puntos3){
            ganador = 2;
            // y si no finalmente gana el 3, por que en los anteriores casos si no ganan a puntos3 
            //significa que puntos3 es mayor que puntos1 y puntos2
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
