package com.mycompany.ejerciciotablas;
import java.util.Arrays;
/**
 *
 * @author usuario
 */
public class Ejerciciotablas {

    public static void main(String[] args) {
        
        /**
         * Arrays.fill ( sueldo , 324,34) // inicializa todos los elementos
         *               tabla     valor para todos
         * 
         * static void fill(tipo t[](seria la tabla) , int desde ( indice donde inicia) int hasta ( hasta donde llegue el indice)   , tipo de valor ( el entero en este caso) )
         * 
         * elementos desde indice 3 al 6
         * Arrays.fill(sueldo , 3 , 7 , 1234.56); el 7 no se incluye y a todos se les da el mismo valor 
         * 
         * 
         * Funcion equals:
         * 
         * SI lo que queremos es comprobar que el int t1 [] = [ 2 , 3 , 5 }
         * y t2 = { 2, 3, 5 }
         * 
         * dara false por que tienen distinta referencia
         * 
         * pero si ponemos static boolean equals ( tipo a [] . tipo b []);
         */
        /**int t1[]= { 1 ,2 ,3};
        int t2[] = { 1 ,2 ,3};
        // se llama al resultado desde fuera para luego imprimirlo
        boolean resultado = Arrays.equals(t1 , t2);
        System.out.println(resultado);
        
       /**
        * static int binarySerach ( tipo t [] , tipo aBuscar);
        * Nos dice en que posicion se encuentra el numero que busuqemos
        * en caso de que existe en la tabla nos dira el indice en positivo
        * si da negativo significa que no existe pero ese numero negativo indica en que posicion estaria el numero que buscamos para que el array este ordenado
        * Ejemplo:
        */
       
       int t3 []= { 7 , 9 , 20};
       
       int posicion =  Arrays.binarySearch(t3, 9);// nos mostara la posicion 1 
       // si probamos otr numero
       
       int posicion2 = Arrays.binarySearch(t3, 8);// nos daria -1
       // si queremos saber donde deberiamos insertar el 8 para mantener el array ordenado seria
       int indiceDeInserccion = -posicion2 - 1;
       // nos devolvera 1 por que deberia estar en el indice 1 el numero 8 para mantener el orden del Array.
       
       int posicion3 = Arrays.binarySearch(t3, 84);
       if(posicion3 > 0){
           System.out.println(" Encontrado en el indice :" +posicion3);
       } else {
           System.out.print("Lo sentimos , no se ha encontrado");
       }
       int indiceDeInserccion2 = -posicion3 - 1;
       System.out.println("indice inserccion: " + indiceDeInserccion2);
               
    }
    
     
         
     
}
