public class Test_labo {
    public static void main(String[] args){
        //adress nomee adresslab avec le constracteur par defaut
        Adresse adresslab = new Adresse();

        //modififer ladress et l'affichier
        adresslab.codePostale=178;
        adresslab.ville="tunis";
        adresslab.gouvernorat="benArous";
        adresslab.afficherAdress();
        adresslab.codePostale=172;
        adresslab.afficherAdress();
        Adresse autreadresslab = new Adresse("IbnSina","tunis",588);
        autreadresslab.ville="SidBouzid";
        autreadresslab.afficherAdress();
        Chercheur chercheur = new Chercheur("Ahmed","data_Analist",12);
        Chercheur autrechercheur = new Chercheur();
        autrechercheur.numOrdinateur=2;
        autrechercheur.nomChercheur="youssef";
        autrechercheur.postChercheur="Developeur";
        autrechercheur.afficherChercheur();
        System.out.println("le nombre de chercheurs cree est: "+ autrechercheur.getChercheur());
        System.out.println("est il chercheur1 == chercheur2 ? "+autrechercheur.comparer(chercheur));
        chercheur.numOrdinateur=19;
        Chercheur chercheur3 = new Chercheur();
        chercheur3.numOrdinateur=14;
        chercheur3.postChercheur="data_scientist";
        chercheur3.nomChercheur="Ahmed";
        Chercheur[] TC={autrechercheur,chercheur3};
        Bureaux bureaux1=new Bureaux(125,"javaC",TC);
        Bureaux bureaux2=new Bureaux(255,"caliClub",TC);
        Bureaux[] TB={bureaux1,bureaux2};
        Laboratoire laboratoire1= new Laboratoire("labo","cs",4,TB);

        laboratoire1.afficherLaboratoire();

    }
}
