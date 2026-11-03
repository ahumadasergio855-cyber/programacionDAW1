case 2:
                System.out.println("Introduce un numero positivo:");
                 numero = sc.nextInt();
                 int cuadradoperfecto = 0;
                 int resto = 0;
                if(numero < 0){
                    System.out.println("El numero introducido no es valido");
                }
                else{
                    System.out.println("El numero introducido es valido");
                    for ( int i = 1 ;  i * i * i<= numero; i++){
                         cuadradoperfecto = i ;
                    }
                    resto = numero - ( cuadradoperfecto * cuadradoperfecto * cuadradoperfecto);
                }
                if(resto !=0){
                System.out.println("resultado :" + cuadradoperfecto + "con resto" + resto);
                } else {
                    System.out.println("el resultado es:" +cuadradoperfecto);
                }
        }
     
