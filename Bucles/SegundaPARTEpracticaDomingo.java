package com.mycompany.practicabuclesdomingopart2;
import java.util.Scanner;
/**
 *
 * @author Carmen
 */
public class PracticabuclesDomingoPart2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("MENU DE EJERCICIOS");
        System.out.println("Ejercio 1: Hasta no introducir 0 pide numeero y mayor");
        System.out.println("Ejercio 2: Validación de nota entre 0-10");
        System.out.println("Selecciona el numero de ejercicio: ");
        int menuOpcion = sc.nextInt();
        switch(menuOpcion){
            case 1:
        
        System.out.println("Introduce un numero");
        int numero = sc.nextInt();
        //Hasta que el usuario no introduzca 0 pedira numeros y te dira cual es el mayor de todos
        int mayor = numero ;
        
        while ( numero != 0){
            if( numero > 0){
                mayor = numero;
            }
            System.out.print("Introduce un numero: ");
            numero = sc.nextInt();
        }
        System.out.println("Mayor:" + mayor);
        break;
        
            case 2:
                int nota;
                // obliga al usuario a introducir una nota valida entre 0-10 sino seguira apareciendo el mensaje 
                do{
                    System.out.print("Introduce una nota: ");
                    nota = sc.nextInt();
                }while( nota < 0 || nota > 10);
                
                System.out.println("Nota correcta");
                
            case 3:
                System.out.print("Introduce un numero");
                 int numerosuma = sc.nextInt();
                int suma = 0;
                while ( numerosuma > 0){
                    // el modulo quita l ultima cifra y se la asigna a la variable de suma
                    suma += numerosuma % 10;
                    // en la siguiente vuelta el valor ese mas el valor de la siguiente vuelta del modulo
                    
                    numerosuma = numerosuma / 10 ; //este saca el numero de la ultima cifra para luego ese numero hacerle el modulo en la siguiente vuelta
                }
                System.out.println("suma :" + suma);
             
           default:
        System.out.println("Fin de la ejecucion");     
}
        
    }
}
