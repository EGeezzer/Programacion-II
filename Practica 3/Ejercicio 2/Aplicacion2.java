package Practica_3;
public class Aplicacion2 {
    public static void main(String[] args) {
        // Juego clásico
        JAdiNumero2 juego1 = new JAdiNumero2(3);
        juego1.juega();

        // Juego solo con pares
        JAdiPar juego2 = new JAdiPar(3);
        juego2.juega();

        // Juego solo con impares
        JAdiImpar juego3 = new JAdiImpar(3);
        juego3.juega();
    }
}


