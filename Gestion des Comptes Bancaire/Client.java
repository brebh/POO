public class Client {
    public String Cin;
    public String Nom;
    public String Prenom;
    public int Tel;
    Client(String Cin,String Nom,String Prenom,int Tel){
        this.Cin=Cin;
        this.Nom=Nom;
        this.Prenom=Prenom;
        this.Tel=Tel;
    }
    Client(String Cin,String Nom,String Prenom){
        this.Cin=Cin;
        this.Nom=Nom;
        this.Prenom=Prenom;
    }
    public void afficherClient(){
        System.out.println("le client "+Nom+" "+Prenom+" cin: "+Cin +" Tel: "+Tel);
    }


}
