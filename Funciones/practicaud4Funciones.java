import java.util.Scanner;
import java.lang.Math;
        
    

/**
 *
 * @author usuario
 */
public class Ud4EjercicioFunciones {
     
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("------Ejercicio de Funciones-----");
        System.out.println("Ejercicio superficie");
        System.out.println("Ejercicio pares ");
        System.out.println("Ejercicio distancia ");
        System.out.println("Ejercicio calculo segundos ");
        System.out.println(" SALIR ");
        System.out.println("Seleccione una opcion: ");
        
        int menu = sc.nextInt();
        
        switch(menu){
            case 1:
                System.out.println("Dame el número de radio de la superficie:");
                double radio = sc.nextDouble();
                 superficie(radio);
                 volumen(radio);
                
                break;
                
            case 2:
                System.out.println("Introduce un numero entero");
                int numPar = sc.nextInt();
                //declaracion de la funcion 
                 numPares(numPar);
                 
                 break;
            case 3: 
                System.out.print("Introduce la coordenada del eje x1");
                double x1 = sc.nextDouble();
                System.out.print("Introduce la coordenada del eje y1");
                double y1 =  sc.nextDouble();
                System.out.print("introduce la coordenada del ejece x2");
                double x2 = sc.nextDouble();
                System.out.print("introduce la coordenada del eje y2");
                double y2 = sc.nextDouble();
                
                double distance= distancia(x1, y1, x2, y2);
                
                System.out.println("La distancia es: " + distance);
        }
        
    }
        public static double superficie(double radio){
             double superficie = (4 * Math.PI) * Math.pow(radio, 2);
             System.out.println("la superficie es " +superficie);
             //retornara el valor de la superficie que es la formula 
             return superficie;
        }
        public static double volumen(double radio){
            //hay que sepafar la division para que se haga esa operacion antes y luego multiplciarlo por el PI
             double vol = (4.0/3.0) * Math.PI * Math.pow(radio, 3);
             System.out.println("El volumen es:" + vol);
             return vol;
        }
        
        public static int numPares(int numPar){
            int pares = 2;
            
            for(int i = 0; i < numPar; i++){
                // se saca el valor del par que es 2 y se imprime
                System.out.print( pares + " ");
                //se actualiza el valor sumando 2 al numero anterior
                pares = pares + 2 ;
            }
            //cuando termine de dar vueltas es decir que vea que pasa del numero original de numero que introduce el usuario
            // y este da un salto de linea a devolver el valor de numPar al usuario.
            System.out.println();
            return numPar;
        }
        
        public static double distancia( double x1, double y1, double x2, double y2){
            double distance = Math.sqrt((Math.pow((x1 - x2), 2) )+ Math.pow((y1 - y2), 2) );
            System.out.print("distancia es:" +distance);
            return distance;
                    
        }
}
