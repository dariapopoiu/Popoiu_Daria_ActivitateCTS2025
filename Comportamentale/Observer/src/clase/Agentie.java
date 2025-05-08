package clase;

import java.util.ArrayList;
import java.util.List;

public class Agentie implements Subject {
    private String numeAgentie;
    private List<Observer> observeri;

    public Agentie(String numeAgentie) {
        this.numeAgentie = numeAgentie;
        this.observeri = new ArrayList<Observer>();
    }

    @Override
    public void adaugaObserver(Observer obs) {
        this.observeri.add(obs);
        System.out.println("S-a adaugat clientul "+ obs.toString());
    }

    @Override
    public void stergeObserver(Observer obs) {
        this.observeri.remove(obs);
        System.out.println("S-a sters clientul"+ obs.toString());
    }

    @Override
    public void trimiteNotificare(String mesaj) {
        for(Observer obs: observeri){
            obs.receptionareMesaj(mesaj);
        }
    }

    public void trimiteOfertaNoua(){
        trimiteNotificare("Oferta Noua!!");
    }

    public void trimiteReducerePret(){
        trimiteNotificare("REDUCERI REDUCERI REDUCERI!!");
    }
}
