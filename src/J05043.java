//import java.util.ArrayList;
//import java.util.Comparator;
//import java.util.Scanner;
//
//public class J05043 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        ArrayList<Employee> employees = new ArrayList<>();
//        long test = sc.nextInt();
//        long count = 1;
//        sc.nextLine();
//        while(test-- > 0){
//            String name = sc.nextLine();
//            String lv = sc.nextLine();
//            long basic = Integer.parseInt(sc.nextLine());
//            long day = Integer.parseInt(sc.nextLine());
//            employees.add(new Employee(count, name, lv, basic, day));
//            count++;
//        }
//        employees.sort(Comparator.comparing(Employee::salary).reversed());
//        for(Employee e : employees){
//            System.out.println(e);
//        }
//    }
//}
//
//class Employee{
//    long id;
//    String name;
//    String level;
//    long basicSalary;
//    long day;
//    long salary;
//    long allowance;
//    long advancePayment;
//    long change;
//
//
//    public Employee(long count, String name, String level, long basicSalary, long day) {
//        this.name = name;
//        this.level = level;
//        this.basicSalary = basicSalary;
//        this.day = day;
//        this.allowance = allowance();
//        this.salary = salary();
//        this.advancePayment = advancePayment();
//        this.change = change();
//        this.id = count;
//    }
//
//    long allowance(){
//        switch (level) {
//            case "GD":
//                return 500;
//            case "PGD":
//                return 400;
//            case "TP":
//                return 300;
//            case "KT":
//                return 250;
//            default:
//                return 100;
//        }
//    }
//
//    long salary(){
//        return (day*basicSalary);
//    }
//
//    long advancePayment(){
//        long a = ((allowance + salary)*2)/3;
//        if(a < 25000){
//            return Math.round((double) a/1000)*1000;
//        } else{
//            return 25000;
//        }
//    }
//
//    long change() {
//        return allowance + salary - advancePayment;
//    }
//
//    private String genId(){
//        if(id<10){
//            return "NV0" + id;
//        } else{
//            return "NV" + id;
//        }
//    }
//    @Override
//    public String toString() {
//        return genId() + " " +
//                name + " " +
//                allowance + " " +
//                salary + " " +
//                advancePayment + " " +
//                change;
//    }
//}