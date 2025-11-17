
package miteleferico;
import java.util.*;

class MITeleferico {
    private ArrayList<Linea> lineas;
    private float cantidadIngresos;
    
    public MITeleferico() {
        this.lineas = new ArrayList<>();
        this.cantidadIngresos = 0;
        inicializarLineas();
    }
    
    // Inicializar las líneas (Amarillo, Rojo y Verde)
    private void inicializarLineas() {
        lineas.add(new Linea("Amarillo"));
        lineas.add(new Linea("Rojo"));
        lineas.add(new Linea("Verde"));
    }
    
    // Getters
    public ArrayList<Linea> getLineas() { return lineas; }
    public float getCantidadIngresos() { return cantidadIngresos; }
    
    // Método para agregar persona a fila de línea específica
    public void agregarPersonaFila(Persona p, String colorLinea) {
        for (Linea linea : lineas) {
            if (linea.getColor().equalsIgnoreCase(colorLinea)) {
                linea.agregarPersonaFila(p);
                break;
            }
        }
    }
    
    // a) Agregar primera persona a cabina específica
    public boolean agregarPrimeraPersonaACabina(Persona p, int nroCabina, String colorLinea) {
        for (Linea linea : lineas) {
            if (linea.getColor().equalsIgnoreCase(colorLinea)) {
                for (Cabina cabina : linea.getCabinas()) {
                    if (cabina.getNroCabina() == nroCabina) {
                        return cabina.agregarPersona(p);
                    }
                }
            }
        }
        return false;
    }
    
    // b) Verificar que todas las cabinas de todas las líneas cumplan las reglas
    public boolean verificarTodasLasCabinas() {
        for (Linea linea : lineas) {
            if (!linea.verificarCabinas()) {
                return false;
            }
        }
        return true;
    }
    
    // c) Calcular ingreso total de todas las líneas
    public float calcularIngresoTotal() {
        float total = 0;
        for (Linea linea : lineas) {
            total += linea.calcularIngresosTotales();
        }
        this.cantidadIngresos = total;
        return total;
    }
    
    // d) Mostrar línea con más ingreso solo con tarifa regular
    public void mostrarLineaConMasIngresoRegular() {
        Linea lineaMax = null;
        float maxIngreso = -1;
        
        for (Linea linea : lineas) {
            float ingresoRegular = linea.calcularIngresosRegulares();
            if (ingresoRegular > maxIngreso) {
                maxIngreso = ingresoRegular;
                lineaMax = linea;
            }
        }
        
        if (lineaMax != null) {
            System.out.println("Línea con más ingreso regular: " + lineaMax.getColor());
            System.out.println("Ingreso regular: " + maxIngreso + " Bs");
        } else {
            System.out.println("No hay líneas con ingresos");
        }
    }
    
    // Método para agregar cabina a línea específica
    public void agregarCabinaALinea(Cabina cabina, String colorLinea) {
        for (Linea linea : lineas) {
            if (linea.getColor().equalsIgnoreCase(colorLinea)) {
                linea.agregarCabina(cabina);
                break;
            }
        }
    }
}
