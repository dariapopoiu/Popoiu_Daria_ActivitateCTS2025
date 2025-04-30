package ro.cts.clase.singleton;

public class ConexiuneGPS implements ServiceConnection{
    private String tipConexiune;
    private static ConexiuneGPS instantaConexiune = null;

    private ConexiuneGPS(String conexiune) {
        this.tipConexiune = conexiune;
    }

    public static ConexiuneGPS getInstanta(String tipConexiune){
        if (instantaConexiune == null){
            instantaConexiune = new ConexiuneGPS(tipConexiune);
        }
        return instantaConexiune;
    }

    @Override
    public void descrieConexiune() {
        System.out.println("Conexiune la:"+this.tipConexiune);
    }
}
