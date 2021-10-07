package J05061;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Fuho> fuhos = new ArrayList<>();
        int count = 1;
        int test = sc.nextInt();
        sc.nextLine();
        while (test-->0){
            fuhos.add(new Fuho(
                    count,
                    sc.nextLine(),
                    sc.nextLine(),
                    Double.parseDouble(sc.nextLine()),
                    Double.parseDouble(sc.nextLine())
            ));
            count++;
        }

        fuhos.sort(Comparator.comparing(Fuho::total).reversed());
        for(Fuho f : fuhos){
            System.out.println(f);
        }
    }
}

class Fuho{
    int count;
    String name;
    String dob;
    double theoPoint;
    double actPoint;
    int age;
    double bonus;
    int total;
    String rate;
    String id;

    public Fuho(int count, String name, String dob, double theoPoint, double actPoint) {
        this.count = count;
        this.name = name;
        this.dob = dob;
        this.theoPoint = theoPoint;
        this.actPoint = actPoint;
        this.age = age();
        this.bonus = bonus();
        this.total = total();
        this.rate = rate();
        this.id = count<10?"PH0"+count:"PH"+count;
    }

    int age(){
        return 2021 - Integer.parseInt(dob.substring(6,10));
    }
    double bonus(){
        if(theoPoint>=8 && actPoint>=8){
            return 1;
        } else if(theoPoint>=7.5 && actPoint>=7.5){
            return 0.5;
        } else{
            return 0;
        }
    }

    int total(){
        double temp = (theoPoint + actPoint)/2 + bonus;
        return temp>=10?10: (int) Math.round(temp);
    }

    String rate(){
        if(total>=9){
            return "Xuat sac";
        } else if(total>=8){
            return "Gioi";
        } else if(total>=7){
            return "Kha";
        } else if(total>=5){
            return "Trung binh";
        } else{
            return "Truot";
        }
    }

    @Override
    public String toString() {
        return id + " " +
                name + " " +
                age + " " +
                total + " " +
                rate;
    }
}
