public class TestCompte {
    public static void  main(String[] args){
        Client c11 =new Client("19650755","Ahmed","Achour",94190332);
        Client c12 =new Client("45875488","Aadam","jazi",29854752);
        Compte c1 =new Compte(120,c11);
        Compte c2 =new Compte(30,c12);
        c11.afficherClient();
        c12.afficherClient();
        c1.Afficher_compte();
        c2.Afficher_compte();
        c1.depot(500);
        c2.depot(1000);
        c2.retrait(10);
        c1.virrement(75,c2);

    }
}
