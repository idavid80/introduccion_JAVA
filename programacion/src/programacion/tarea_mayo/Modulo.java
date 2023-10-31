package programacion.tarea_mayo;

public class Modulo {
    private int idModulo;
    private String nomModulo;
    private int numHoras;
    private String nomProfe;
    private int numUnit;
    private int notaFinal;

    public int getIdModulo() {
        return idModulo;
    }

    public void setIdModulo(int idModulo) {
        this.idModulo = idModulo;
    }

    public String getNomModulo() {
        return nomModulo;
    }

    public void setNomModulo(String nomModulo) {
        this.nomModulo = nomModulo;
    }

    public int getNumHoras() {
        return numHoras;
    }

    public void setNumHoras(int numHoras) {
        this.numHoras = numHoras;
    }

    public String getNomProfe() {
        return nomProfe;
    }

    public void setNomProfe(String nomProfe) {
        this.nomProfe = nomProfe;
    }

    public int getNumUnit() {
        return numUnit;
    }

    public void setNumUnit(int numUnit) {
        this.numUnit = numUnit;
    }

    public int getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(int notaFinal) {
        this.notaFinal = notaFinal;
    }

    public Modulo(String nomModulo, int numHoras, String nomProfe, int numUnit, int notaFinal) {

        this.nomModulo = nomModulo;
        this.numHoras = numHoras;
        this.nomProfe = nomProfe;
        this.numUnit = numUnit;
        this.notaFinal = notaFinal;
    }
    
}
