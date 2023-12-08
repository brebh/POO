public class Test {
   // private   Livre livre;
    /*public Test(Livre livre){
        this.livre=livre;
    }*/

    public  static void main(String[] args){
        Livre livre1= new Livre("Ugly Love","coolen Hoover",25);


       // Test TestLivre= new livre1;
        System.out.println("avant modification");

        //livre1.toString();
        System.out.println("apres modification");
        System.out.println("l'auteur avec la methode get: "+livre1.getAuteur());
        System.out.println("le prix avec la methode get: "+livre1.getPrix());
        System.out.println("le titre avec la methode get: "+livre1.getTitre());
        livre1.setAuteur("hoover only");
        System.out.println(livre1.toString());
        Livre livre2= new Livre("never have i ever","locus cardin",25);
        System.out.println(livre2.toString());
        //System.out.println(livre1);
    }
}
