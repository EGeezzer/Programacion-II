
package miteleferico;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Crear sistema Mi Teleférico
        MITeleferico miTeleferico = new MITeleferico();
        
        // Crear algunas cabinas
        Cabina cabina1 = new Cabina(1);
        Cabina cabina2 = new Cabina(2);
        Cabina cabina3 = new Cabina(3);
        
        // Agregar cabinas a las líneas
        miTeleferico.agregarCabinaALinea(cabina1, "Amarillo");
        miTeleferico.agregarCabinaALinea(cabina2, "Rojo");
        miTeleferico.agregarCabinaALinea(cabina3, "Verde");
        
        // Crear personas
        Persona juan = new Persona("Juan", 20, 70.0f);  // Tarifa preferencial
        Persona maria = new Persona("Maria", 30, 65.0f); // Tarifa regular
        Persona carlos = new Persona("Carlos", 65, 80.0f); // Tarifa preferencial
        Persona ana = new Persona("Ana", 35, 60.0f);    // Tarifa regular
        
        // a) Agregar primera persona a cabinas
        System.out.println("------------inciso a" + ")----------");
        System.out.println("=== Agregando personas a cabinas ===");
        miTeleferico.agregarPrimeraPersonaACabina(juan, 1, "Amarillo");
        miTeleferico.agregarPrimeraPersonaACabina(maria, 2, "Rojo");
        miTeleferico.agregarPrimeraPersonaACabina(carlos, 3, "Verde");
        miTeleferico.agregarPrimeraPersonaACabina(ana, 1, "Amarillo");
        
        // b) Verificar reglas de todas las cabinas
        System.out.println("\n------------inciso b" + ")----------");
        System.out.println("=== Verificación de reglas ===");
        boolean cumplenReglas = miTeleferico.verificarTodasLasCabinas();
        System.out.println("¿Todas las cabinas cumplen las reglas? " + cumplenReglas);
        
        // c) Calcular ingresos totales
        System.out.println("\n------------inciso c" + ")----------");
        System.out.println("=== Cálculo de ingresos ===");
        float ingresosTotales = miTeleferico.calcularIngresoTotal();
        System.out.println("Ingreso total de todas las líneas: " + ingresosTotales + " Bs");
        
        // d) Mostrar línea con más ingreso regular
        System.out.println("\n------------inciso d" + ")----------");
        System.out.println("=== Línea con más ingreso regular ===");
        miTeleferico.mostrarLineaConMasIngresoRegular();
        
        // Mostrar información adicional
        System.out.println("\n=== Información adicional ===");
        for (Linea linea : miTeleferico.getLineas()) {
            System.out.println("Línea " + linea.getColor() + ":");
            System.out.println("  - Ingresos totales: " + linea.calcularIngresosTotales() + " Bs");
            System.out.println("  - Ingresos regulares: " + linea.calcularIngresosRegulares() + " Bs");
            System.out.println("  - Personas en cabinas: " + linea.getTotalPersonasEnCabinas());
        }
    }
}