package Practica_4;
    import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Empleado[] empleados = new Empleado[5];
        // Solicitar un empleado de tiempo completo
        System.out.println("Ingrese datos del empleado a tiempo completo:");
        System.out.print("Nombre: ");
        String nombreTC = sc.nextLine();
        System.out.print("Salario anual: ");
        double salarioAnual = sc.nextDouble();
        empleados[0] = new EmpTiemComp(nombreTC, salarioAnual);
        sc.nextLine(); 
        // Solicitar dos empleados por horas
        for (int i = 1; i <= 2; i++) {
            System.out.println("Ingrese datos del empleado por horas #" + i + ":");
            System.out.print("Nombre: ");
            String nombreTH = sc.nextLine();
            System.out.print("Horas trabajadas: ");
            double horas = sc.nextDouble();
            System.out.print("Tarifa por hora: ");
            double tarifa = sc.nextDouble();
            empleados[i] = new EmpTiemHora(nombreTH, horas, tarifa);
            sc.nextLine(); 
        }
        // Llenar los dos restantes manualmente 
        empleados[3] = new EmpTiemComp("Carlos", 24000);
        empleados[4] = new EmpTiemHora("Ana", 160, 15);

        // Mostrar datos de todos los empleados
        System.out.println("\n--- Lista de empleados ---");
        for (Empleado emp : empleados) {
            System.out.println(emp.toString());
        }
    }
}
