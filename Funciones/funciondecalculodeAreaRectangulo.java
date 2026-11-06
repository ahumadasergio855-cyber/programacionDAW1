package com.mycompany.practicadefunciones;
import java.util.Scanner;
/**
 *
 * @author Carmen
 */
public class Practicadefunciones {

    public static double areaRectangulo(double base , double altura){
        
         return base * altura;
    }
    
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Introduce la base:");
        double base = sc.nextDouble();
        
        System.out.println("Introduce la altura: ");
        double altura = sc.nextDouble();
        
        double area = areaRectangulo(base , altura);
        System.out.println("Area: " + area);
    }
    
    
}
