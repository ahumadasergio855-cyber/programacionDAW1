
package com.mycompany.tablademultiplicar;
import java.util.Scanner;
/**
 *
 * @author Carmen
 */
public class TabladeMultiplicar {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Introduce un numero: ");
        int numero= sc.nextInt();
        //se establece el valor de inicio que sera 1 y se ejecutara la tabla de multiplicar desde el 5 hasta el 15 de su tabla del numero
        for(int i = 5 ; i <=15 ; i++){
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
}
