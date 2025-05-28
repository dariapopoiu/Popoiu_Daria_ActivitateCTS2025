package clase;

public class BuilderRezervare implements Builder {

    // v1--- are instanta clasei
    private Rezervare rezervare;

    public BuilderRezervare() {
        this.rezervare = new Rezervare(false,false,false,false,false);
    }

    public BuilderRezervare setAsezareLaGeam( boolean setAsezare){
        this.rezervare.setSetAsezareLaGeam(setAsezare);
        return this;
    }

    public BuilderRezervare setScaune( boolean setScaune){
        this.rezervare.setSetScauneErgonomice(setScaune);
        return this;
    }

    public BuilderRezervare setGenMuzica( boolean genMuzica){
        this.rezervare.setSetGenMuzica(genMuzica);
        return this;
    }

    public BuilderRezervare setDecor( boolean setDecor){
        this.rezervare.setSetDecorareMasa(setDecor);
        return this;
    }
    public BuilderRezervare setMuzica(boolean setMuzica){
        this.rezervare.setSetMuzicaAmbientala(setMuzica);
        return this;
    }

    // se creeaza la final obiectul
    @Override
    public Rezervare build() {
        return this.rezervare;
    }


    private void reset(){

    }
}
