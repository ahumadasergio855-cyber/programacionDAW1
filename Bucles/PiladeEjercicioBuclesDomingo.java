package com.mycompany.practicadebuclesdomingopuente;
import java.util.Scanner;
/**
 *
 * @author Carmen
 */
public class PracticadebuclesDomingoPuente {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-------------MENU-------------");
        System.out.println("1. Ejercio repaso Pares e Impares");
        System.out.println("2. Ejercio de suma de numeros Positivos");
        System.out.println("3. Ejercio de contar multiplos de 3 de la lista");
        System.out.println("4. Ejercio de contar el mayor y cuantas veces se repite");
        System.out.println("5. Ejercio de numMayor y numMenor y su diferencia entre ambas");
        System.out.println("6. Ejercio de  hasta 0 y suma total y media");
        System.out.println("Selecciona el ejercicio: ");
        int menu = sc.nextInt();
        
        switch(menu){
            case 1:
                int pares = 0;
                int impares = 0;
                for(int i = 1 ; i <=10 ; i++){
                    System.out.println("Introduce un numero entero:");
                    int numero = sc.nextInt();
                    //lo que haces es dividirlo entre 2 y si el resto es igual a 0 sera par
                    if( numero %2 == 0 ){
                        pares++;
                    }else {
                        impares++;
                    }
                }
                System.out.println("pares: " +pares);
                System.out.println("impares: " +impares);
                
                break;
            case 2:
                int positivos = 0;
                int suma = 0;
                for ( int i = 1 ; i <= 8 ; i++){
                    System.out.println("Introduce un numero entero: ");
                    int numero = sc.nextInt();
                    if( numero > 0){
                        suma = suma + numero;
                    }
                }
                System.out.print("Suma positivos:" +suma);
                break;
            case 3: 
                //todas las variables es mejor declararlas fuera del bucle
                int multiplos = 0;
                for( int i = 1; i <= 10; i++){
                    System.out.println("Introduce el numero entero para obtener cuantos multiplos hay de 3 :");
                    int numero = sc.nextInt();
                    
                    if (numero %3 == 0){
                        multiplos++;
                    }
                }
                //errores anteriores: al no tener la variable declarada fuera hay errores de impresion
                System.out.println("Multiplos de 3 son: " + multiplos);
                break;
            case 4: 
               
                int numMayor = 0;
                int numVeces = 0;
                for ( int i = 1 ; i <= 10; i++){
                    System.out.println("Introduce el numero entero para contar el mas mayor y cuantas se repite");
                    int numero = sc.nextInt();
                    
                    if(numero > numMayor){
                        numMayor = numero;
                        numVeces = 1;
                    } 
                    else if (numero == numMayor){
                         numVeces++;
                     }  
                }   
                    System.out.println("Mayor: "+numMayor);
                    System.out.println("Veces que se aparece" +numVeces);
                    
                break;
            case 5:
                numMayor= 0;
                int numMenor = 0;
                for ( int i = 1 ; i <= 10; i++){
                    System.out.println("Introduce el numero entero para operar:");
                    int numero = sc.nextInt();
                    if( i == 1){
                        numMayor = numero ;
                        numMenor = numero;
                    }
                    if( numero > numMayor){
                      numMayor = numero; 
                    }
                    
                    if( numero < numMenor){
                      numMenor = numero;  
                    }
                    
                }
                System.out.println("Mayor" +numMayor);
                System.out.println("Menor" +numMenor);
                int diferencia = numMayor - numMenor ;
                System.out.println("Diferencia: " +diferencia);
                break;
            case 6: 
                //pide al usuario numero hasta que introduzca el numero 0 y luego los cuenta, suma todos y le saca la media de al suma
                suma = 0;
                int cantidad = 0;
               int  numero;
               System.out.print("Introduce un numero (0 para terminar)");
               numero = sc.nextInt();
               while(numero != 0){
                   suma = suma + numero ;
                   cantidad++;
                   
                   System.out.print("Introduce un numero (0 para terminar");
               }
               int media = suma / cantidad ;
               System.out.println("Suma =" +suma);
               System.out.println("Suma :" +cantidad);
               System.out.println("media: " + media);
        }
        
    }
}
