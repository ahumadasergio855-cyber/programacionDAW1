 case 4:
                mayor = 0;
                menor = 0;
                for( int i = 1 ; i <= 10; i++){
                    System.out.println("Introduce el numero");
                    numero = sc.nextInt();
                    if (numero > 0){
                        mayor++;
                    }
                    if ( numero < 0){
                        menor++;
                    }
                    
                }
                System.out.println("mayor:" + mayor);
                System.out.println("menor: " + menor);
               default:
           System.out.println("Fin de la ejecucion");  
        }
       
