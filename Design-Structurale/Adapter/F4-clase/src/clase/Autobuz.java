package clase;

public class Autobuz implements IAutobuz{
    private String linie;

    public Autobuz(String linie) {
        this.linie = linie;
    }

    public String getLinie() {
        return linie;
    }

    public void valideazaLinieBilet(){
        System.out.println("S-a validat bilet pentru linia:"+this.linie);
    }

    public void valideazaLinieAbonament(){
        System.out.println("S-a validat abonament pentru linia:"+this.linie);
    }
}
