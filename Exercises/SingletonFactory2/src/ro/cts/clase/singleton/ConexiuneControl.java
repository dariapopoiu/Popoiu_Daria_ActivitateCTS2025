package ro.cts.clase.singleton;

public class ConexiuneControl implements ServiceConnection{
    private String tipConexiune;
    private static ConexiuneControl instantaConexiune = null;

    private ConexiuneControl(String conexiune) {
        this.tipConexiune = conexiune;
    }

    public static ConexiuneControl getInstanta(String tipConexiune){
        if (instantaConexiune == null){
            instantaConexiune = new ConexiuneControl(tipConexiune);
        }
        return instantaConexiune;
    }

    @Override
    public void descrieConexiune() {
        System.out.println("Conexiune la:"+this.tipConexiune);
    }
}
