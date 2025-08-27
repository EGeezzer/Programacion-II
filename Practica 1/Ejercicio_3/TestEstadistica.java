package Practica_1.Ejercicio_3;
import java.util.Scanner;
public class TestEstadistica {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        double[] numeros = new double[10];
        System.out.println("Ingrese 10 números: ");
        for (int i = 0; i < 10; i++) {
            numeros[i] = sc.nextDouble();
        }
        // Crear objeto Estadistica
        Estadistica est = new Estadistica(numeros);
        System.out.printf("El promedio es %.2f\n", est.promedio());
        System.out.printf("La desviación estándar es %.5f\n", est.desviacion());
        sc.close();
    }
}

    
