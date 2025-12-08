package abc;

public class Medico {
    private int idMed;
    String nombreMed;

    public Medico(int idMed, String nombreMed) {
        this.idMed = idMed;
        this.nombreMed = nombreMed;
    }

    public int getIdMed() {
        return idMed;
    }

    public String getNombreMed() {
        return nombreMed;
    }
}
