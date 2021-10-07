import java.util.ArrayList;
import java.util.Scanner;

public class J04015 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Teacher3> Teacher3s = new ArrayList<>();
        int test = 1;
        int ht = 0;
        int hp = 0;
        while (test-->0){
            String id = sc.nextLine();
            String name = sc.nextLine();
            int basicSalary = Integer.parseInt(sc.nextLine());
            String temp = id.substring(0,2);
            if(temp.equals("HT")){
                if(ht<1){
                    Teacher3s.add(new Teacher3(id, name, basicSalary));
                    ht++;
                }
            } else if(temp.equals("HP")){
                if(hp<2){
                    Teacher3s.add(new Teacher3(id, name, basicSalary));
                    hp++;
                }
            } else{
                Teacher3s.add(new Teacher3(id, name, basicSalary));
            }
        }

        for (Teacher3 t : Teacher3s){
            System.out.println(t);
        }
    }
}

class Teacher3{
    String id;
    String name;
    int basicSalary;
    int salaryLevel;
    int allowance;
    int totalSalary;


    public Teacher3(String id, String name, int basicSalary) {
        this.id = id;
        this.name = name;
        this.basicSalary = basicSalary;
        this.salaryLevel = salaryLevel();
        this.allowance = allowance();
        this.totalSalary = totalSalary();
    }

    int salaryLevel(){
        return Integer.parseInt(id.substring(2,4));
    }

    int allowance(){
        String temp = id.substring(0,2);
        if ("HT".equals(temp)) {
            return 2000000;
        } else if ("HP".equals(temp)) {
            return 900000;
        }
        return 500000;
    }

    int totalSalary(){
        return basicSalary*salaryLevel+allowance;
    }

    @Override
    public String toString() {
        return id + " " +
                name + " " +
                salaryLevel + " " +
                allowance + " " +
                totalSalary;
    }
}