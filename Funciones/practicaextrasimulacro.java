package com.mycompany.parkinejerciciofunciones;
import java.util.Scanner;
/**
 *
 * @author usuario
 */
public class ParkinejercicioFunciones {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int clientesatendidos = 0;
        double recaudadototal = 0;
        double importe = 0;
        double ticketMascaro = 0;
        int opcion = 0;
        
        do{
            System.out.println(" MENU ");
            System.out.println("1.Registrar vehiculo");
            System.out.println("2.Cerrar parking");
            System.out.println("Elige una opcion: ");
            opcion = sc.nextInt();
        
           if(opcion == 1){
           System.out.println("Un parking cobra: ");
           System.out.println("Moto(codigo 1): 2 EUROS por Hora");
           System.out.println("Coche (codigo 2): 4 EUROS por Hora");
           System.out.println("Furgoneta(codigo 3): 6 EUROS por hora");
           System.out.println("Selecciona el vehiculo que deseas registrar: ");
           
           
                  
                   System.out.println("Introduce el codigo del vehiculo");
                   int codigo = sc.nextInt();
                   double tarifa = obtenerTarifa( codigo);
                   if (tarifa == 0){
                       System.out.println("Codigo no valido");
                   }else {
                       
                        System.out.println("Introduce las horas que deseas alquilarlo: ");
                        int horasalquiladas = sc.nextInt();
                        System.out.println("Introduce el dinero: ");
                          importe = sc.nextDouble();
                          clientesatendidos ++;
                          while (horasalquiladas <=  0 ){
                          System.out.println("Horas no validas");
                          horasalquiladas = sc.nextInt();
                        }
                         importe = tarifa * horasalquiladas;
                        
                   } if( importe > 20){
               double descuento = importe * 0.15;
               recaudadototal += (importe - descuento);
               
           } else {
               recaudadototal += importe;
           }
           
          if( importe > ticketMascaro){
              ticketMascaro = importe;
          }    
           }  
         }while(opcion !=2);
           
          
          System.out.println("PARKING CERRADO");
                System.out.println("Clientes atendidos: " + clientesatendidos);
                System.out.println("Recaudacion total: " + recaudadototal);
                System.out.println("Ticket mas caro: " + ticketMascaro);
    }
    
    static double obtenerTarifa( int codigo){
        if( codigo == 1){
            return 2;
        }else if(codigo == 2) {
                return 4;
                }else if(codigo == 3){
                    return 6;
                }
        return 0;
    }
}
