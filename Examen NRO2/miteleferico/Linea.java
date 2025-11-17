
package miteleferico;
import java.util.*;
class Linea {
    private String color;
    private ArrayList<Persona> filaPersonas;
    private ArrayList<Cabina> cabinas;
    private int cantidadCabinas;
    
    public Linea(String color) {
        this.color = color;
        this.filaPersonas = new ArrayList<>();
        this.cabinas = new ArrayList<>();
        this.cantidadCabinas = 0;
    }
    
    // Getters
    public String getColor() { return color; }
    public ArrayList<Persona> getFilaPersonas() { return filaPersonas; }
    public ArrayList<Cabina> getCabinas() { return cabinas; }
    public int getCantidadCabinas() { return cantidadCabinas; }
    
    // Método para agregar persona a la fila
    public void agregarPersonaFila(Persona p) {
        filaPersonas.add(p);
    }
    
    // Método para agregar cabina
    public void agregarCabina(Cabina cabina) {
        cabinas.add(cabina);
        cantidadCabinas++;
    }
    
    // b) Verificar que todas las cabinas cumplan las reglas
    public boolean verificarCabinas() {
        for (Cabina cabina : cabinas) {
            if (!cabina.verificarReglas()) {
                return false;
            }
        }
        return true;
    }
    
    // c) Calcular ingresos totales de la línea
    public float calcularIngresosTotales() {
        float total = 0;
        for (Cabina cabina : cabinas) {
            total += cabina.calcularIngresos();
        }
        return total;
    }
    
    // Método para calcular ingresos solo con tarifa regular
    public float calcularIngresosRegulares() {
        float total = 0;
        for (Cabina cabina : cabinas) {
            total += cabina.calcularIngresosRegulares();
        }
        return total;
    }
    
    // Método para obtener cantidad total de personas en todas las cabinas
    public int getTotalPersonasEnCabinas() {
        int total = 0;
        for (Cabina cabina : cabinas) {
            total += cabina.getCantidadPersonas();
        }
        return total;
    }
}