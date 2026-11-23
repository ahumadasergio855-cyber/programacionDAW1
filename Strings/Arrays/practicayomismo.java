package com.mycompany.practicastringsmio;
import java.util.Scanner;
/**
 *
 * @author usuario
 */
public class PracticastringsMio {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        // mostramos un string que se llama nombrs y que guardara 5 datos 
        String[] nombres = new String[5];
        // se pedira introducir nombre hasra que la longitud de nombres sea menor que i, es decir
        // que sea menor que 0, y sabemos que seran 5 nombres si o si
        for(int i = 0; i < nombres.length; i++){
            System.out.println("Introduce el nomnbre: ");
            //  nombres[i] representa la posicion actual del array que es 0 y en cada vuelta
        // suma 1 la i , y en cada vuelta el valor cambia y guardamos el nombre en una 
        // posicion distinta 
            nombres[i] = sc.nextLine();
        }
        // se imprime todos los nombres guardados de principio a final de bucle
        System.out.println("\nNombres Guardados: ");
       // este lo que hace es tomar el valor de los datos anteriores de nombres[i] y 
       // los representa en fila la lista de nombres guardados
        for(int i = 0 ; i < nombres.length; i++){
            System.out.println(nombres[i]);
        }
    }
}
