import java.util.Scanner;

public class J04008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while (test-->0){
            Point2D p1 = new Point2D(sc.nextFloat(), sc.nextFloat());
            Point2D p2 = new Point2D(sc.nextFloat(), sc.nextFloat());
            Point2D p3 = new Point2D(sc.nextFloat(), sc.nextFloat());
            System.out.println(Point2D.chuvi(p1, p2, p3));
        }
    }
}
class Point2D{
    double p1;
    double p2;

    public Point2D(double p1, double p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public static String chuvi(Point2D A, Point2D B, Point2D C){
        Point2D AB = new Point2D(B.p1 - A.p1, B.p2 - A.p2);
        double lengthAB = Math.sqrt(Math.pow(AB.p1, 2) + Math.pow(AB.p2, 2));
        System.out.println(lengthAB);
        Point2D AC = new Point2D(C.p1 - A.p1, C.p2 - A.p2);
        double lengthAC = Math.sqrt(Math.pow(AC.p1, 2) + Math.pow(AC.p2, 2));
        System.out.println(lengthAC);
        Point2D BC = new Point2D(C.p1 - B.p1, C.p2 - B.p2);
        double lengthBC = Math.sqrt(Math.pow(BC.p1, 2) + Math.pow(BC.p2, 2));
        System.out.println(lengthBC);
        return String.format("%.3f",lengthAB + lengthAC + lengthBC);
    }
}
