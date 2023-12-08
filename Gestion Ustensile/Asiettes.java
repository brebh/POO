package Gestion_ustensiles;

import java.time.LocalDateTime;

public abstract class Asiettes extends Ustensiles{
    public Asiettes(int anne_fab){
        super(anne_fab);
    }

    public  double calculerValeur(){
        LocalDateTime t=LocalDateTime.now();
        return 2023-getAnnefab()<50 ? 0: t.getYear()-getAnnefab()-50;
    }
    public  abstract double calculer_surface();

}

