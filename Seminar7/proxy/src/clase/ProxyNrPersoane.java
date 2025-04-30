package clase;

public class ProxyNrPersoane implements IRezervare {
    private IRezervare rezervare;

    public ProxyNrPersoane(IRezervare rezervare) {
        this.rezervare = rezervare;
    }

    @Override
    public void realizeazaRezervare(String numeClient, int nrPersoane) {
        if(nrPersoane>=4){
            rezervare.realizeazaRezervare(numeClient,nrPersoane);
        }
        else{
            System.out.println("Nu se poate realiza rezervarea");
        }
    }
}
