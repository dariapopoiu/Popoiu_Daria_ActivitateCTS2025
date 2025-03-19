package module;

import interfete.IPersoana;

public abstract class Persoana implements IPersoana {

    private String name;
    private int age;

    public Persoana() {
        this.name="necunoscut";
        this.age=0;
    }

    public Persoana(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract float calculeazaVenit();
}
