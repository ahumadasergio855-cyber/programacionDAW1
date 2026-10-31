
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
        //se establece el valor de inicio que sera 1 y se ejecutara la tabla de multiplicar hasta que sea igual o menor que 10
        for(int i = 1 ; i <=10 ; i++){
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
}
