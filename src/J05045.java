import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class J05045 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Employee1> employee1s = new ArrayList<>();
        long test = sc.nextInt();
        long count = 1;
        sc.nextLine();
        while(test-- > 0){
            String name = sc.nextLine();
            String lv = sc.nextLine();
            long basic = Integer.parseInt(sc.nextLine());
            long day = Integer.parseInt(sc.nextLine());
            employee1s.add(new Employee1(count, name, lv, basic, day));
            count++;
        }
        employee1s.sort(Comparator.comparing(Employee1::salary).reversed());
        for(Employee1 e : employee1s){
            System.out.println(e);
        }
    }
}

class Employee1{
    long id;
    String name;
    String level;
    long basicSalary;
    long day;
    long salary;
    long allowance;
    long advancePayment;
    long change;
    String genId;


    public Employee1(long count, String name, String level, long basicSalary, long day) {
        this.name = name;
        this.level = level;
        this.basicSalary = basicSalary;
        this.day = day;
        this.allowance = allowance();
        this.salary = salary();
        this.advancePayment = advancePayment();
        this.change = change();
        this.id = count;
        this.genId = genId();
    }

    public String getGenId() {
        return genId;
    }

    long allowance(){
        switch (level) {
            case "GD":
                return 500;
            case "PGD":
                return 400;
            case "TP":
                return 300;
            case "KT":
                return 250;
            default:
                return 100;
        }
    }

    long salary(){
        return (day*basicSalary+allowance);
    }

    long advancePayment(){
        long a = ((allowance + salary)*2)/3;
        if(a < 25000){
            return Math.round((double) a/1000)*1000;
        } else{
            return 25000;
        }
    }

    long change() {
        return salary - advancePayment;
    }

    public String genId(){
        if(id<10){
            return "NV0" + id;
        } else{
            return "NV" + id;
        }
    }
    @Override
    public String toString() {
        return genId() + " " +
                name + " " +
                allowance + " " +
                day*basicSalary + " " +
                advancePayment + " " +
                change;
    }
}