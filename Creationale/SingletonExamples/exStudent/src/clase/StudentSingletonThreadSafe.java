package clase;

public class StudentSingletonThreadSafe {

    private String nume;
    private String materie;
    private double nota;

    private static StudentSingletonThreadSafe instanta = null;

    private StudentSingletonThreadSafe() {
        this.nume = "Necunoscut";
        this.materie = "Necunoscuta";
        this.nota = 0;
    }

    private StudentSingletonThreadSafe(String nume, String materie, double nota) {
        this.nume = nume;
        this.materie = materie;
        this.nota = nota;
    }

    public String getMaterie() {
        return materie;
    }

    public void setMaterie(String materie) {
        this.materie = materie;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    synchronized public static StudentSingletonThreadSafe getInstance(String nume,String materie,double nota){
        if( instanta == null){
            instanta = new StudentSingletonThreadSafe(nume,materie,nota);
        }
        return instanta;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("StudentSingletonEager{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", materie='").append(materie).append('\'');
        sb.append(", nota=").append(nota);
        sb.append('}');
        return sb.toString();
    }

}
