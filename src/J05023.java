import java.util.ArrayList;
import java.util.Scanner;

public class J05023 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Teacher5023> st = new ArrayList<>();
        int n = sc.nextInt();
        sc.nextLine();
        while(n>0){
            String id, name, className, email;
            id = sc.nextLine();
            name = sc.nextLine();
            className = sc.nextLine();
            email = sc.nextLine();
            st.add(new Teacher5023(id, name, className, email));
            n--;
        }

        int q = Integer.parseInt(sc.nextLine());
        while (q-- > 0){
            String data = sc.nextLine();
            String search = String.valueOf((data.charAt(2) + data.charAt(3)));
            System.out.println("DANH SACH SINH VIEN KHOA " + data + ":");
            for(Teacher5023 i: st){
                if(i.schoolYear.equals(search)){
                    System.out.println(i);
                }
            }
        }
    }
}

class Teacher5023{
    String id;
    String name;
    String className;
    String email;
    String schoolYear;

    public Teacher5023(String id, String name, String className, String email) {
        this.id = id;
        this.name = name;
        this.className = className;
        this.email = email;
        this.schoolYear = String.valueOf((className.charAt(1) + className.charAt(2)));
    }

    @Override
    public String toString() {
        return id + " " +
                name + " " +
                className + " " +
                email + " ";
    }
}
