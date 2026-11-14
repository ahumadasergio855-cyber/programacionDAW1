package com.mycompany.simulacroudfunciones;
import java.util.Scanner;
/**
 *
 * @author Carmen
 */
public class SimulacroUDFunciones {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int pedidosCobrados = 0;
        double recaudadoTotal = 0;
        double pedidoMascaro = 0 ;
        System.out.println("-----CAFETERIA-----");
        System.out.println("1 registrar un nuevo pedido");
        System.out.println("0 Terminar la jornada");
        System.out.println("Selecciona una opcion: ");
        //logica de opcion de bucle while
        int opcion = sc.nextInt();
        
        while( opcion !=0){
            double subtotal= 0;
            
            System.out.println("Introduce el codigo del producto");
            int codigo =  sc.nextInt();
            
            while(codigo !=0){
                if(codigo != 1 && codigo !=2 && codigo !=3){
                    System.out.println("Codigo incorrecto");
                } else {
                    double precio = obtenerPrecio(codigo);
                    
                    System.out.println("Introduce la cantidad de articulos");
                    int cantidad = sc.nextInt();
                    
                    while ( cantidad <= 0){
                        System.out.println("Introduce la cantidad de articulos: ");
                    }
                    subtotal += precio * cantidad;
                }
                
                System.out.println("Introduce el codigo del producto:");
                codigo = sc.nextInt();
            }
            if(subtotal == 0){
                System.out.println("Pedido cancelado");
            } else {
                double descuento =  Calculodescuento(subtotal);
                double total =  subtotal - descuento;
                
                System.out.println("Resumen pedido: ");
                System.out.println("Subtotal: " + subtotal + " EUROS");
                
                if(descuento > 0){
                    System.out.println("Se aplico al precio un 10% de descuento");
                } else { 
                    System.out.println("No se aplica ningun descuento");
                }
                
                System.out.println("Total:" + total +  "EUROS");
                System.out.println("Introducir dinero:");
                double dineroentregado = sc.nextInt();
                while (dineroentregado < total){
                    System.out.println("Introducir su dinero por favor");
                }
                double cambioDinero = calcularCambio(total, dineroentregado);
                
                System.out.println("Cambio a devolver: " + cambioDinero + "EUROS");
                
                pedidosCobrados++;
                
                recaudadoTotal += total;
                if(total < pedidoMascaro){
                    pedidoMascaro = total;
                }
            }
            System.out.println();
            System.out.println("-----CAFETERIA-----");
            System.out.println("1 Registrar un nuevo pedido");
            System.out.println("0 Terminar la jornada");
            System.out.println("Selecciona una opcion:");
            
            opcion = sc.nextInt();
        }
        
        System.out.println();
        System.out.println("Fin de la jornada: ");
        System.out.println("Numero de pedidos cobrados:" + pedidosCobrados);
        System.out.println("Recaudacion total: " +recaudadoTotal + "EUROS");
        System.out.println("Pedido mas caro: " + pedidoMascaro + "EUROS");
        
         
    }
    
    public static double calcularCambio( double total, double dineroentregado){
        return dineroentregado - total;
    }
    
    public static double obtenerPrecio(int codigo){
        if(codigo == 1){
            return 1.50;
        } else if( codigo == 2){
            return 2.20;
        }else if (codigo == 3){
            return 1.80;
        }
        return 0 ;
    }
    
    public static double Calculodescuento( double subtotal){
        if(subtotal >= 10){
            return subtotal * 0.10;
        }
        return 0 ;
    }
}
