package clase;

public class StudentSingletonLazy {
    private String nume;
    private String materie;
    private double nota;

    private static StudentSingletonLazy instanta = null;

    private StudentSingletonLazy() {
        this.nume = "Necunoscut";
        this.materie = "Necunoscuta";
        this.nota = 0;
    }

    private StudentSingletonLazy(String nume, String materie, double nota) {
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

    public static StudentSingletonLazy getInstance(String nume,String materie,double nota){
        if( instanta == null){
            instanta = new StudentSingletonLazy(nume,materie,nota);
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
