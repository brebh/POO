package Gestion_ustensiles;

public class Asiette_ronde extends Asiettes{
    private double rayon;
    public static int surfaceRonde;
    public double getRayon() {
        return rayon;
    }

    public void setRayon(double rayon) {
        this.rayon = rayon;
    }
    public Asiette_ronde(double rayon,int annefab){
        super(annefab);
        this.rayon=rayon;
        surfaceRonde+=calculer_surface();
    }

    public  double calculer_surface(){
        return Math.PI*Math.pow(rayon,2);
    }



}
