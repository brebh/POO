package Gestion_ustensiles;

public abstract class Ustensiles {
    private int annefab;
    Ustensiles(){}

    public int getAnnefab() {
        return annefab;
    }

    public void setAnnefab(int annefab) {
        this.annefab = annefab;
    }
    public Ustensiles(int annefab){
        this.annefab=annefab;
    }
    public abstract  double calculerValeur();

}
