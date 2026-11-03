package com.mycompany.practicabuclesnueva;
import java.util.Scanner;
import java.lang.Math;
/**
 *
 * @author usuario
 */
public class Practicabuclesnueva {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Calcular la raiz cuadrada de un numero intrducido por la terminal mediante el metodo de aproximaciones por ejemplo, para calcular raiz de 23 probamos 1^2 , 2^2 , 3^2, 4^2, 5^2= 25(nos pasamos)El resultado seria
        // 4 con un resto de 7. El numero introducido debe ser ser un numero natural postivo mayor que 0.  Ejemplo de salida por terminal para el 23:
        //resultado: 3 con resto 7.
        // si el resto es 0 , NO DEBE APARECER EN LA TERMINAL ESO EJEMPLO: 16 RESULTADO : 4 (NO HAY RESTO).
        System.out.print("Introduce un numero entero: "); 
        int numero = sc.nextInt();
        //inicalizamos las variables desde 0
        int raiz = 0;
        
        if(numero <= 0){
            System.out.print("El numero introducido no es valido");
        } else{
            System.out.println("El numero introducido es valido");
        for(int i = 1; i <= Math.sqrt(numero); i++){
            // cuando el valor de i sea menor que la raiz cuadrada se terminara el bucle y se guardara es numero
            // ya que el numero final sera la raiz de el numero
            raiz = i;
            
        }
        // se hace el cuadrado de la raiz y se resta por el numero original 
        int resto =  numero - ( raiz * raiz);
        if(resto !=0){
        System.out.println("resultado:" + raiz + "con resto" + resto);
        
        } else {
        System.out.println("La raiz es :"+ raiz );
        }
        }
        
    }
}
