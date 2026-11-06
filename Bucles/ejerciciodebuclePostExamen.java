package com.mycompany.practicaproyecto20261106;
import java.util.Scanner;
/**
 *
 * @author Carmen
 */
public class Practicaproyecto20261106 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        double total = 0;
        int numeroproductos = 0;
        double caros = 0;
        double baratos = 0;
        
        double mayor = 0;
        double menor = 0;
        while( precio != -1){
            System.out.println("Introduce el precio:");
            double precio = sc.nextInt();
            if ( precio > 0){
                total +=precio;
                numeroproductos++;
            }
            if( precio >= 50){
                caros++;
            }
            if(precio <= 50){
                baratos++;
            }
            if(numeroproductos == 1){
                mayor  = precio;
                menor = precio;
            }
            if(precio > mayor){
                mayor = precio;
            }
            if (precio < menor){
                menor =  precio;
            }
        }
        System.out.println("Menu de resumen de compra");
        System.out.println("Productos: " + numeroproductos);
        System.out.println("Total: " + total);
        System.out.println("Productos Caros: " + caros);
        System.out.println("Productos baratos:" + baratos);
        System.out.println("mayor : " +mayor);
        System.out.println("Menor: " +menor);
    }
}
