
package com.mycompany.ejerciciosintroductoriosud5;

/**
 *
 * @author Carmen
 */
public class EjerciciosIntroductoriosUD5 {

    public static void main(String[] args) {
         Scanner sc =  new Scanner(System.in);
        // Crea un programa que le pida al usuario 3 numeros y luego los muestre en el mismo orden que los ha introducido
        int numerosUsuario [] =  new int [3];
        
        for(int i = 0 ; i < 3 ; i++){
            System.out.println("Introduce 3 numeros: ");
            numerosUsuario[i] =  sc.nextInt();
        }
        
        for ( int i = 0; i < 3; i++){
            
            System.out.print(numerosUsuario[i] + " ");
        }
        
        
        // Crea un programa que pida cuantos numeros quiere introducir . Luego los leeera de teclado de uno a uno y mostrara la suma total de todos ellos.
        System.out.println("Cuantos numeros desea introducir: ");
        int cantidadUsuario2 =  sc.nextInt();
        
        int numerosUsuario2 [] = new int [cantidadUsuario2];
        for(int i = 0 ; i < cantidadUsuario2 ; i++){
            System.out.println("Introduce el numero entero: ");
            numerosUsuario2[i] = sc.nextInt();
            
        }
        int totalUsuario = 0;
        for(int i = 0 ; i < cantidadUsuario2 ; i++){
            System.out.print(numerosUsuario2[i] + " ");
            totalUsuario += numerosUsuario2[i];
            System.out.println("total de la suma es : " + totalUsuario);
        }
        
        
        
       // Crea un programa que pida la cantidad de temperatura registradas. Despues , muestra un mensaje con la temperatura mas alta de todas y la temperatura media.
       
       System.out.println("¿Cuanta temperatura va a registrar? :");
       int cantidadTemperatura =  sc.nextInt();
       
       double temperaturas [] =  new double [cantidadTemperatura];
       
       for(int i = 0 ; i < cantidadTemperatura ; i++){
           System.out.println("Introduce la temperatura: ");
           temperaturas [i] =  sc.nextDouble();
       }
       
       double sumaTemperaturas = 0;
       double mayor = temperaturas[0];
       for ( int i = 0; i < cantidadTemperatura ; i++){
           sumaTemperaturas += temperaturas[i];
       }
    }
}
