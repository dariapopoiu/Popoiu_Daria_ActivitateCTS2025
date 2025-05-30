package tests;

import clase.Persoana;
import static org.junit.Assert.*;

import exceptii.ExceptieCNPInexistent;
import exceptii.ExceptieCNPInvalid;
import org.junit.Before;
import org.junit.Test;

public class GetVarstaTest {
    Persoana persoana;

    @Before
    public void setUp() throws Exception {
        persoana = new Persoana();
    }

    @Test
    public void getVarstaRIGHT() {
        persoana = new Persoana("Daria","6031121994566");
        assertEquals(21,persoana.getVarsta());
    }

    @Test
    public void getVarstaRIGHT2(){
        persoana = new Persoana("Daria","1901121994566");
        assertEquals(34,persoana.getVarsta());
    }

    @Test
    public void getVarstaBoundarySuperior(){
        persoana = new Persoana("Daria","2991231994566");
        assertEquals(25,persoana.getVarsta());
    }

    @Test
    public void getVarstaBoundaryInferior(){
        persoana = new Persoana("Daria","6000101994566");
        assertEquals(25,persoana.getVarsta());
    }

    @Test(expected = ExceptieCNPInvalid.class)
    public void getVarstaError(){
        persoana = new Persoana("Andreea","603$$21994566");
        persoana.getVarsta();
    }

    @Test(expected = ExceptieCNPInvalid.class)
    public void getVarstaEroareLuna(){
        persoana = new Persoana("Andreea","6031421994566");
        persoana.getVarsta();
    }

    @Test(timeout = 100)
    public void getVarstaPerformance(){
        persoana = new Persoana("Andreea","6031021998266");
        persoana.getVarsta();
    }

    @Test(expected = ExceptieCNPInexistent.class)
    public void getVarstaExistence(){
        persoana = new Persoana("Ruxandra",null);
        persoana.getVarsta();
    }

    @Test
    public void getVarstaCardinality(){
        persoana = new Persoana("Ruxandra","5241212998266");
        persoana.getVarsta();
    }

    @Test
    public void getVarstaCardinality2(){
        persoana = new Persoana("Ruxandra","5251212889622");
        persoana.getVarsta();
    }


}