package builder;

import clase.Pacient;

public class PacientBuilderV1 implements Builder {

    //atributul
    private Pacient pacient;

    public PacientBuilderV1(){
        pacient = new Pacient();
    }

    // returneaza instanta
    @Override
    public Pacient build() {
        return pacient;
    }

    // setterii trb sa returneze tipul clasei!
    public PacientBuilderV1 setArePatRabatabil(Boolean arePat){
        this.pacient.setArePatRabatabil(arePat);
        return this;
    }

    public PacientBuilderV1 setAreMicDejun(Boolean areMicDejun){
        this.pacient.setAreMicDejun(areMicDejun);
        return this;
    }

    public PacientBuilderV1 setArePapuci(Boolean arePapuci){
        this.pacient.setArePapuci(arePapuci);
        return this;
    }

    public PacientBuilderV1 setAreHalat(Boolean areHalat){
        this.pacient.setAreHalat(areHalat);
        return this;
    }

    public PacientBuilderV1 setNumeInsotitor(String nume){
        this.pacient.setNumeInsotitor(nume);
        return this;
    }

}
