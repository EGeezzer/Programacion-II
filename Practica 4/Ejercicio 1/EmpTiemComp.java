package Practica_4;
public class EmpTiemComp extends Empleado {
    private double salarioAnual;

    public EmpTiemComp(String nombre, double salarioAnual) {
        super(nombre);
        this.salarioAnual = salarioAnual;
    }
    @Override
    public double CalcularSalarioMensual() {
        return salarioAnual / 12;
    }
    @Override
    public String toString() {
        return super.toString() + 
               ", Salario Anual: " + salarioAnual +
               ", Salario Mensual: " + CalcularSalarioMensual();
    }
}

 
