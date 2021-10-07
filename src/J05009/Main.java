package J05009;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<CacNgai> cacNgais = new ArrayList<>();
        int count = 1;
        int test = sc.nextInt();
        sc.nextLine();
        while (test-->0){
            cacNgais.add(new CacNgai(
                    count,
                    sc.nextLine(),
                    sc.nextLine(),
                    Double.parseDouble(sc.nextLine()),
                    Double.parseDouble(sc.nextLine()),
                    Double.parseDouble(sc.nextLine())
            ));
            count++;
        }

        cacNgais.sort(Comparator.comparing(CacNgai::getTotal).reversed());

        for(CacNgai cn: cacNgais){
            if(cn.total==cacNgais.get(0).total){
                System.out.println(cn);
            }
        }
    }
}

class CacNgai{
    int count;
    String name;
    String dob;
    double p1;
    double p2;
    double p3;
    double total;

    public CacNgai(int count, String name, String dob, double p1, double p2, double p3) {
        this.count = count;
        this.name = name;
        this.dob = dob;
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.total = p1 + p2 + p3;
    }

    public double getTotal() {
        return total;
    }

    @Override
    public String toString() {
        return count + " " +
                name + " " +
                dob + " " +
                total + " ";
    }
}
