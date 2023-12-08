public class Personne {
    String name;
    String firstName;
    int dayNaiss;
    int monthNaiss;
    int yearNaiss;


    public void setName(String name) {
        this.name = name;
    }

void affichagePersonne(){
    System.out.println(this.name+" "+this.firstName+" est un personne nai le "+this.dayNaiss+"/"+monthNaiss+"/"+yearNaiss);
}
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setDateNaiss(int dd,int mm,int yyyy){
        this.yearNaiss=yyyy;
        this.monthNaiss=mm;
        this.dayNaiss=dd;
    }
    int ageEn2023(){
        return (2023-yearNaiss);
    }
    public static void main(String[] args){
     Personne etudiant =new Personne();
     etudiant.setDateNaiss(29,6,2003);
     etudiant.setFirstName("Ahmed");
     etudiant.setName("Achour");
     etudiant.affichagePersonne();
        System.out.println("lage de cette personne est: "+etudiant.ageEn2023()+" ans");

    }
}
