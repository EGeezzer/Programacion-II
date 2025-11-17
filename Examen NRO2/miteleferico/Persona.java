package miteleferico;

import java.util.*;
public class Persona {
    private String nombre;
            int edad;
            float pesoPersona;

    public Persona(String nombre, int edad, float pesoPersona) {
        this.nombre = nombre;
        this.edad = edad;
        this.pesoPersona = pesoPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getPesoPersona() {
        return pesoPersona;
    }

    public void setPesoPersona(float pesoPersona) {
        this.pesoPersona = pesoPersona;
    }
    

    public float calcularTarifa() {
        if (edad <= 25 || edad > 60) {
            return 1.5f;
        } else {
            return 3.0f;
        }
    }
    
   
    public float getTarifaRegular() {
        return 3.0f;
    }
}


