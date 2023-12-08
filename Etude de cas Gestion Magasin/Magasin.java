public class Magasin {
    public String adress;
    public int id;
    int Capasitee;
    protected Produit[] products;
    protected Employers[] emp;
    public static int cmpMag=0;
    public int currentMag=cmpMag;
    Magasin(String adress,int id,int capasitee,Produit[] p,Employers[] emp){
        this.adress=adress;
        this.id=id;
        this.Capasitee=capasitee;
        this.products=p;
        cmpMag ++;
        this.emp=emp;
    }
    void AfficherMagasin(){
        System.out.println("id of the Market: "+id + " located in "+adress +" that supports "+Capasitee+" product");
        for (Produit products:products){
            if (products != null) {
            products.afficherProduit();}}
        for (Employers employer : emp){
            if (emp != null) {
            employer.afficherEmp();}}}
    public  int getCmpMag() {return cmpMag;}}
