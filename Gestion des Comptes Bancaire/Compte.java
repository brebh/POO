public class Compte {
    private int Solde;
    private static int code;
    private int codeducomptedechaqueClient=code;
    private Client Proprietaire;
    Compte(int Solde,Client Proprietaire){
        this.Proprietaire=Proprietaire;
        this.Solde=Solde;
        code++;
    }

    public int getCodeducomptedechaqueClient() {
        return codeducomptedechaqueClient;
    }

    public static int getCode() {
        return code;
    }

    public void setProprietaire(Client proprietaire) {
        Proprietaire = proprietaire;
    }

    public Client getProprietaire() {
        return Proprietaire;
    }

    public int getSolde() {
        return Solde;
    }

    public void setSolde(int solde) {
        Solde = solde;
    }
    public void depot(int montant){
        this.setSolde(getSolde()+montant);
        System.out.println("depot du montant "+montant+" euro avec succes");
    }
    public void retrait(int montant){
        if(getSolde()>montant){
            setSolde(getSolde()-montant);
            System.out.println("retrait avec succes");
        }
        else {
            System.out.println("impossible de retrait sold insuffisant");
        }
    }
    public void virrement(int montant,Compte autre_compte){
        if(this.Solde>montant){
            this.setSolde(this.getSolde()-montant);
            autre_compte.setSolde(autre_compte.getSolde()+montant);
            System.out.println("virrement avec succes");
        }
        else {
            System.out.println("impossible de virrement sold insuffisant");
        }
    }
    public void Afficher_compte(){
        System.out.println("le solde de ce compte: "+getSolde());
        System.out.println("nom et prenom: "+Proprietaire.Nom+" "+Proprietaire.Prenom);
        System.out.println("cin: "+Proprietaire.Cin+" tel: "+Proprietaire.Tel);

    }
}
