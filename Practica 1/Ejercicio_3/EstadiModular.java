package Practica_1.Ejercicio_3;
import java.util.Scanner;
public class EstadiModular {
    public static double promedio(double[] numeros) {
        double suma = 0;
        for (double num : numeros) {
            suma += num;
        }
        return suma / numeros.length;
    }
    // Método para calcular desviación estándar
    public static double desviacion(double[] numeros) {
        double prom = promedio(numeros);
        double suma = 0;
        for (double num : numeros) {
            suma += Math.pow(num - prom, 2);
        }
        return Math.sqrt(suma / (numeros.length - 1));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] numeros = new double[10];
        System.out.println("Ingrese 10 números: ");
        for (int i = 0; i < 10; i++) {
            numeros[i] = sc.nextDouble();
        }
        double prom = promedio(numeros);
        double desv = desviacion(numeros);
        System.out.printf("El promedio es %.2f\n", prom);
        System.out.printf("La desviación estándar es %.5f\n", desv);
        sc.close();
    }
}

    
    
