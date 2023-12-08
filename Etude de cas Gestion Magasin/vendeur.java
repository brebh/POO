public class vendeur extends Employers{
    public float tauxdevente;
    public static int Vcpt;
    public vendeur(int idemp,String nomemp, String adress,int hours_per_month,int tauxdevente){
        super(idemp,nomemp,adress,hours_per_month);
        this.tauxdevente=tauxdevente;
        Vcpt++;
    }
    void afficherEmp(){
        // using polymorfisme to ovveride the same methode
        super.afficherEmp();
        System.out.println("taux de vente est :"+tauxdevente);
        double sal=450*(tauxdevente/100);
        System.out.println("le salaire du se vendeur total  est de: "+sal+" dt");
    }

    public  int getVcpt() {
        return Vcpt;
    }
}
