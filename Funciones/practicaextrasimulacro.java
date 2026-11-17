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
        double media = 0;
        int opcion = 0;
        
        do{
            System.out.println(" MENU ");
            System.out.println("1.Registrar vehiculo");
            System.out.println("2.Cerrar parking");
            System.out.println("Elige una opcion: ");
            opcion = sc.nextInt();
            if(opcion != 1 && opcion !=2){
                System.out.println("Opcion incorrecta");
            }else {
        
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
                        
                         
                          while (horasalquiladas <=  0 ){
                          System.out.println("Horas no validas");
                          horasalquiladas = sc.nextInt();
                        }
                         clientesatendidos ++;
                         importe = tarifa * horasalquiladas;
                     double importeFinal = importe;
                       if( importe > 20){
               double descuento = CalcularDescuento(importe);
               importeFinal= importe - descuento;
               
               } 
                   recaudadototal += importeFinal;
                  media = CalculoMedia(recaudadototal , clientesatendidos);
              if( importe > ticketMascaro){
                   ticketMascaro = importe;
                 }    
               }    
                         
                   }
        }
            
         }while(opcion !=2);
           
          
          System.out.println("PARKING CERRADO");
                System.out.println("Clientes atendidos: " + clientesatendidos);
                System.out.println("Recaudacion total: " + recaudadototal);
                System.out.println("Ticket mas caro: " + ticketMascaro);
                System.out.println("La media de pedidos cobrados es: " + media);
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
    
    static double CalcularDescuento(double importe){
        double importedescuento = importe * 0.15;
        return importedescuento;
    }
    
    static double CalculoMedia( double recaudadototal, int clientesatendidos){
        if(recaudadototal > 0){
       double mediaCobrado = recaudadototal  / clientesatendidos ;
       return mediaCobrado;
        }else {
            return 0 ;
        }
    }
}
