import java.util.Scanner;

public class J04001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test > 0){
            double x1, x2, y1, y2;
            x1 = sc.nextDouble();
            x2 = sc.nextDouble();
            y1 = sc.nextDouble();
            y2 = sc.nextDouble();
            Point p1 = new Point(x1, x2);
            Point p2 = new Point(y1, y2);
            System.out.printf("%.4f\n", p1.distance(p1, p2));
            test--;
        }
    }
}

class Point{
    double x;
    double y;

    Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    double distance(Point p1, Point p2){
        return Math.sqrt(Math.pow((p2.x - p1.x), 2) + Math.pow((p2.y - p1.y), 2));
    }
}
