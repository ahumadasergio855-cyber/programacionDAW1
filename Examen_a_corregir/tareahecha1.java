import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class ExamenCorregir {

    public static void main(String[] args) {
        System.out.println("----- MENU DE ENTRADAS DE CINE -----");
        System.out.println("1. Entrada estandar (8.00 euros/persona");
        System.out.println("2. Entrada joven (6.00 euros /persona ");
        System.out.println("3. Entrada senior (2.50 euros /persona");
        System.out.println("4. Entrada familiar (pack 30.00 euros hasta 6 personas");
        Scanner sc = new Scanner(System.in);
        // empezamos con la estructura de switch para el menu de entradas
        System.out.print("\nSelecciona una opcion: ");
        int menuOpciones = sc.nextInt();

        switch (menuOpciones) {
            case 1:
                System.out.print("Introduce el numero de entradas: ");
                int numeroEntradas = sc.nextInt();
                if (numeroEntradas <= 0) {
                    System.out.println("La cantidad de entradas no es valido");
                    break;
                }
                double totalEntradas = 0;

                totalEntradas = 8 * numeroEntradas;
                System.out.println("Total a pagar : " + totalEntradas + "0" + " euros");

                break;
            case 2:
                System.out.print("Introduce la edad: ");
                int edadCliente = sc.nextInt();
                if (edadCliente >= 120) {
                    System.out.println("Edad introducida no valida");
                    break;
                }
                if (edadCliente >= 12 && edadCliente <= 25) {
                    System.out.println("Dato valido de edad");

                } else {
                    System.out.println("No puede comprar este tipo de entrada: ");
                    break;
                }
                System.out.print("Introduce el numero de entradas: ");
                numeroEntradas = sc.nextInt();
                if (numeroEntradas <= 0) {
                    System.out.println("La cantidad de entradas no es valido");
                    break;
                }
                int numeroPalomitas = 1;
                numeroPalomitas = 1 * numeroEntradas;
                totalEntradas = 6 * numeroEntradas;
                System.out.println("total a pagar: " + totalEntradas + "0");
                System.out.println("Incluye: " + numeroPalomitas + " palomitas gratis.");

                break;

            case 3:
                System.out.print("Introduce la edad: ");
                edadCliente = sc.nextInt();
              
                if(edadCliente < 65 && edadCliente > 120 ){
                    System.out.println("Edad introducida no valida");
                } else {
                System.out.print("Introduce el numero de entradas: ");
                numeroEntradas = sc.nextInt();
                if (numeroEntradas <= 0) {
                    System.out.println("La cantidad de entradas no es valido");
                    break;
                }
                
                int bebidasGratis = 1;
                bebidasGratis = 1 * numeroEntradas;
                totalEntradas = 2.50 * numeroEntradas;
                System.out.println("total a pagar: " + totalEntradas + "0");
                System.out.println("Incluye: " + bebidasGratis + " bebidas gratis.");
                }
                break;
            case 4:
                System.out.print("Introduce el numero de personas del grupo por favor: ");
                int numeroDePersonas = sc.nextInt();
                int grupoNumero = 1;
                int precioOriginal = 30; // haria la función de una constante

                // if ( grupoNumero < 6 ) {
                // grupoNumero = 1;
                // }else {
                // grupoNumero = (int) Math.ceil(numeroDePersonas / 6);
                // }

                if (numeroDePersonas > 6) {
                    double grupos = (double) numeroDePersonas / 6;
                    grupoNumero = (int) Math.ceil(grupos);
                    System.out.println("\n".repeat(4) + "El precio es: " + (precioOriginal * grupoNumero) + "  €");
                } else {
                    if (numeroDePersonas >= 3 && numeroDePersonas <= 6) {
                        System.out.println("\n".repeat(4) + "El precio es: " + precioOriginal + "  €");
                    } else {
                        System.out.println("El numero de personas introducido no es valido");
                    }
                }

            {
                // Ambito
                int feo = 2;
                System.out.println("gola");
                System.out.println(feo);
            }

                int numero1 = 1;

                for (int pepito = 0; pepito < 10; pepito++) {
                }
                for (int i = 0; i < 10; i++) {
                    System.out.println(numero1);
                }

                 numeroPalomitas = 2;
                int numeroBebidas = 2;

                System.out.println("Incluye" + (numeroPalomitas * grupoNumero) + " Palomitas gratis");
                System.out.println("Incluye" + (numeroBebidas * grupoNumero) + " Bebidas gratis");

                break;
            default:
                System.out.println("Error.Final de la ejecucion");
        }
    }
}
