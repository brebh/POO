public class Laboratoire {
    public String nomLabo;
    public String Specialite;
    public int nombreBureaux;
    public  Adresse adresslaboratoire;
    public Bureaux[] Bureaux ;
    public Laboratoire(String nomLabo,String Specialite,int nombreBureaux,Bureaux[] Bureauxs){
        this.nomLabo=nomLabo;
        this.Specialite=Specialite;
        this.nombreBureaux=nombreBureaux;
        this.Bureaux=new Bureaux[50];
        this.Bureaux=Bureauxs;
    }
    public Laboratoire(){
        this.nomLabo="";
        this.Specialite="";
        this.nombreBureaux=0;
        this.Bureaux=new Bureaux[50];
    }
    public void afficherLaboratoire(){
        System.out.println("le nom de labo est: "+nomLabo);
        System.out.println("la Specialitee est: "+Specialite);
        System.out.println("le nombre de bureaux est: "+nombreBureaux);
        System.out.println("----------------------------lesbureaux du meme labo---------------------------");
        for(int i=0;i<this.Bureaux.length;i++){
            //System.out.println(Bureaux[i]);
            this.Bureaux[i].afficherBureau();
        }
        System.out.println("--------------------------fin des bureaux de meme labo-------------------------");
    }
}
