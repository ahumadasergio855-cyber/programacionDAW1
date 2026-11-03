Scanner sc = new Scanner(System.in);
        System.out.println("Menu de ejercicios");
        System.out.println("Ejercio 1 de cuadrado perfecto");
        System.out.println("Escribe el numero de ejercicio");
        int menu = sc.nextInt();
        int numero = 0;
        switch(menu){
            
            case 1:
                System.out.println("Introduce un numero positivo");
                numero = sc.nextInt();
            int cuadradoperfecto = 0;
            int resto = 0;
                if(numero < 0){
                    System.out.print("El dato introducido es invalido");
                    
                }else{
                    System.out.println("El dato introducido es valido");
                    //si quiero sacar la raiz de algo debo conseguir su cubo perfecto se necesita el valor maximao en este caso
                    //si hago que el bucle funcione hasta que el numero sea menor que el cubo de i se conseguira su cuadrado perfecto
                    
                    for( int i = 1 ; i * i * i <=numero ; i++){
                        cuadradoperfecto = i;
                        //se guarda el dato del cuadrado perfecto al terminar el bucle
                    }
                    //para sacar el resto de eso simpre resta el numero original con la multiplicación ya sea de un cuadrado perfecto o de una raiz
                    resto = numero - (cuadradoperfecto * cuadradoperfecto * cuadradoperfecto);
                    //este condicional nos indica si el resto es distinto de 0 que se muestre sino , no nos interesa ver que el resto es 0.
                    if(resto !=0){
                        System.out.println("resultado:"+ cuadradoperfecto + "con resto" + resto);
                    }else{
                        System.out.println("Resultado:" + cuadradoperfecto);
                    }
                    
                }
                break;
            
            case 2:
                System.out.println("Introduce el numero:");
                numero = sc.nextInt();
                int raiz = 0;
                 resto = 0;
                if( numero <=0){
                    System.out.println("El dato introducido no es valido");
                }
                for(int i= 1; i * i <=numero; i++){
                    raiz = i;
                }
                resto = numero - ( raiz * raiz);
                if( resto != 0){
                    System.out.println("resultado : " + raiz + " con resto " +resto);
                } else {
                    System.out.println("resultado :" + raiz);
                }
               default:
           System.out.println("Fin de la ejecucion");  
        }
       
      }
}
