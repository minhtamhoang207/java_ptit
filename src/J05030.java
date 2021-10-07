import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class J05030 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student5030> student5030s = new ArrayList<>();
        int test = sc.nextInt();
        sc.nextLine();
        while(test-- > 0){
            String id = sc.nextLine();
            String name = sc.nextLine();
            String className = sc.nextLine();
            double p1 = Double.parseDouble(sc.nextLine());
            double p2 = Double.parseDouble(sc.nextLine());
            double p3 = Double.parseDouble(sc.nextLine());
            student5030s.add(new Student5030(id, name, className, p1, p2, p3));
        }
        student5030s.sort(Comparator.comparing(Student5030::getId));
        for(int i=0; i<student5030s.size();i++){
            System.out.print(i+1 + " " + student5030s.get(i));
            System.out.println();
        }

    }
}

class Student5030{
    String id;
    String name;
    String className;
    double p1;
    double p2;
    double p3;

    public Student5030(String id, String name, String className, double p1, double p2, double p3) {
        this.id = id;
        this.name = name;
        this.className = className;
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return id + " " +
                name + " " +
                className + " " +
                String.format("%.1f",p1) + " " +
                String.format("%.1f",p2) + " " +
                String.format("%.1f",p3) + " " ;
    }
}

