
package abc;
import java.awt.BorderLayout;
import java.util.*;

public class ABC {
    public static void main(String[] args) {

       //(a) Dar de alta médicos y consultas 
        List<Medico> medicos = new ArrayList<>();
        List<Consulta> consultas = new ArrayList<>();

        // 3 médicos
        medicos.add(new Medico(1, "Juan Perez"));
        medicos.add(new Medico(2, "Maria Gomez"));
        medicos.add(new Medico(3, "Luis Torres"));
        System.out.println("LISTA  MEDICOS:");
        for (Medico m : medicos) {
            System.out.println("ID: " + m.getIdMed()+ " " + m.getNombreMed());
        }
        System.out.println(); 

        // 9 consultas
        consultas.add(new Consulta(101,"Ana","Lopez",1,"Juan Perez",5,"junio",2025));
        consultas.add(new Consulta(102,"Rosa","Vega",1,"Juan Perez",25,"diciembre",2025));
        consultas.add(new Consulta(103,"Mia","Sosa",1,"Juan Perez",1,"enero",2026));

        consultas.add(new Consulta(104,"Jose","Martinez",2,"Maria Gomez",7,"junio",2025));
        consultas.add(new Consulta(105,"Pablo","Nava",2,"Maria Gomez",25,"diciembre",2025));
        consultas.add(new Consulta(106,"Luisa","Garcia",2,"Maria Gomez",1,"enero",2026));

        consultas.add(new Consulta(107,"Carlos","Mena",3,"Luis Torres",4,"junio",2025));
        consultas.add(new Consulta(108,"Daniela","Rios",3,"Luis Torres",12,"marzo",2025));
        consultas.add(new Consulta(109,"Mario","Suarez",3,"Luis Torres",31,"diciembre",2025));
        
        System.out.println("LISTA DE CONSULTAS:");
        for (Consulta c : consultas) {
        System.out.println("CI: " + c.getCi() +" "
                 + "| Paciente: " + c.nombrePaciente + " " + c.apellidoPaciente +
                 " | Medico: " + c.getNombreMed() +
                 " | Fecha: " + c.dia + " de " + c.mes + " de " + c.anio);
        }
        System.out.println(); 


        //(b) Dar de baja al médico NombreX ApellidoY y sus consultas
        String nombreAEliminar = "Maria Gomez";

        medicos.removeIf(m -> m.getNombreMed().equalsIgnoreCase(nombreAEliminar));

        consultas.removeIf(c -> c.getNombreMed().equalsIgnoreCase(nombreAEliminar));

        //  (c) Cambiar día de pacientes en Navidad o Año Nuevo 
        for (Consulta c : consultas) {
            if (c.mes.equalsIgnoreCase("diciembre") && c.dia == 25) {
                c.dia = 26;   // pasa el día
            }
            if (c.mes.equalsIgnoreCase("enero") && c.dia == 1) {
                c.dia = 2;
            }
        }
        
        // (d) Mostrar pacientes atendidos el 4 de junio 
        System.out.println("Pacientes atendidos el 4 de junio:");
        for (Consulta c : consultas) {
            if (c.dia == 4 && c.mes.equalsIgnoreCase("junio")) {
                System.out.println(" | " + c.nombrePaciente  + " " + c.apellidoPaciente + " | " +" atendido por " + " | " + c.getNombreMed() + " | ");
            }
        }
    }
}

