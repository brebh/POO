import java.util.Scanner;


public class Point {
    //les variable de classes
    private int abs;
    private int ord;
    public static int nombre=0;
    public int numero=nombre;

    // les Constructeurs
    public Point(){
        this.abs=0;
        this.ord=0;
        nombre++;
    }
    public Point(int u,int v){
        this.abs=u;
        this.ord=v;
        nombre++;
    }
    void setCoordonePoint(int u , int v){
        abs = u;
        ord = v;
    }
    void translate(int u,int v){
        abs = abs + u;
        ord = ord + v;
    }
    // les getters et les setters
    public int getY() {
        return ord;
    }

    public int getX() {
        return abs;
    }

    public void setY(int y) {
        this.ord = y;
    }
    public void setX(int x) {
        this.abs = x;
    }
    // les methods
    void affichePoint(){
        System.out.println("la point numero "+numero+" ("+this.getX()+","+this.getY()+") ");
    }
    boolean origine(){
        return this.abs==0 && this.ord==0;
    }
    boolean egale(Point point){
        return (this.getX()== point.getX() && this.getY()== point.getY());
    }

    void setCoordonePoint(Point point){
        this.setX(point.getX());
        this.setY(point.getY());

    }
    Point symetrie(){
        return new Point(-this.getX(),-this.getY());
    }






}
