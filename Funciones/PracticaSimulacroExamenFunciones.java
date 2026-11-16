package com.mycompany.simulacroexamenfunciones;
import java.util.Scanner;
/**
 *
 * @author usuario
 */
public class SimulacroexamenFunciones {

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
            //mientras que el codigo sea mayor que 0 se verifica el codigo y si es valido se pedira la cantidad
            while(codigo >0){
                if(codigo != 1 && codigo !=2 && codigo !=3){
                    System.out.println("Codigo incorrecto");
                } else {
                    double precio = obtenerPrecio(codigo);
                    //se pide la cantidad del articulo
                    System.out.println("Introduce la cantidad de articulos");
                    int cantidad =sc.nextInt();
                    // mientas que la cantidad de articulo introducida sea menor que 0 o igual se pedira que introduzca la cantidad
                    while ( cantidad <= 0){
                        System.out.println("Introduce la cantidad de articulos: ");
                         cantidad = sc.nextInt();
                    }
                    subtotal += precio * cantidad;
                }
                
                System.out.println("Introduce el codigo del producto:");
                codigo = sc.nextInt();
            }//si el subtotal de dinero es 0 a la hora de pedir introducir el codigo del producto el pedido sera cancelado
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
                double dineroentregado = sc.nextDouble();
                //mientras que el dinero sea menor que el total se volvera a pedir el dienro al usuario
                while (dineroentregado < total){
                    System.out.println("Introducir su dinero por favor");
                    dineroentregado = sc.nextDouble();
                }
                double cambioDinero = calcularCambio(total, dineroentregado);
                
                System.out.println("Cambio a devolver: " + cambioDinero + "EUROS");
                
                pedidosCobrados++;
                
                recaudadoTotal += total;
                if(total > pedidoMascaro){
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
        double importeMedio = calcularMedia(recaudadoTotal, pedidosCobrados);
        
        
        System.out.println();
        System.out.println("Fin de la jornada: ");
        System.out.println("Numero de pedidos cobrados:" + pedidosCobrados);
        System.out.println("Recaudacion total: " +recaudadoTotal + "EUROS");
        System.out.println("Pedido mas caro: " + pedidoMascaro + "EUROS");
        System.out.println("Importe medio de los pedidos: " + importeMedio + "EUROS");
         
    }
    //calculo del cambio para despues de que introduzca su dinero el usuario
    public static double calcularCambio( double total, double dineroentregado){
        return dineroentregado - total;
    }
    //funcion de obtencion de precios de los productos del menu para aplicarlos a las cuentas del total
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
    //esta funcion calcula el descuento del 10% donde si el subtotal es igual o mayor a 10 , se aplica la formula
    public static double Calculodescuento( double subtotal){
        if(subtotal >= 10){
            return subtotal * 0.10;
        }
        return 0 ;
    }
    
    public static double calcularMedia( double recaudadoTotal , double pedidosCobrados){
        if(recaudadoTotal > 0){
            double importeMedio = recaudadoTotal/ pedidosCobrados;
            return importeMedio;
        }else {
            return 0 ;
        }
    }
}
