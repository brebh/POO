public class Bureaux {
    public int code;
    public String nomBureau;
    public Chercheur[] chercheur ;
    public Bureaux(){
        code=0;
        nomBureau="";
        chercheur= new Chercheur[3];
    }
    public Bureaux(int code,String nomBureau, Chercheur[] ch){
        this.code=code;
        this.nomBureau=nomBureau;
        this.chercheur= new Chercheur[3];
        this.chercheur=ch;
    }
    void afficherBureau(){
        System.out.println("le code du bureau est :"+code);
        System.out.println("le nom du bureau est: "+nomBureau);
        System.out.println("-------------affichage du bureau des chercheurs de meme lab----------------");
        for(int i=0;i<this.chercheur.length;i++){
            this.chercheur[i].afficherChercheur();
        }
        System.out.println("-------------fin affichage du bureau des chercheurs de meme lab----------------");
    }
}
