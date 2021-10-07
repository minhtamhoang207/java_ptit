import java.util.ArrayList;
import java.util.Scanner;

public class J05038 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Wage> wages = new ArrayList<>();
        int count = 1;
        int test = sc.nextInt();
        sc.nextLine();
        while(test-->0){
            String name = sc.nextLine();
            long dailySalary = Long.parseLong(sc.nextLine());
            long day = Long.parseLong(sc.nextLine());
            String level = sc.nextLine();
            wages.add(new Wage(count, name, dailySalary, day, level));
            count++;
        }
        long sum = 0;
        for(Wage w : wages){
            System.out.println(w);
            sum+=w.total;
        }
        System.out.println("Tong chi phi tien luong: " + sum);


    }
}

class Wage{
    String name;
    long dailySalary;
    long day;
    String level;
    long salary;
    long bonus;
    long allowance;
    String id;
    int count;
    long total;

    public Wage(int count, String name, long dailySalary, long day, String level) {
        this.name = name;
        this.dailySalary = dailySalary;
        this.day = day;
        this.level = level;
        this.salary = getSalary();
        this.bonus = getBonus();
        this.allowance = getAllowance();
        this.count = count;
        this.id = getId();
        this.total = getTotal();
    }


    public long getSalary() {
        return dailySalary * day;
    }

    public long getBonus() {
        if(day >= 25){
            return Math.round((double)(salary*20)/100);
        } else if( day>=22 ){
            return Math.round((double)(salary*10)/100);
        } else{
            return 0;
        }
    }

    public long getAllowance() {
        switch (level){
            case "GD": return 250000;
            case "PGD": return 200000 ;
            case "TP": return 180000;
            case "NV": return  150000;
            default: return 0;
        }
    }

    public String getId() {
        if(count<10){
            return "NV0" + count;
        } else{
            return "NV" + count;
        }
    }

    public long getTotal(){
        return (salary + bonus + allowance);
    }


    @Override
    public String toString() {
        return id + " " +
                name + " " +
                salary + " " +
                bonus + " " +
                allowance + " " +
                total;
    }
}
