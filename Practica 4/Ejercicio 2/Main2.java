package Practica_4;
import java.util.Random;
public class Main2 {
    public static void main(String[] args) {
        Random rand = new Random();
        Figura[] figuras = new Figura[5];
        // Crear 5 figuras aleatorias
        for (int i = 0; i < figuras.length; i++) {
            int tipo = rand.nextInt(2); // 0 = Cuadrado, 1 = Círculo
            if (tipo == 0) {
                double lado = 1 + rand.nextInt(10);
                figuras[i] = new Cuadrado("Rojo", lado);
            } else {
                double radio = 1 + rand.nextInt(10);
                figuras[i] = new Circulo("Azul", radio);
            }
        }
        // Mostrar resultados
        for (Figura f : figuras) {
            System.out.println(f.toString());
            if (f instanceof Coloreado) {
                Coloreado c = (Coloreado) f;
                System.out.println("Método comoColorear: " + c.comoColorear());
            }
            System.out.println();
        }
    }
}



