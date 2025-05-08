package clase;

public interface Subject {
    void adaugaObserver(Observer obs);
    void stergeObserver(Observer obs);
    void trimiteNotificare(String mesaj);
}
