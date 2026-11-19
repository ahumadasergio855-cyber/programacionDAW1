import java.util.Scanner;

public class TorneoDados {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numRondas;

        // Validación del número de rondas
        do {
            System.out.println("Introduce el numero de rondas:");
            numRondas = sc.nextInt();

            if (numRondas <= 0) {
                System.out.println("ERROR. Debe ser mayor que 0");
            }

        } while (numRondas <= 0);

        int puntos1 = 0;
        int puntos2 = 0;
        int puntos3 = 0;

        // Rondas
        for (int ronda = 1; ronda <= numRondas; ronda++) {

            System.out.println("---- RONDA " + ronda + " ----");

            puntos1 += leerTirada(1);
            puntos2 += leerTirada(2);
            puntos3 += leerTirada(3);
        }

        // Mostrar resultados
        mostrarResultadoJugador(1, puntos1);
        mostrarResultadoJugador(2, puntos2);
        mostrarResultadoJugador(3, puntos3);

        // Obtener puntuación máxima
        int maximo = ObtenerMaximo(
                ObtenerMaximo(puntos1, puntos2),
                puntos3
        );

        // Calcular ganador
        int ganador;

        if (puntos1 == maximo) {
            ganador = 1;
        } else if (puntos2 == maximo) {
            ganador = 2;
        } else {
            ganador = 3;
        }

        // Participantes destacados
        int destacados = 0;

        if (esParticipanteDestacado(puntos1)) {
            destacados++;
        }

        if (esParticipanteDestacado(puntos2)) {
            destacados++;
        }

        if (esParticipanteDestacado(puntos3)) {
            destacados++;
        }

        System.out.println("-----------------------");
        System.out.println("Ganador: Participante " + ganador);
        System.out.println("Puntuacion maxima: " + maximo);
        System.out.println("Participantes con al menos 20 puntos: " + destacados);
    }

    // Lee una tirada válida
    static int leerTirada(int jugador) {

        Scanner sc = new Scanner(System.in);

        int tirada;

        do {
            System.out.print("Tirada del participante " + jugador + ": ");
            tirada = sc.nextInt();

            if (tirada < 1 || tirada > 6) {
                System.out.println("Valor incorrecto.");
            }

        } while (tirada < 1 || tirada > 6);

        return tirada;
    }

    // Muestra los puntos de un jugador
    static void mostrarResultadoJugador(int jugador, int puntos) {
        System.out.println(
                "Participante " + jugador + ": " + puntos + " puntos");
    }

    // Devuelve true si tiene al menos 20 puntos
    static boolean esParticipanteDestacado(int puntos) {

        if (puntos >= 20) {
            return true;
        } else {
            return false;
        }
    }

    // Devuelve el mayor de dos valores
    static int ObtenerMaximo(int valor1, int valor2) {

        if (valor1 > valor2) {
            return valor1;
        } else {
            return valor2;
        }
    }
}
