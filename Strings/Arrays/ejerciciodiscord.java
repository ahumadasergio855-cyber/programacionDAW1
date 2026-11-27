
import java.awt.Container;
import javax.print.event.PrintEvent;

public class EjercicioCadenas {
    public static void main(String[] args) {

        // aquí el código

        String Frase = "hola sergio";
        String[] arrayPalabras = Frase.split(" ");
        // acuerdate: si le dices a la función split("")
        // le estás diciendo: [ "h" , "o" , "l" , "a" ,"s" , "e" , "r" , "g" , "i" , "o"
        // ]
        // tienes que decirle por donde quieres cortar, en este caso es por el espacio
        // entonces seria String[] arrayPalabras = Frase.split(" ") dejando un espacio
        // en medio, indicando por donde quieres cortar la frase
            String concatenacionPalabra="";
        for (int i = 0; i < arrayPalabras.length; i++) {
            String primerPalabra = arrayPalabras[i];
            String [] arrayLetra = primerPalabra.split("");
            String Primeraletra = arrayLetra[0].toUpperCase();
            System.out.println("La primera letra de la palabra 1(hola): " + Primeraletra);
            // aquí lo estás haciendo bien pero te falta algo, que es decir arrayPalabras[i]
            // al principio i es 0 entonces arrayPalabras[i] como i es 0 coje "hola"
            // cuando vuelve a dar la segunda vuelta i ya no es 0 (cero) es 1 (uno) entonces
            // te coje la segunda palabra que en este caso sería "sergio" entonces lo que
            // tienes que decir sería String[] primeraPalabra = arrayPalabras[i] en la
            // primera vuelta primeraPalabra tiene "hola" entonces ya puedes hacer String[]
            // arrayLetras = primeraPalabra.split("") y ya puedes hacer String letra =
            // arrayLetras[0] ahora te coje "h" y le aplicas el toUpperCase()

            // Ahora con lo que te he explicado intentalo hacer, de todas maneras si no
            // entiendes algo te dejo un ejemplo debajo
            // es una función pero no le hagas caso a la función sino al contenido

            
            for (i = 0; i < arrayLetras; i++) {
                concatenacionPalabra =  concatenacionPalabra + arrayLetras[i];
            }
            System.out.println(concatenacionPalabra);
        }

    }
