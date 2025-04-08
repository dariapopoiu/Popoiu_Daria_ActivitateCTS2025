package clase;

public class StudentSingletonEager {
    private String nume;
    private String materie;
    private double nota;

    private static final StudentSingletonEager instanta = new StudentSingletonEager();

    private StudentSingletonEager() {
        this.nume = "Necunoscut";
        this.materie = "Necunoscuta";
        this.nota = 0;
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

    public static StudentSingletonEager getInstance(){
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
