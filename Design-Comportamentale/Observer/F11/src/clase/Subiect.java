package clase;

public interface Subiect {
    void aboneazaCalator(Observer observer);
    void dezaboneazaCalator(Observer observer);
    void trimiteNotificare(String mesaj);
}
