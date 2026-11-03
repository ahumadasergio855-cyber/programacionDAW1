case 3:
                int mayor = 0 ;
                int menor = 0 ;
                //se comparan hasta que se encuentre el valor mas pequeño y el valor mas grande
                for(  int i = 1 ; i <=10; i++){
                
                System.out.println("Introduce el numero en cuestion:");
                numero = sc.nextInt();
                if ( numero == 1){
                    // se asigna que el mayor y el menor que tienen valor 0 valgan lo mismo del numero introducido
                    mayor = numero ;
                    menor = numero;
                  // logica de comparacion de numero mayor y menor  
                }
                if (numero > mayor){
                    // si el numero es mayor el valor del numero sea ese y si el numero es menor se guardara en el otro if
                    mayor = numero;
                }
                if(numero < menor){
                    menor = numero;
                }
                
                System.out.println("muestra");
                System.out.println("el mayor:" + mayor);
                System.out.println("el menor:" + menor);
                }
                
               default:
           System.out.println("Fin de la ejecucion");  
        }
       
      }
}
