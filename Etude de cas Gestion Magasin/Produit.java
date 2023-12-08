import java.util.Date;
public class Produit {
    public int id;
   public  String libelee;
   public String mark;
   protected double prix;
    public Date Expiration;
    Produit(){
    }
    Produit(int id, String lib, String mark, double price, Date de){
        this.id=id;
        this.libelee=lib;
        this.mark=mark;
        this.prix=price;
        this.Expiration=de;
    }
    public void setPrix(double prix) {
        this.prix = prix;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setLibelee(String libelee) {
        this.libelee = libelee;
    }
    public void setMark(String mark) {
        this.mark = mark;
    }
    public void afficherProduit(){
        System.out.println("id of the product:  "+id+" "+libelee+" by "+mark+" that costs: "+prix+"$ expires on: "+Expiration);
    }
    public String toString(){
        return id+" "+libelee+" "+mark+" "+prix;
    }

    public void setExpiration(Date expiration) {
        Expiration = expiration;
    }
    public boolean comparer(Produit p){
        return (this.prix==p.prix && this.libelee.equals(p.libelee) && this.id==p.id);
    }
    public boolean comparer(Produit p1,Produit p2){
        return (p2.prix==p1.prix && p2.libelee.equals(p1.libelee) && p2.id==p1.id);}}
