package clase;

public class LinieSpeciala extends TemplateLinie{
    @Override
    protected void opresteStatia1() {
        System.out.println("Statia 1 cu usa pe partea dreapta");
    }

    @Override
    protected void opresteStatia2() {
        System.out.println("Statia 2 cu usa pe partea stanga");
    }

    @Override
    protected void opresteStatia3() {
        System.out.println("Statia 3 --- IN RENOVARE---------");
    }

    @Override
    protected void opresteStatia4() {
        System.out.println("Statia 4 --- IN RENOVARE---------");
    }

    @Override
    protected void opresteStatia5() {
        System.out.println("Statia 5 cu usa pe partea stanga");
    }

    @Override
    protected void opresteStatia6() {
        System.out.println("Statia 6 --- IN RENOVARE---------");
    }

}
