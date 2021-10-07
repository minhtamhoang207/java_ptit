import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class J05018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<StudentResult> sr = new ArrayList<>();
        int count = 1;
        int n = sc.nextInt();
        int m = n-1;
        sc.nextLine();
        while (n>0){
            if (n <= m) {
                sc.nextLine();
            }
            String name;
            name = sc.nextLine();
            double[] points = new double[11];
            for(int i=0; i<10; i++){
                points[i] = Double.parseDouble(sc.next());
            }
            sr.add(new StudentResult(name, points, count));
            count++;
            n--;
        }

        sr.sort(Comparator.comparing(StudentResult::getPointToCompare).reversed());
        for(StudentResult i: sr){
            System.out.println(i);
        }


    }
}

class StudentResult{
    String name;
    double[] points;
    int id;
    double pointToCompare;

    public StudentResult(String name, double[] points, int id) {
        this.name = name;
        this.points = points;
        this.id = id;
        this.pointToCompare = point();
    }

    public double getPointToCompare() {
        return pointToCompare;
    }

    private double point(){
        double sum = 0.0;
        for(int i=0; i<10; i++){
            if(i==0 || i==1){
                sum += points[i]*2;
            } else{
                sum += points[i];
            }
        }
        return sum/12;
    }

    private String level(){
        double hihi = point();
        if(hihi < 5){
            return "YEU";
        } else if(hihi>=5 && hihi < 7){
            return "TB";
        } else if(hihi >= 7 && hihi < 8){
            return "KHA";
        } else if(hihi >= 8 && hihi < 9){
            return "GIOI";
        } else{
            return "XUAT SAC";
        }
    }
    private String genId(){
        if(id < 10){
            return "HS0" + id;
        } else{
            return "HS" + id;
        }
    }

    @Override
    public String toString() {
        return genId() + " " +
                name + " " +
                String.format("%.1f", (double) Math.ceil(point() * 100) / 100) + " " +
                level();
    }
}
