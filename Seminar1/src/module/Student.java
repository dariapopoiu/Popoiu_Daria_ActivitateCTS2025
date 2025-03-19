package module;

public class Student extends Persoana{
    private  int idStudent;

    public Student() {
        super("STUD",18);
        this.idStudent=idStudent;
    }

    public Student(String name, int age, int idStudent) {
        super(name, age);
        this.idStudent = idStudent;
    }

    public int getIdStudent() {
        return idStudent;
    }

    @Override
    public float calculeazaVenit() {
        return 0;
    }
}
