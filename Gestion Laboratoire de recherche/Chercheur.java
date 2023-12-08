public class Chercheur {
    public String nomChercheur;
    public String postChercheur;
    public int numOrdinateur;
    public static int chercheurCpt=0;
    public Chercheur(String nomChercheur,String postChercheur,int numOrdinateur){
        this.nomChercheur=nomChercheur;
        this.postChercheur=postChercheur;
        this.numOrdinateur=numOrdinateur;
        chercheurCpt++;

    }
    public Chercheur(){
        chercheurCpt++;
    }
    public void afficherChercheur(){
        System.out.println("le nom de chercheur est: "+nomChercheur);
        System.out.println("le post de ce chercheur est: "+postChercheur);
        System.out.println("le numero ordinateur de ce chercheur est: "+numOrdinateur);

    }
    public int getChercheur(){
        return chercheurCpt;
    }
    public boolean comparer(Chercheur ch){
        return (this.nomChercheur.equals(ch.nomChercheur) && this.postChercheur.equals(ch.postChercheur)&&this.numOrdinateur==ch.numOrdinateur);
    }
}
