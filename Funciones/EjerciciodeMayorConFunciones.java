       case 2:
                System.out.println("Introduce el primer numero");
                int a = sc.nextInt();
                System.out.println("Introduce el segundo numero");
                int b= sc.nextInt();
                mostrando(a,b);
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
}
