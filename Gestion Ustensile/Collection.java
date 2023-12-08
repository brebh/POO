package Gestion_ustensiles;

import java.util.Scanner;

public class Collection {

    public static void afficherCuierres(Ustensiles[] mesUstensiles){
        int sommesCuilleres=0;
        for(Ustensiles u:mesUstensiles){
            if(u instanceof Cuillere){
                sommesCuilleres+=1;
            }
        }
        System.out.println("il ya "+sommesCuilleres+" cuilllers");
    }
    public static void afficherValeurTotale(Ustensiles[] mesUstensiles){
        double SommesValeur=0;
        for(Ustensiles u:mesUstensiles){
            SommesValeur+=u.calculerValeur();
        }
        System.out.println("Valeurs totale de la collection est: "+SommesValeur);
    }
    public static void afficherSurfaceAssiettes(Ustensiles[] mesUstensiles){
        double SommeSurfaceAssiettes=0;
        // u est un instence (objet)
        for(Ustensiles u:mesUstensiles){
            if(u instanceof Asiettes){
                SommeSurfaceAssiettes+=((Asiettes) u).calculer_surface();
            }
        }
        System.out.println("Surface Totale des Assiettes "+SommeSurfaceAssiettes);
    }
    public static void PersonalMethode(double taille){
        Scanner scan = new Scanner(System.in);
        double co;
        do{

            double borne=Math.sqrt(taille);
            System.out.println("donner la cote (bornee de ]0,"+borne+"[ ");
            co=scan.nextDouble();

        }while(0<co && co>Math.sqrt(taille));
        double res=Math.sqrt(taille-Math.pow(co,2))/Math.sqrt(2*Math.PI);
        System.out.println("veiller entrer la rayon commun: "+res);
    }
    public static void main(String[] args) {

        Asiette_ronde asietteRond1=new Asiette_ronde(6.857640258044142,1964);
        Asiette_ronde asietteRond2=new Asiette_ronde(6.857640258044142,1799);
        Asiette_carre asiettecarre=new Asiette_carre(7,1963);
        Cuillere cuillere1=new Cuillere(14.5,1811);
        Cuillere cuillere2=new Cuillere(12.2,1990);



        // 5 objet qui sont part du supperClasse Ustensiles stoquees dans un tableau ustensiles
        Ustensiles[] us ={asietteRond1,asiettecarre,cuillere1,cuillere2,asietteRond2};

        afficherCuierres(us);
        afficherSurfaceAssiettes(us);
        afficherValeurTotale(us);
        PersonalMethode(344.48080000000004);


    }
}