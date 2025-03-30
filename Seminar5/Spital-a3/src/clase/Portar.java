package clase;

public class Portar extends Angajat {
    private int vechime;

    public Portar(String nume, double salariu,int vechime) {
        super(nume, salariu);
        this.vechime = vechime;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Secretar{");
        sb.append("vechime=").append(vechime);
        sb.append('}');
        sb.append(super.toString());
        return sb.toString();
    }
}
