package com.mycompany.sumarvalores;
import java.util.Scanner;
/**
 *
 * @author Sergio
 */
public class Sumarvalores {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int positivos = 0;
        int negativos = 0;
        //se pone el numero y se limita cuando numeros puede introducir el usuario
        for(int i = 1; i <=10 ; i++){
            System.out.println("Introduce el numero");
             int numero = sc.nextInt();
             if( numero >=0){
               //si son mayores que 0 se le suma uno y si son igual que 0 tambien, 
                positivos++;
        }else {
                 negativos++;
             }
            
        }
        System.out.println("positivos: " +positivos);
        System.out.println("negativos: " +negativos);
    }   
    }
