package abc;

public class Consulta extends Medico {
    private int ci;
    String nombrePaciente;
    String apellidoPaciente;
    int idMed;
    int dia;
    String mes;
    int anio;

    public Consulta(int ci, String nombrePaciente, String apellidoPaciente, 
                    int idMed, String nombreMed,
                    int dia, String mes, int anio) {
        super(idMed, nombreMed);       
        this.ci = ci;
        this.nombrePaciente = nombrePaciente;
        this.apellidoPaciente = apellidoPaciente;
        this.idMed = idMed;
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public int getCi() {
        return ci; }
}
