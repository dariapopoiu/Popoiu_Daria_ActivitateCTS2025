package clase;

public interface Optiune {
    void adaugaOptiune(Optiune optiune) throws Exception;
    void stergeOptiune(Optiune optiune) throws Exception;
    Optiune getOptiune(int index) throws Exception;
    void descriere();
}
