package clase;

public interface IStructura {
    void afiseazaStructura();

    void adaugaNod(IStructura structura) throws Exception;
    void stergeNod(IStructura structura) throws Exception;
    IStructura getNod(int index) throws Exception;

}
