package clase;

public class PachetTuristic implements IPachetTuristic{
    private String hotel;
    private String destinatie;
    private boolean micDejun;
    private int codPachet;

    public PachetTuristic(String hotel, String destinatie, boolean micDejun, int codPachet) {
        this.hotel = hotel;
        this.destinatie = destinatie;
        this.micDejun = micDejun;
        this.codPachet = codPachet;
    }

    public String getHotel() {
        return hotel;
    }

    public void setHotel(String hotel) {
        this.hotel = hotel;
    }

    public String getDestinatie() {
        return destinatie;
    }

    public void setDestinatie(String destinatie) {
        this.destinatie = destinatie;
    }

    public boolean isMicDejun() {
        return micDejun;
    }

    public void setMicDejun(boolean micDejun) {
        this.micDejun = micDejun;
    }

    public int getCodPachet() {
        return codPachet;
    }

    public void setCodPachet(int codPachet) {
        this.codPachet = codPachet;
    }

    @Override
    public void descriePachet(Optional optional) {
        System.out.println("Pachet turistic NR" +this.codPachet+ " hotel:"+this.hotel
                +" ; destinatie: "+this.destinatie+" si micdejun:"+
                this.micDejun+ (optional.isCina() ? "are" : "nu are")+ " cina inclusa ; nr excursii: "+(optional.getNrExcursii()));
    }
}
