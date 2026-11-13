
package com.mycompany.simulacroudfunciones;
import java.util.Scanner;
/**
 *
 * @author Carmen
 */
public class SimulacroUDFunciones {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-----CAFETERIA-----");
        System.out.println("1 registrar un nuevo pedido");
        System.out.println("0 Terminar la jornada");
        System.out.println("Selecciona una opcion: ");
        //logica de opcion de bucle while
        int opcion = sc.nextInt();
        int numProductos = 0;
        double precio = 0;
        while( opcion == 1){
            //menu de los productos para el cliente 
            System.out.println("productos: ");
        System.out.println("Cafe(1) 1,50 EUROS");
        System.out.println("Tostada(2)  2,20 EUROS");
        System.out.println("Zumo (3)  1,80 EUROS");
        //pedimos primero el codigo y luego la cantidad
            System.out.println("Introduce el codigo del producto: ");
            int codigo = sc.nextInt();
            if(codigo != 1 && codigo !=2 && codigo !=3){
                System.out.print("El codigo es incorrecto");
            }else{
                precio = obtenerPrecio( codigo);
                System.out.println("Precio del producto: " + precio + " EUROS ");
            }
            System.out.println("Introduce la cantidad de articulo");
             numProductos = sc.nextInt();
            while( numProductos > 1){
            double totalPedido = precio * numProductos;
            
            System.out.println("Total pedido: " +totalPedido + "euros");
           
        }
        
        if(numProductos > 1 && precio == 10){
                System.out.println("El pedido supera los 10 euros");
        }
    }
        System.out.println();
            System.out.println("1 Registrar un nuevo pedido");
            System.out.println("0 Terminar la jornada");
            System.out.println("Selecciona una opcion: ");
            opcion = sc.nextInt();
    }
 
    public static double obtenerPrecio(int codigo){
        double precio = 0;
         
       if(codigo == 1 ){
           precio = 1.50;
       }else if(codigo == 2){
           precio =2.20;
       }else if(codigo == 3){
           precio = 1.80;
       }
        
       return precio;
    }
    }  
