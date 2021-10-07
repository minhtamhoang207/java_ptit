import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class J05065 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Staff> staffs = new ArrayList<>();
        int test = sc.nextInt();
        sc.nextLine();
        while (test-->0){
            String id = sc.next();
            String name = sc.nextLine().trim();
            String temp = id.substring(0,2);
            int last = Integer.parseInt(id.substring(4,7));
            if((temp.equals("GD") && last>1) || ((temp.equals("TP") || temp.equals("PP")) && (last>3))){
                String newId = "NV" + id.substring(2, 7);
                staffs.add(new Staff(newId, name));
            } else{
                staffs.add(new Staff(id, name));
            }
        }


        staffs.sort(Comparator.comparing(Staff::intSalaryLevel).reversed()
                .thenComparing(Staff::intNumber));

        int n = Integer.parseInt(sc.nextLine());
        while (n-->0){
            String query = sc.nextLine();
            for(Staff s : staffs){
                if(s.name.toLowerCase().contains(query.toLowerCase())){
                    System.out.println(s);
                }
            }
            System.out.println();
        }
    }
}

class Staff{
    String id;
    String name;
    String levelId;
    String number;
    String salaryLevel;


    public Staff(String id, String name) {
        this.id = id;
        this.name = name;
        this.levelId = levelId();
        this.number = number();
        this.salaryLevel = salaryLevel();
    }

    String levelId(){
        return id.substring(0,2);
    }

    String number(){
        return id.substring(4,7);
    }

    String salaryLevel(){
        return id.substring(2,4);
    }

    int intSalaryLevel(){
        return Integer.parseInt(this.salaryLevel);
    }
    int intNumber(){
        return Integer.parseInt(this.number);
    }
    @Override
    public String toString() {
        return name + " " +
                levelId + " " +
                number + " " +
                salaryLevel;
    }
}
