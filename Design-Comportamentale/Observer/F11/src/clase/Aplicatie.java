package clase;

import java.util.ArrayList;
import java.util.List;

public class Aplicatie implements Subiect {
    private List<Observer> calatori;

    public Aplicatie() {
        this.calatori = new ArrayList<Observer>();
    }

    @Override
    public void aboneazaCalator(Observer observer) {
        calatori.add(observer);
    }

    @Override
    public void dezaboneazaCalator(Observer observer) {
        calatori.remove(observer);
    }

    @Override
    public void trimiteNotificare(String mesaj) {
        for(Observer observer : calatori){
            observer.primesteNotif(mesaj);
        }
    }

    public void pleacaAutobuz(){
        trimiteNotificare("Autobuzul a plecat din statie!");
    }
}
