package com.mycompany.parkinejerciciofunciones;
import java.util.Scanner;
/**
 *
 * @author usuario
 */
public class ParkinejercicioFunciones {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" MENU ");
        System.out.println("1.Registrar vehiculo");
        System.out.println("2.Cerrar parking");
        System.out.println("Elige una opcion: ");
        int opcion = sc.nextInt();
        int clientesatendidos = 0;
        double recaudadototal = 0;
        double importe = 0;
         do{
           System.out.println("Un parking cobra: ");
           System.out.println("Moto(codigo 1): 2 EUROS por Hora");
           System.out.println("Coche (codigo 2): 4 EUROS por Hora");
           System.out.println("Furgoneta(codigo 3): 6 EUROS por hora");
           System.out.println("Selecciona el vehiculo que deseas registrar: ");
           int opcionregistro = sc.nextInt();
           
                  
                   System.out.println("Introduce el codigo del vehiculo");
                   int codigo = sc.nextInt();
                   obtenerTarifa( codigo);
                   if (codigo <0){
                       System.out.println("Codigo no valido");
                   }else {
                       System.out.println("Vas a registrar una moto");
                       System.out.println("Introduce el codigo del vehiculo");
                        codigo = sc.nextInt();
                        System.out.println("Introduce las horas que deseas alquilarlo: ");
                        int horasalquiladas = sc.nextInt();
                        System.out.println("Introduce el dinero: ");
                          importe = sc.nextDouble();
                         importe = obtenerTarifa(codigo) * horasalquiladas;
                        if(horasalquiladas > 0 ){
                            
                         recaudadototal = obtenerTarifa(codigo) * horasalquiladas;
                          clientesatendidos++;
                        } else{
                            System.out.println("el numero de horas no es valido");
                        }
                        
                        
                   }     
                   
         }while(opcion !=2);
           if( importe > 20){
               recaudadototal = importe 
           }
         
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
