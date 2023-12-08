public class Employers {
    public int idemp;
    public String nomemp;
   public  String adresse;
    public int hours_per_month;
    static int empCpt;
    public Employers( int idemp,String nomemp,String adresse,int hours_per_month){
        this.idemp=idemp;
        this.nomemp=nomemp;
        this.adresse=adresse;
        this.hours_per_month=hours_per_month;
        empCpt++;

    }
    void afficherEmp(){
        System.out.println("ce employer est caraterisee par sont id: "+idemp+" nom: "+nomemp+" adresse "+adresse+" heurs de travaille/mois "+hours_per_month);

    }

    public  int getEmpCpt() {
        return empCpt;
    }
}
