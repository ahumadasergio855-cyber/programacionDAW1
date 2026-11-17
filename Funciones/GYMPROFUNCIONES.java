
package com.mycompany.gymprofunciones;
import java.util.Scanner;
/**
 *
 * @author usuario
 */
public class GymProFunciones {
       
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int opcion = 0;
        double importedescuento = 0;
        double importeFinal = 0;
        int clientesAtendidos = 0;
        int clientesvip = 0;
        double importeMayor = 0;
        double recaudacionTotal = 0;
        do{
            System.out.println("-----GIMANASIO-----");
            System.out.println("1.Registrar cliente");
            System.out.println("0.Cerrar el gimnasio");
            System.out.println("Selecciona una opcion: ");
             opcion= sc.nextInt();
             if(opcion == 1){
                 System.out.println("Todos los precios son mensuales");
                 System.out.println("Membresia Basica(1) - precio 20 EUROS");
                 System.out.println("Membresia Premium(2) - precio 35 EUROS");
                 System.out.println("Membresia VIP (3) - precio 50 EUROS");
                 System.out.println("Introduce el codigo de membresia: ");
                 int codigo =  sc.nextInt();
                 if(codigo !=1 && codigo !=2 && codigo !=3){
                 System.out.println("Error de codigo");
             } else{
                     double precio = obtenerPrecio(codigo);
                     
                     System.out.println("Introduce el numero de meses: ");
                     int numMeses = sc.nextInt();
                     if( numMeses >0){
                         double importe = precio * numMeses;
                          clientesAtendidos++;
                         if(importe >= 100){
                             importedescuento = importe * 0.20;
                         }else if (importe >= 50){
                              importedescuento = importe * 0.10;
                             
                         }else{
                             importedescuento = 0;
                             
                         }
                         importeFinal = importe - importedescuento;
                        if(importeFinal > importeMayor ){
                            importeMayor = importe;
                        }
                        if( codigo == 3){
                            clientesvip++;
                        }
                        
                        recaudacionTotal += importeFinal;
                        System.out.println("Resumen cliente");
                         System.out.println("subtotal= " + importe);
                         System.out.println("descuento: " + importedescuento);
                         System.out.println("Total: " + importeFinal);
                         
                         // en el clinete se muestra el importe final y en el resumen la recaudacion total de todos los clientes
                         
                     }else{
                         System.out.println("Numero de meses erroneo");
                     }
                 }
             }
        }while(opcion !=0);
        
        System.out.println("Gimansio Cerrado");
        System.out.println("Clientes Atendidos:" + clientesAtendidos);
        System.out.println("Recaudacion total:" + recaudacionTotal);
        System.out.println("importe medio: " + CalcularMedia( recaudacionTotal, clientesAtendidos));
        System.out.println("Clientes VIP registrados:" + clientesvip);
        System.out.println("Importe mayor: " + importeMayor);
    }
    
    static double obtenerPrecio( int codigo){
        switch (codigo) {
            case 1:
                return 20;
            case 2:
                return 35;
            default:
                return 50; 
        }
    
    }
     static double CalcularMedia( double recaudacionTotal, int clientesAtendidos){
        if( clientesAtendidos > 0){
            double media = recaudacionTotal / clientesAtendidos;
            return media;
        } else{
            return 0;
        }
     }
}
