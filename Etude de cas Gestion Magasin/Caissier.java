public class Caissier extends Employers {
   public  int numerocaisse;
   protected static int Ccpt;
    public Caissier(int idemp,String nomemp, String adress,int hours_per_month,int numcaisse){
        super(idemp,nomemp,adress,hours_per_month);
        this.numerocaisse=numcaisse;
        Ccpt++;
    }
    void afficherEmp(){
        // using polymorphisme to ovveride the same methode
        super.afficherEmp();
        System.out.println("numero de caisee est :"+numerocaisse);
        double sal = hours_per_month<=180 ? hours_per_month*5 :180*5+1.15*5*(hours_per_month-180);
        System.out.println("le salaire total du ce Caissier est de :"+sal+" dt");


    }
    int getCcpt(){
        return Ccpt;
    }

}
