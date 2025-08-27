package Practicas.Practica_1.Ejercicio_2;
import java.util.Scanner;
public class TestEcuaCua {
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese a, b, c: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        EcuaCua eq = new EcuaCua(a, b, c);

        double disc = eq.getDiscriminante();

        if (disc > 0) {
            System.out.println("La ecuacion tiene dos raices " + eq.getRaiz1() + " y " + eq.getRaiz2());
        } else if (disc == 0) {
            System.out.println("La ecuacion tiene una raiz " + eq.getRaiz1());
        } else {
            System.out.println("La ecuacion no tiene raices reales");
        }

        
    }
}



