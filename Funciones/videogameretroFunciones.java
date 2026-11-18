Scanner sc = new Scanner(System.in);
        //declaramos las variables
        
        int alquileresRealizados = 0;
        double recaudadoTotal = 0;
        double subtotal = 0;
        double alquilerMascaro = 0;
        int clientesAccion = 0;
        int clientesComedia = 0;
        int clientesCienciaFiccion = 0;
        int clientesTerror = 0;
        int opcion = 0;
        do{
            //menu que se repetira para cuando termine el proceso del registro 
        System.out.println("-----VIDEOCLUB-----");
        System.out.println("1. Nuevo alquiler");
        System.out.println("0. Cerrar Videoclub");
        System.out.println("Selecciona una opcion");
        opcion =sc.nextInt();
        if(opcion == 1){
            System.out.println("Peliculas disponibles: Precios por dia ");
            System.out.println("Tipo Accion(codigo 1)- Precio 2 EUROS");
            System.out.println("Tipo Comedia(codigo 2 - Precio 3 EUROS");
            System.out.println("Tipo Ciencia Ficcion (codigo 3) - Precio 4 EUROS");
            System.out.println("Tipo Terror (codigo 4) - Precio 5 EUROS");
            System.out.println("Introduce el codigo de pelicula: ");
            int codigo = sc.nextInt();
            double precio = obtenerPrecio(codigo);
            System.out.println("Introduce el número de dias: ");
            int numDias = sc.nextInt();
            subtotal  =precio * numDias;
            if(numDias >0){
                double importe = precio * numDias;
                double descuento = calcularDescuento (importe);
                alquileresRealizados++;
                double total = subtotal - descuento;
                
                recaudadoTotal += total;
                if(total>alquilerMascaro){
                    alquilerMascaro = total;
                }
                
                if(precio == 0){
                    System.out.println("Codigo de pelicula no valido");
                } else {
                if(codigo == 1){
                    clientesAccion++;
                } else if (codigo == 2) {
                    clientesComedia++;
                } else if ( codigo == 3){
                    clientesCienciaFiccion++;
                } else {
                    clientesTerror++;
                }
                }
                
                //resumen del cliente
                System.out.println("RESUMEN");
                System.out.println("Subtotal: " + subtotal);
                System.out.println("Descuento: " + descuento);
                System.out.println("total: " + total);
            } else {
                System.out.println("El numero de dias no es valido");
            }
        } else if(opcion != 0) {
            System.out.println("Opcion no valida");
        }
        }while(opcion !=0);
        System.out.println("VIDEOCLUB CERRADO");
        System.out.println("Alquileres realizados: " + alquileresRealizados);
        System.out.println("Recaudacion total: " +recaudadoTotal);
        System.out.println("Media de alquileres: " + CalcularMedia( recaudadoTotal, alquileresRealizados));
        System.out.println("Alquiler mas caro: " +alquilerMascaro);
        System.out.println("Alquileres Accion: " +clientesAccion);
        System.out.println("Alquilres Comedia: " +clientesComedia);
        System.out.println("Alquileres Ciencia Ficcion: " +clientesCienciaFiccion);
        System.out.println("Alquileres Terror: " +clientesTerror);
    }
    
    static double obtenerPrecio(int codigo){
        if( codigo == 1){
            return 2;
        } else if(codigo == 2){
            return 3;
        } else if(codigo == 3){
            return 4;
        }else if (codigo == 4 ){
            return 5;
        } else{
            return 0;
        }
    }
    
      static double calcularDescuento(double importe){
          if( importe >= 40){
              return  importe * 0.20;
          } else if (importe >= 20){
               return importe * 0.10;
          } else {
              return 0;
          }
      }
      static double CalcularMedia(double total, int alquileresRealizados){
          if(alquileresRealizados == 0){
              return 0;
          }
          double media = total / alquileresRealizados;
          return media;
      }
}
