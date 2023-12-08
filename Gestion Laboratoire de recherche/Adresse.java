public class Adresse {
    public String gouvernorat;
    public String ville;
    public int codePostale;
    public Adresse(String gouvernorat,String ville,int codePostale){
        this.codePostale=codePostale;
        this.gouvernorat=gouvernorat;
        this.ville=ville;

    }
    public Adresse(){
        this.codePostale=0;
        this.gouvernorat="";
        this.ville="";

    }
    public void afficherAdress(){
        System.out.println("la ville est: "+ville);
        System.out.println("la gouvernorat est: "+gouvernorat);
        System.out.println("le  code postale est: "+codePostale);
    }
}
