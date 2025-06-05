package tests;

import categorii.CategorieCORRECT;
import categorii.CategorieRightBICEP;
import clase.IPersoana;
import clase.PachetTuristic;
import clase.Persoana;
import dubluri.PersoanaFake;
import dubluri.PersoanaStub;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.*;

public class AplicaDiscountTest {

    @Test
    @Category(CategorieCORRECT.class)
    public void aplicaDiscountVarstniciStub() {
        IPersoana persoanaStub = new PersoanaStub();
        PachetTuristic pachetTuristic = new PachetTuristic(persoanaStub,"Galati",500.00);

        pachetTuristic.aplicaDiscountVarstnici(50);
        assertEquals(250.00,pachetTuristic.getPret(),0.01);
    }

    @Test
    @Category({CategorieRightBICEP.class, CategorieCORRECT.class})
    public void aplicaDiscountVarstiniciFakeRight(){
        Persoana persoanaFake = new PersoanaFake();
        ((PersoanaFake) persoanaFake).setVarsta(60);
        PachetTuristic pachetTuristic = new PachetTuristic(persoanaFake,"Galati",500.00);

        pachetTuristic.aplicaDiscountVarstnici(50);
        assertEquals(500.00,pachetTuristic.getPret(),0.01);
    }

    @Test
    @Category(CategorieCORRECT.class)
    public void aplicaDiscountVarstiniciFakeRange(){
        Persoana persoanaFake = new PersoanaFake();
        ((PersoanaFake) persoanaFake).setVarsta(30);
        PachetTuristic pachetTuristic = new PachetTuristic(persoanaFake,"Galati",500.00);

        pachetTuristic.aplicaDiscountVarstnici(50);
        assertEquals(500.00,pachetTuristic.getPret(),0.01);
    }

}