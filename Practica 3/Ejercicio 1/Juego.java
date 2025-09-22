package Practica_3;
public class Juego {
    protected int numeroDeVidas;
    protected int record;
    public Juego(int numeroDeVidas) {
        this.numeroDeVidas = numeroDeVidas;
        this.record = 0;
    }

    public void reiniciaPartida() {
        System.out.println("\nNueva partida iniciada.");
    }

    public void actualizaRecord() {
        if (numeroDeVidas > record) {
            record = numeroDeVidas;
            System.out.println("¡Nuevo récord! Vidas restantes: " + record);
        }
    }

    public boolean quitaVida() {
        numeroDeVidas--;
        if (numeroDeVidas > 0) {
            System.out.println("Te queda(n) " + numeroDeVidas + " vida(s).");
            return true; // Aún quedan vidas
        } else {
            System.out.println("¡Te has quedado sin vidas!");
            return false; // No quedan vidas
        }
    }
}



