package abc;

public class Consultorio {
    private String consultorio;
    String medico;

    public Consultorio(String consultorio, String medico) {
        this.consultorio = consultorio;
        this.medico = medico;
    }

    public String getConsultorio() {
        return consultorio;
    }

    public String getMedico() {
        return medico;
    }
}
