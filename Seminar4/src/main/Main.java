package main;

import clase.Supa;
import factory.SupaFactory;
import factory.TipSupa;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        SupaFactory factory=new SupaFactory();

        Supa supa= factory.getSupa(100,"piper,boia", TipSupa.supaDeCiuperci);
        supa.preparareSupa();

        Supa supa2= factory.getSupa(120,"piper,sare", TipSupa.supaDeLegume);
        supa2.preparareSupa();

        Supa supa3= factory.getSupa(150,"ardei rosu,dovlevcel", TipSupa.supaDeVita);
        supa3.preparareSupa();

    }
}