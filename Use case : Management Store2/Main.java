import java.util.Date;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Date date = new Date(2026-1900 , 4, 14); // May 14, 2026
        Produit product1 =new Produit(1021,"Lait","Delice",1500,date);

        Produit product2 =new Produit(2510,"Yaourt","Vitalait",0,date);
        Produit product3 =new Produit(3250,"Tomate","Sicam",1.200,date);
        product1.afficherProduit();
        product2.afficherProduit();
        product3.afficherProduit();
        product1.setPrix(0.700);
        product1.afficherProduit();
        Scanner scan = new Scanner(System.in);
        product2.setPrix(1.3);
        product2.afficherProduit();
        product1.toString();
        product1.toString();
        product1.toString();
        LocalDateTime t= LocalDateTime.now();
        System.out.println("note that today is: "+t+" please be careful !");

        int nombreProduits=0;
       do{   System.out.println("please enter the number of distinct products that exist in this marketplace(max 50): ");nombreProduits=scan.nextInt();}while (nombreProduits>50 || nombreProduits<0);

        Produit[] TP = new Produit[50];
        for (int i=0;i<nombreProduits;i++){
            Produit pr =new Produit();
            pr.prix=-0.1;
            while (pr.prix<=0){ System.out.println("donner le prix du Produit: ");pr.prix=scan.nextDouble();}
            System.out.println("donner Libellee du produit: ");
            pr.libelee=scan.next();
            pr.setLibelee(pr.libelee);
            System.out.println("donner mark: ");
            pr.mark=scan.next();
            pr.setMark(pr.mark);
            //l'id est incrimentée automatiquement pour éviter les fautes de l'ajout manuelle (meme id)
            pr.setId(i+1000);
            pr.setExpiration(date);
            TP[i]=pr;
        }
        Caissier caissier11 = new Caissier(1235,"Asma","tunis-city",129,12);
        Caissier caissier12 = new Caissier(1236,"Ahmed","Ben-Arous",147,16);
        //int idemp,String nomemp, String adress,int numcaisse,int tauxdevente
        vendeur vendeur11 = new vendeur(1254,"souleyma","mourouj2",173,72);
        //int idemp,String nomemp, String adress,int numcaisse,int prime
        responsable resmag11 = new responsable(124,"aziz","souse",168,400);
        responsable resmag21 = new responsable(201,"houssem","monastir",195,510);
        Caissier caissier21 = new Caissier(1235,"Asma","tunis-city",150,19);
        vendeur vendeur21 = new vendeur(1259,"souleyma","mourouj2",162,266);
        vendeur vendeur22 = new vendeur(1250,"souleyma","mourouj2",183,142);
        vendeur vendeur23 = new vendeur(1114,"souleyma","mourouj2",133,92);
        Employers les_emp_mag1[]={caissier11,caissier12,vendeur11,resmag11};
        Employers les_emp_mag2[]={resmag21 ,caissier21,vendeur21,vendeur22,vendeur23};
        Employers les_emp_magMG[]={caissier11,caissier12,vendeur21,vendeur23,vendeur11,resmag11};
        Magasin mg =new Magasin("Tunis",1112545,8544,TP,les_emp_magMG);
        System.out.println("------------------------------debut affichage magasin MG--------------------------------");
        mg.AfficherMagasin();
        System.out.println("--------------------------------fin affichage magasin MG--------------------------------");
        // une magasin et definie par ses employer aussi donc en les ajout des emp a chaque magasin
        Magasin carrefour = new Magasin("centre-ville",1256482,4588,TP, les_emp_mag1);
        Magasin Monoprix = new Magasin("Menzah6",22587564,6508,TP, les_emp_mag2);
        Produit product11 = new Produit(1021,"Lait","Delice",1500,date);
        Produit cloneProduct11 =new Produit(1021,"Lait","Delice",1500,date);
        Produit notCloneProduct11 =new Produit(1025,"shoes","nike",699_000,date);
        if(product1.comparer(product1)){
            System.out.println("product1 et cloneProduct1 sont identique");
        }else{
            System.out.println("product1 et cloneProduct1 ne sont pas identique");
        }
        if(product11.comparer(product1,notCloneProduct11)){
            System.out.println("product1 et notcloneproduct1 sont identique (faux cas)");
        }else{
            System.out.println("product1 et notcloneproduct1 ne sont pas identique (vraai cas)");
        }
        // affichage des employers déja creer des deux Magasins
        for(Employers employer:les_emp_mag1){
            if(employer !=null){
                employer.afficherEmp();
            }
        }
        for(Employers employer:les_emp_mag2){
            if(employer !=null){
                employer.afficherEmp();
            }
        }
        // ajout d'un produit au magasin
        Produit autreproduitaajout = new Produit(1045,"voiture","bmw",159_000,date);
        TP[nombreProduits]=autreproduitaajout;
        System.out.println("---------------------------debut affichage magasin carrefour---------------------------");
        carrefour.AfficherMagasin();
        System.out.println("---------------------------fin affichage magasin carrefour---------------------------");


        System.out.println("----------------------- debut statistique consernant le programme (hors exercise)-----------------------");
        System.out.println("les magasin etant declares dans ce programme sont: "+mg.getCmpMag());
        System.out.println("tout les employers dans ces  magazines sont :"+vendeur11.getEmpCpt());
        System.out.println("parmi ses Employer on a");
        System.out.println(vendeur11.getVcpt()+" vendeurs ");
        System.out.println(caissier21.getCcpt()+" caisiers ");
        System.out.println(resmag21.getRcpt()+" responsables ");
        System.out.println("-----------------------fin statistique consernant le programme (hors exercise)-----------------------");
    }
    // this programme uses 3  fundamental concepts in object-oriented programming wich are encapsulation/inheritance/polymorphisme;
}