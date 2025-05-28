package clase;

import java.util.ArrayList;
import java.util.List;

public class Agentie implements Subiect{
    private List<Observer> listaObserveri;
    private String numeAgentie;

    public Agentie(String numeAgentie) {
        this.listaObserveri = new ArrayList<Observer>();
        this.numeAgentie = numeAgentie;
    }

    @Override
    public void adaugaObserver(Observer observer) {
        listaObserveri.add(observer);
    }

    @Override
    public void stergeObserver(Observer observer) {
        listaObserveri.remove(observer);
    }

    @Override
    public void trimiteNotificare(String mesaj) {
        for(Observer observer : listaObserveri){
            observer.receptionareMesaj(this.numeAgentie+" "+mesaj);
        }
    }

    public void notificareOfertaNoua(){
        trimiteNotificare(" A fost adaugata o noua oferta!!");
    }

    public void notificarePretRedus(String mesaj){
        trimiteNotificare(" A fost adaugata o noua reducere!!");
    }
}
