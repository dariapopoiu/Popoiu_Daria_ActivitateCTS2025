package clase;

public class Facade {
    public String verificareMasa(Masa masa){
        Picolo picolo = new Picolo();
        Ospatar ospatar = new Ospatar();
        if(masa.isEsteLibera()){
            if(picolo.debaraseaza(masa)){
                if(ospatar.esteAranjata(masa)){
                    return "Luati loc la masa nr."+ masa.getNrMasa();
                }
                else {
                    return "Asteptati pentru aranjarea mesei";
                }
            }else{
                return "Asteptati tocmai a plecat cineva";
            }
        }
        else{
            return "Din pacate nu avem mese disponibile";
        }
    }
}
