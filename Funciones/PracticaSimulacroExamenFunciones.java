/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.simulacroexamenfunciones;
import java.util.Scanner;
/**
 *
 * @author usuario
 */
public class SimulacroexamenFunciones {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-----CAFETERIA-----");
        System.out.println("1 registrar un nuevo pedido");
        System.out.println("0 Terminar la jornada");
        System.out.println("Selecciona una opcion: ");
        //logica de opcion de bucle while
        int opcion = sc.nextInt();
        while( opcion == 1){
            //menu de los productos para el cliente 
            System.out.println("productos: ");
        System.out.println("Cafe(1) 1,50 EUROS");
        System.out.println("Tostada(2)  2,20 EUROS");
        System.out.println("Zumo (3)  1,80 EUROS");
        //pedimos primero el codigo y luego la cantidad
            System.out.println("Introduce el codigo del producto: ");
            int codigo = sc.nextInt();
            if(codigo != 1 || codigo !=2 || codigo !=3){
                System.out.print
            }
            System.out.println("Introduce la cantidad de articulo");
            int numProductos = sc.nextInt();
            
        }
    }
    
    public static int obtenerPrecio(int codigo){
        double precio = 0;
        
        if ( codigo == 1){
            precio = 1.50;
        }
        if( codigo == 2) {
                precio = 2.20;
                }
        if (codigo == 3){
            precio = 1.80;
        } 
        return 0;
    }  
