package ro.cts.clase.singleton;

public class ConexiuneWeb implements ServiceConnection{
    private String tipConexiune;
    private static ConexiuneWeb instantaConexiune = null;

    private ConexiuneWeb(String conexiune) {
        this.tipConexiune = conexiune;
    }

    public static ConexiuneWeb getInstanta(String tipConexiune){
        if (instantaConexiune == null){
            instantaConexiune = new ConexiuneWeb(tipConexiune);
        }
        return instantaConexiune;
    }

    @Override
    public void descrieConexiune() {
        System.out.println("Conexiune la:"+this.tipConexiune);
    }
}
