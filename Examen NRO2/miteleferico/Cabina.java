
package miteleferico;
import java.util.*;
class Cabina {
    private int nroCabina;
    private ArrayList<Persona> personasAbordo;
    private static final float PESO_MAXIMO = 850.0f;
    private static final int MAX_PERSONAS = 10;
    
    public Cabina(int nroCabina) {
        this.nroCabina = nroCabina;
        this.personasAbordo = new ArrayList<>();
    }
    
    // Getters
    public int getNroCabina() { return nroCabina; }
    public ArrayList<Persona> getPersonasAbordo() { return personasAbordo; }
    
    // a) Método para agregar primera persona con validaciones
    public boolean agregarPersona(Persona p) {
        if (personasAbordo.size() >= MAX_PERSONAS) {
            System.out.println("No se puede agregar: Límite de personas alcanzado");
            return false;
        }
        
        float pesoTotal = calcularPesoTotal() + p.getPesoPersona();
        if (pesoTotal > PESO_MAXIMO) {
            System.out.println("No se puede agregar: Peso máximo excedido");
            return false;
        }
        
        personasAbordo.add(p);
        return true;
    }
    
    // Método para calcular peso total actual
    public float calcularPesoTotal() {
        float pesoTotal = 0;
        for (Persona persona : personasAbordo) {
            pesoTotal += persona.getPesoPersona();
        }
        return pesoTotal;
    }
    
    // b) Método para verificar reglas de la cabina
    public boolean verificarReglas() {
        boolean cumplePersonas = personasAbordo.size() <= MAX_PERSONAS;
        boolean cumplePeso = calcularPesoTotal() <= PESO_MAXIMO;
        return cumplePersonas && cumplePeso;
    }
    
    // Método para calcular ingresos de esta cabina
    public float calcularIngresos() {
        float total = 0;
        for (Persona persona : personasAbordo) {
            total += persona.calcularTarifa();
        }
        return total;
    }
    
    // Método para calcular ingresos solo con tarifa regular
    public float calcularIngresosRegulares() {
        float total = 0;
        for (Persona persona : personasAbordo) {
            total += persona.getTarifaRegular();
        }
        return total;
    }
    
    public int getCantidadPersonas() {
        return personasAbordo.size();
    }
}