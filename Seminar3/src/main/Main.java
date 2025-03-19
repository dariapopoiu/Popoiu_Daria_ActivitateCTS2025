package main;

import ro.ase.clase.AutoritatePescuitEager;
import ro.ase.clase.AutoritatePescuitLazy;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /// ---- Eager
        AutoritatePescuitEager autoritatePescuitEager=AutoritatePescuitEager.getInstanta();
        autoritatePescuitEager.concediaza(10);

        System.out.println(autoritatePescuitEager.toString());

        autoritatePescuitEager.setDenumire("ANpA");
        System.out.println(autoritatePescuitEager.toString());

        autoritatePescuitEager.emiteAutorizatie("Daria");
        System.out.println(autoritatePescuitEager.toString());

        AutoritatePescuitEager autoritatePescuitEager2=AutoritatePescuitEager.getInstanta();
        autoritatePescuitEager2.emiteAutorizatie("Dana");
        System.out.println(autoritatePescuitEager2.toString());

        System.out.println("------------------------------");
        /// ---- Lazy

        AutoritatePescuitLazy autoritatePescuitLazy=AutoritatePescuitLazy.getInstanta("www.anpa","anpa");
        System.out.println(autoritatePescuitLazy.toString());

        AutoritatePescuitLazy autoritatePescuitLazy2=AutoritatePescuitLazy.getInstanta("www.anspa2","anpawow");
        autoritatePescuitLazy2.concediaza(35);
        System.out.println(autoritatePescuitLazy.toString());


    }
}