package tests;

import clase.Persoana;
import exceptii.ExceptieCNPInvalid;
import org.junit.Test;
import static org.junit.Assert.*;

public class GetSexTest {


    @Test
    public void getSexRightFemale() {
        Persoana persoana = new Persoana("Daria","6031021998837");
        assertEquals("F",persoana.getSex());
    }
    @Test
    public void getSexRightMale() {
        Persoana persoana = new Persoana("Darius","5031021998837");
        assertEquals("M",persoana.getSex());
    }

    @Test
    public void getSexBoundarySuperior(){
        Persoana persoana = new Persoana("Daria","8031021998837");
        assertEquals("F",persoana.getSex());
    }

    @Test
    public void getSexBoundaryInferior(){
        Persoana persoana = new Persoana("Darius","1981021998837");
        assertEquals("M",persoana.getSex());
    }

    private String getParitate( String cnp){
        return cnp.charAt(0) % 2 == 0? "F" : "M";
    }

    @Test
    public void getSexCrossCheck(){
        String cnp = "1981021998837";
        Persoana persoana = new Persoana("Daria",cnp);
        assertEquals(getParitate(cnp),persoana.getSex());
    }

    @Test(expected = ExceptieCNPInvalid.class)
    public void getSexError(){
        Persoana persoana = new Persoana("Daria","0981021998837");
        persoana.getSex();
    }

}