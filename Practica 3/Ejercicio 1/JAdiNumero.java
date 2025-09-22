package Practica_3;
    import java.util.Scanner;
    import java.util.Random;
public class  JAdiNumero extends Juego {
    private int numeroAAdivinar;
    public JAdiNumero(int vidas) {
        super(vidas); 
    }
    public void juega() {
        reiniciaPartida();
        Random rand = new Random();
        numeroAAdivinar = rand.nextInt(11);
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Adivina un número entre 0 y 10: ");
            int intento = sc.nextInt();
            if (intento == numeroAAdivinar) {
                System.out.println("¡Acertaste!");
                actualizaRecord();
                break;
            } else {
                if (intento < numeroAAdivinar) {
                    System.out.println("El número es mayor.");
                } else {
                    System.out.println("El número es menor.");
                }
                boolean quedanVidas = quitaVida();
                if (!quedanVidas) {
                    System.out.println("Fin de la partida. El número era: " + numeroAAdivinar);
                    break;
                }
            }
        }
    }
}



