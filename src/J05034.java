import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class J05034 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Intern> interns = new ArrayList<>();
        int n = sc.nextInt();
        int count = 1;
        sc.nextLine();
        while(n-- > 0){
            String id = sc.nextLine();
            String name = sc.nextLine();
            String className = sc.nextLine();
            String email = sc.nextLine();
            String company = sc.nextLine();
            interns.add(new Intern(count, id, name, className, email, company));
            count++;
        }
        interns.sort(Comparator.comparing(Intern::getName));
        int q = Integer.parseInt(sc.nextLine());
        while (q-- > 0){
            String company = sc.nextLine();
            for(Intern i:interns){
                if(i.company.equals(company)){
                    System.out.println(i.toString());
                }
            }
        }
    }
}

class Intern{
    int id;
    String studentCode;
    String name;
    String className;
    String email;
    String company;

    public Intern(int id, String studentCode, String name, String className, String email, String company) {
        this.id = id;
        this.studentCode = studentCode;
        this.name = name;
        this.className = className;
        this.email = email;
        this.company = company;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return id + " " +
                studentCode + " " +
                name + " " +
                className + " " +
                email + " " +
                company;
    }
}
