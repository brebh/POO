public class responsable extends Employers {
   public  int prime;
   public static int Rcpt;
    public responsable(int idemp,String nomemp, String adress,int hours_per_month,int prime){
        super(idemp,nomemp,adress, hours_per_month);
        this.prime=prime;
        Rcpt++;
    }
    void afficherEmp(){
        // using polymorfisme to ovveride the same methode
        super.afficherEmp();
        System.out.println("prime est :"+prime);
        double sal = hours_per_month<=160 ? hours_per_month*10+prime :1600+12*(hours_per_month-160);
        System.out.println("le salaire du se responsable total (prime consernee) est de: "+sal+" dt");
    }

    public  int getRcpt() {
        return Rcpt;
    }
}
