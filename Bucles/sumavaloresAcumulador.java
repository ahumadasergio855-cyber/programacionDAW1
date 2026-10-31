package com.mycompany.sumarvalores;
import java.util.Scanner;
/**
 *
 * @author Carmen
 */
public class Sumarvalores {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int suma = 0;
        for(int i= 1 ; i<=5 ; i++){
            System.out.println("Introduce un numero: ");
            int numero = sc.nextInt();
            suma = suma + numero;
            
            
        }
        System.out.println(+suma);
        }
    }
