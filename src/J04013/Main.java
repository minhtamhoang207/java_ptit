package J04013;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> sts = new ArrayList<>();
        int test = sc.nextInt();
        sc.nextLine();
        while (test-->0){
            String id = sc.nextLine();
            String name = sc.nextLine();
            double math = Double.parseDouble(sc.nextLine());
            double physics = Double.parseDouble(sc.nextLine());
            double chemical = Double.parseDouble(sc.nextLine());
            sts.add(new Student(id, name, math, physics, chemical));
        }
//        Comparator<Student> comparator = (o1, o2) -> {
//            if(o1.total != o2.total){
//                return o1.total() >= o2.total()?-1:1;
//            }else{
//                return o1.id.compareTo(o2.id);
//            }
//        };
//        sts.sort(comparator);
        sts.sort(Comparator.comparing(Student::total).reversed()
                .thenComparing(i -> i.id));
        for(Student st : sts){
            System.out.println(st);
        }

    }
}

class Student{
    String id;
    String name;
    double math;
    double physics;
    double chemical;
    double bonus;
    double total;
    String status;

    public Student(String id, String name, double math, double physics, double chemical) {
        this.id = id;
        this.name = name;
        this.math = math*2;
        this.physics = physics;
        this.chemical = chemical;
        this.bonus = bonus();
        this.total = total();
        this.status = status();
    }

    double bonus(){
        String temp = id.substring(0,3).toUpperCase();
        switch (temp){
            case "KV1": return 0.5;
            case "KV2": return 1.0;
            default: return 2.5;
        }
    }

    double total(){
        return math+physics+chemical+bonus;
    }

    String status(){
        if(total>=24){
            return "TRUNG TUYEN";
        } else{
            return "TRUOT";
        }
    }

    @Override
    public String toString() {
        return id + " " +
                name + " " +
                (bonus>(int)bonus?String.format("%.1f", bonus):(int)bonus) + " " +
                (total>(int)total?String.format("%.1f", total):(int)total) + " " +
                status;
    }
}
