package Gestion_ustensiles;

public class Asiette_carre extends Asiettes {
    private double cote;
    public static int surfacesCarre;
    public Asiette_carre(double cote,int annefab){
        super(annefab);
        this.cote=cote;
        surfacesCarre+=calculer_surface();
    }

    public double getCote() {
        return cote;
    }
    public void setCote(double cote) {
        this.cote = cote;
    }
    public double calculerValeur(){
        return  super.calculerValeur()*5;
    }
    public  double calculer_surface(){
        return Math.pow(cote,2);
    }
    public int surfacesCarre(){
        return surfacesCarre;
    }
}
