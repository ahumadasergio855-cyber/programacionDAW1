package com.mycompany.practicaud3funciones;
import java.util.Scanner;
/**
 *
 * @author usuario
 */
public class Practicaud3Funciones {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu de operaciones"); 
        System.out.println("1-suma , 2- resta , 3- multiplicacion, 4- division , 5 - salir del menu");
        System.out.println("Introduce el tipo de operacion que quieres realizar: ");
         int usuarioopcion = sc.nextInt();
      do{  
       int menuOpcion= 0;
        switch(menuOpcion){
            case 1:
                System.out.println("Introduce el valor de x para la suma:");
                double sumando1 = sc.nextDouble();
                System.out.println("Introduce el valor de y para la suma:");
               double sumando2 = sc.nextDouble();
              double resultadosuma;
                 resultadosuma = suma( sumando1, sumando2);
              System.out.println("resultado:" + resultadosuma);
              System.out.println("Fin de la ejecucion");
              
              break;
            
            case 2:
                System.out.println("Introduce el valor de x para la resta:");
                double restando1 = sc.nextDouble();
                System.out.println("Introduce el valor de y para la suma:");
               double restando2 = sc.nextDouble();
              double resultadoresta;
            resultadoresta = resta( restando1 , restando2);
              System.out.println("resultado:" + resultadoresta);
              System.out.println("Fin de la ejecucion");
              
              break;
            
            case 3:
                System.out.println("Introduce el valor de x para la resta:");
                double multiplicado1 = sc.nextDouble();
                System.out.println("Introduce el valor de y para la suma:");
               double multiplicado2= sc.nextDouble();
              double resultadomultiplicacion;
            resultadomultiplicacion = multiplicacion( multiplicado1 , multiplicado2);
              System.out.println("resultado:" + resultadomultiplicacion);
              System.out.println("Fin de la ejecucion");
              
              break;
            
            case 4: 
                System.out.println("Introduce el numero que deseas dividir");
                double divisor1 = sc.nextDouble();
                System.out.println("Introduce el numero por el que lo quieres dividir");
                double divisor2 = sc.nextDouble();
                double resultadodivision;
                resultadodivision = division(divisor1 , divisor2);
                System.out.println("resultado: " +resultadodivision);
                
            default:
                System.out.println("Final de las operaciones");
        }
      }while(usuarioopcion != 5);
      System.out.println("Fin de ejecución");
    }
    
    public static double suma ( double x , double y){
        
        double resultadosuma = x + y ;
        return resultadosuma;
    }
    
    public static double resta ( double x , double y){
        
        double resultadoresta = x - y ;
        return resultadoresta;
    }
   
    public static double multiplicacion( double x , double y){
        
        double resultadomultiplicacion= x * y ;
        return resultadomultiplicacion;
    }
    
    public static double division( double x , double y){
        
        double resultadodivision= x / y ;
        escero(resultadodivision);
        return resultadodivision;
    }
    public static void escero( double y){
        
        if( y == 0){
            System.out.println("no se puede dividir por 0");
        }
        
    }

}
