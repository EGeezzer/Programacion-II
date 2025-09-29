package Practica_4;

public class EmpTiemHora extends Empleado {
    
    private double horasTrabajadas;
    private double tarifaPorHora;

    public EmpTiemHora(String nombre, double horasTrabajadas, double tarifaPorHora) {
        super(nombre);
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaPorHora = tarifaPorHora;
    }

    @Override
    public double CalcularSalarioMensual() {
        return horasTrabajadas * tarifaPorHora;
    }

    @Override
    public String toString() {
        return super.toString() +
               ", Horas trabajadas: " + horasTrabajadas +
               ", Tarifa por hora: " + tarifaPorHora +
               ", Salario Mensual: " + CalcularSalarioMensual();
    }
}