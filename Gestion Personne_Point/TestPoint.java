public class TestPoint {
    public static void main(String[] args){
        Point A = new Point(1,2);// numero 0
        Point B = new Point();// numero 1
        Point P = new Point(1,1);// numero 2
        Point Q = new Point(-2,-1);// numero 3

        A.setCoordonePoint(2,1);
        // les nouveau coordonne du point sont A(2,1)
        A.affichePoint();
        B.affichePoint();
        System.out.println("les coordonne du point B sont nulles? "+B.origine());
        P.affichePoint();
        Q.affichePoint();
        System.out.println("P=Q? "+P.egale(Q));
        P.setCoordonePoint(A);
        //les nouveau coordonne du point P(2,1)
        Q=Q.symetrie();
        //les nouveau coordonnee du point Q(2,1)
        System.out.println("A=Q? "+A.egale(Q));
        B.translate(2,1);
        //les nouveau coordonne du point B(2,1)
        System.out.println("B=P? "+P.egale(B));





        }}

