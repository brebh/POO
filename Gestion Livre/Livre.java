public class Livre {
    private static int idLivre=0;
    private String titre;
    private String auteur;

    private  int prix;
    public  Livre(String titre,String auteur,int prix){
        idLivre ++;
        this.titre=titre;
        this.auteur=auteur;
        this.prix=prix;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String toString(){
        return (this.idLivre+": "+ this.titre+" est cree par "+this.auteur+" qui cout "+this.prix+"$");
    }

   public  static void main(String[] args){
        Livre livre1= new Livre("Ugly Love","coolen Hoover",25);
        livre1.toString();

    }


}
