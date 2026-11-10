public class PracticalogicadeFuncionesUD4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu de logica de funciones Ejercicicios");
        System.out.println("Ejercicio ECO");
        int menu = sc.nextInt();
        switch(menu){
            case 1:
            System.out.println("Introduzca un numero");
            int n= sc.nextInt();
            //llamada de una funcion
            eco( n);

            break;
            case 2:
                System.out.println("Introduce el primer numero");
                int a = sc.nextInt();
                System.out.println("Introduce el segundo numero");
                int b= sc.nextInt();
                mostrando(a,b);
                break;
                
            case 3:
                System.out.println("Opcion de calculo del area( 1 )");
                System.out.println("Opcion de calculo del volumen( 2)");
                System.out.println("Elige la opcion que desees calcular el cilindro:");
                
                int opcionCalculo = sc.nextInt();
                switch(opcionCalculo){
                    case 1:
                        System.out.println("Introduce el radio del cilindro");
                         double radio = sc.nextDouble();
                         System.out.println("Introduce la altura del cilindro");
                         double altura = sc.nextDouble();
                         area(radio, altura);
                         break;
                    
                    case 2:
                        System.out.println("Introduce el radio del cilindro");
                          radio = sc.nextDouble();
                         System.out.println("Introduce la altura del cilindro");
                          altura = sc.nextDouble();
                         volumen(radio, altura);
                         break;
                }
                
        }
    }
    
     static void eco(int n){
         //el numero de veces que se introduzca del usuario 
        for(int i = 0; i < n; i++){
            System.out.println("Eco...");
        }
    }
     public static void mostrando( int a , int b){
          int mayor = 0;
          int menor = 0;
         if(a > b){
             mayor = a;
         } else{
             mayor = b;
         }
         
         if( a < b){
             menor = a;
         }else{
             menor = b;
         }
         for(int i = menor; i<= mayor; i++){
             System.out.println(i);
         }
     }
     public static double area(double radio, double altura){
         double area = 2 * Math.PI * ( altura + radio);
         System.out.println("El area es:" + area);
         return area;
     }
     public static double volumen( double radio, double altura){
         double volumen = Math.PI * (Math.pow(radio, 2) * altura);
         System.out.println("El volumen es:");
         return volumen;
     }
}
