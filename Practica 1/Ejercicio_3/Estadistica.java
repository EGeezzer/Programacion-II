package Practica_1.Ejercicio_3;
public class Estadistica {
    private double[] datos;
    // Constructor
    public Estadistica(double[] datos) {
        this.datos = datos;
    }
    // Calcular promedio
    public double promedio() {
        double suma = 0;
        for (double num : datos) {
            suma += num;
        }
        return suma / datos.length;
    }
    // Calcular desviación estándar
    public double desviacion() {
        double prom = promedio();
        double suma = 0;
        for (double num : datos) {
            suma += Math.pow(num - prom, 2);
        }
        return Math.sqrt(suma / (datos.length - 1));
    }
}

    
