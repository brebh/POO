public class Exercice {
    private float longeur;
    private float largeur;
    public Exercice(float longeur, float largeur){
        this.longeur=longeur;
        this.largeur=largeur;
    }
    public float Perimettre(){
        return ((this.longeur+this.largeur)*2);
    }
    public  double Diagonal(){



        return (Math.sqrt(this.largeur*this.largeur+this.longeur*this.longeur));


    }
    public float Doubler(){
        return this.longeur+this.largeur;
    }

    public static void main(String[] args){
        System.out.println("exercice 1: ");
        System.out.println("bonjour tout le monde");
        System.out.println("exercice 2: ");
        int i,j,n;
        i=0;
        n=i++;
        System.out.println("A: i= "+i+" n= "+n);
        i=10;
        n=++i;
        System.out.println("b: i= "+i+" n= "+n);
        i=20;j=5;n=i++*++j;
        System.out.println("c :i= "+i+"j= "+j+"n= "+n);
        i=15;n =i+=3;
        System.out.println("d: i= "+i+" n= "+n);
        i=3;j=5;n=i*=--j;
        System.out.println("c :i= "+i+"j= "+j+"n= "+n);
        System.out.println("exercice 3: ");
        Exercice rectangle = new Exercice(5,7);
        System.out.println("le perimettre du rectangle est: "+rectangle.Perimettre());
        System.out.println("le diagonale du rectangle est: "+rectangle.Diagonal());
        System.out.println("le doubler du rectangle est: "+rectangle.Doubler());



    }

}
