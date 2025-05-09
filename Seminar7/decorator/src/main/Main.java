package main;

import clase.Nota;
import clase.NotaAnNou;
import clase.NotaCraciun;
import clase.NotaDePlata;

public class Main {
    public static void main(String[] args) {
        Nota nota = new NotaDePlata(100);
        NotaAnNou notaAnNou = new NotaAnNou(nota);
        notaAnNou.printare();

        NotaCraciun notaCraciun = new NotaCraciun(nota);
        notaCraciun.printare();
    }
}