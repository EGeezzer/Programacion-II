package Practicas.Practica_1.Ejercicio_1;
import java.util.Scanner;
public class TestEcuaLin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Pedir datos al usuario
        System.out.print("Ingrese a: ");
        double a = sc.nextDouble();
        System.out.print("Ingrese b: ");
        double b = sc.nextDouble();
        System.out.print("Ingrese c: ");
        double c = sc.nextDouble();
        System.out.print("Ingrese d: ");
        double d = sc.nextDouble();
        System.out.print("Ingrese e: ");
        double e = sc.nextDouble();
        System.out.print("Ingrese f: ");
        double f = sc.nextDouble();

        //Creando el objeto
        EcuaLin ecua1 = new EcuaLin(a, b, c, d, e, f);

        // Resultado
        if (ecua1.tieneSolucion()) {
            System.out.println("La ecuación tiene solución:");
            System.out.println("x = " + ecua1.getX());
            System.out.println("y = " + ecua1.getY());
        } else {
            System.out.println("La ecuación no tiene solución (determinante = 0).");
        }
    }
}

