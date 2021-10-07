import java.util.Scanner;

public class J04012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Wage wage = new Wage(
                sc.nextLine(),
                Integer.parseInt(sc.nextLine()),
                Integer.parseInt(sc.nextLine()),
                sc.nextLine()
        );

        System.out.println(wage);

    }
}

class Wage{
    String name;
    int dailySalary;
    int day;
    String level;
    int salary;
    int bonus;
    int allowance;
    String id;
    int total;

    public Wage(String name, int dailySalary, int day, String level) {
        this.name = name;
        this.dailySalary = dailySalary;
        this.day = day;
        this.level = level;
        this.salary = getSalary();
        this.bonus = getBonus();
        this.allowance = getAllowance();
        this.id = "NV01";
        this.total = getTotal();
    }


    public int getSalary() {
        return dailySalary * day;
    }

    public int getBonus() {
        if(day >= 25){
            return (int) Math.round((double)(salary*20)/100);
        } else if( day>=22 ){
            return (int) Math.round((double)(salary*10)/100);
        } else{
            return 0;
        }
    }

    public int getAllowance() {
        switch (level){
            case "GD": return 250000;
            case "PGD": return 200000 ;
            case "TP": return 180000;
            case "NV": return  150000;
            default: return 0;
        }
    }

    public int getTotal(){
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