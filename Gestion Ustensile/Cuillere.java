package Gestion_ustensiles;

import java.time.LocalDateTime;

public class Cuillere extends Ustensiles {
    private double longeur;
    public static int cptCuilleres=0;

    public double getLongeur() {
        return longeur;
    }
    public static int getCptCuilleres() {
        return cptCuilleres;
    }
    public void setLongeur(double longeur) {
        this.longeur = longeur;
    }
    public Cuillere(double longeur,int annefabrication){
        super(annefabrication);
        this.longeur=longeur;
        cptCuilleres++;

    }

    public void message(){
        System.out.println(getCptCuilleres());

    }
    public  double calculerValeur(){
        LocalDateTime t=LocalDateTime.now();
        return 2023-getAnnefab()<50 ? 0: t.getYear()-getAnnefab()-50;
    }


}
