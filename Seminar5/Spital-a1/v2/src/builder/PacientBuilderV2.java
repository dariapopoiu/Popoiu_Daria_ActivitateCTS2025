package builder;

import clase.Pacient;

public class PacientBuilderV2 implements Builder{

    // contine atributele clasei
    private Boolean arePatRabatabil;
    private Boolean areMicDejun;
    private Boolean areHalat;
    private Boolean arePapuci;
    private String numeInsotitor;

    public PacientBuilderV2(){
        this.arePatRabatabil = false;
        this.areHalat = false;
        this.arePapuci = false;
        this.areMicDejun = false;
        this.numeInsotitor = "Anonim";
    }

    // pt ca nu mai e instanta ca atribut, build va intoarce un obiect nou
    @Override
    public Pacient build() {
        return new Pacient();
    }

    // deoarece are ca atribute atributele clasei pacient, setterii se comporta ca niste stetteri normali
    // doar ca returneaza tipul clasei

    public PacientBuilderV2 setArePatRabatabil(Boolean arePat){
        this.arePatRabatabil = arePat;
        return this;
    }

    public PacientBuilderV2 setAreMicDejun(Boolean areMicDejun){
        this.areMicDejun = areMicDejun;
        return this;
    }

    public PacientBuilderV2 setArePapuci(Boolean arePapuci){
        this.arePapuci = arePapuci;
        return this;
    }

    public PacientBuilderV2 setAreHalat(Boolean areHalat){
        this.areHalat = areHalat;
        return this;
    }

    public PacientBuilderV2 setNume(String nume){
        this.numeInsotitor = nume;
        return this;
    }
}
