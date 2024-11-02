import java.util.Random;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        System.out.println("Hola bienvenid@ al juego adivina, adivinador");
            Scanner teclado = new Scanner(System.in);
            System.out.println("¿Cual es tu nombre?");
            String nombre = teclado.nextLine();
        System.out.println("¡Hola!" + nombre);
            int numero = new Random().nextInt(100);
            int numeroDeIntentos = 0;

            while (numeroDeIntentos < 5){//me permite repetir el ciclo hasta el juagador acierte o llegue al limite de intentos
                System.out.println("Escribe un número entre 0 y 100");
                int numeroAleatorio = teclado.nextInt();
                numeroDeIntentos++;

            if (numeroAleatorio == numero) {
                System.out.println("Acertaste el número en" + numeroDeIntentos + "intentos");
                break; //interrumpe el ciclo while
            } else if (numeroAleatorio < numero){
                System.out.println("El úmero que escribiste es menor");
            } else {
                System.out.println("El número que escrbiste es mayor");
            }
            }

            if (numeroDeIntentos == 5){
                System.out.println("Lo siento, no adivinaste, el número correcto era:" + numero);
            }
    }
}

