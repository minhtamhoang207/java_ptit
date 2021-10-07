import java.util.Scanner;

public class J04011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            Point3D p1 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
            Point3D p2 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
            Point3D p3 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
            Point3D p4 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());

            if(Point3D.check(p1,p2,p3,p4)){
                System.out.println("YES");
            } else{
                System.out.println("NO");
            }
        }
    }
}
class Point3D{
    static boolean check(Point3D p1,Point3D p2,Point3D p3,Point3D p4 ){
        Point3D ab = new Point3D(p2.a-p1.a, p2.b-p1.b, p2.c-p1.c );
        Point3D ac = new Point3D(p3.a-p1.a, p3.b-p1.b, p3.c-p1.c );
        Point3D ad = new Point3D(p4.a-p1.a, p4.b-p1.b, p4.c-p1.c );
        Point3D abac = new Point3D(
                (ab.b*ac.c)-(ab.c*ac.b),
                (ab.c*ac.a)-(ab.a*ac.c),
                (ab.a*ac.b)-(ab.b*ac.a)
        );
        int abacad = abac.a*ad.a + abac.b*ad.b + abac.c*ad.c;
        return abacad == 0;
    }
    int a;
    int b;
    int c;

    public Point3D(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
}
