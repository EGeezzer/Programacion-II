package Practicas.Practica_1.Ejercicio_1;
public class EcuaLin {
    // Atributos privados
    private double a;
    private double b;
    private double c;
    private double d;
    private double e;
    private double f;

    // Constructor
    public EcuaLin(double a, double b, double c, double d, double e, double f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    // Verificar si tiene solución (determinante != 0)
    public boolean tieneSolucion() {
        return (a * d - b * c) != 0;
    }
    // Calcular X
    public double getX() {
        return (e * d - b * f) / (a * d - b * c);
    }
    // Calcular Y
    public double getY() {
        return (a * f - e * c) / (a * d - b * c);
    }
}

    

