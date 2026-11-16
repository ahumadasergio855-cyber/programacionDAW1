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
        if( opcion == 1){
         do{
           System.out.println("Un parking cobra: ");
           System.out.println("Moto(codigo 1): 2 EUROS por Hora");
           System.out.println("Coche (codigo 2): 4 EUROS por Hora");
           System.out.println("Furgoneta(codigo 3): 6 EUROS por hora");
           System.out.println("Selecciona el vehiculo que deseas registrar: ");
         }while(opcion !=2);
        } else {
            
        }
         
    }
}
