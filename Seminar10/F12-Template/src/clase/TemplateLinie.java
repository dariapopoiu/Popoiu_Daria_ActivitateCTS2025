package clase;

public abstract class TemplateLinie {
    protected abstract void opresteStatia1();
    protected abstract void opresteStatia2();
    protected abstract void opresteStatia3();
    protected abstract void opresteStatia4();
    protected abstract void opresteStatia5();
    protected abstract void opresteStatia6();

    public final void circulaTur(){
        opresteStatia1();
        opresteStatia2();
        opresteStatia3();
        opresteStatia4();
        opresteStatia5();
        opresteStatia6();
    }
    public final void circulaRetur(){
        opresteStatia6();
        opresteStatia5();
        opresteStatia4();
        opresteStatia3();
        opresteStatia2();
        opresteStatia1();
    }
}
