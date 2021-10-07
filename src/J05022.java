import java.util.ArrayList;
import java.util.Scanner;

public class J05022 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student5022> st = new ArrayList<>();
        int n = sc.nextInt();
        sc.nextLine();
        while(n>0){
            String id, name, className, email;
            id = sc.nextLine();
            name = sc.nextLine();
            className = sc.nextLine();
            email = sc.nextLine();
            st.add(new Student5022(id, name, className, email));
            n--;
        }

        int q = Integer.parseInt(sc.nextLine());
        while (q-- > 0){
            String search = sc.nextLine();
            System.out.println("DANH SACH SINH VIEN LOP " + search + ":");
            for(Student5022 i: st){
                if(i.className.equals(search)){
                    System.out.println(i);
                }
            }
        }
    }
}

class Student5022{
    String id;
    String name;
    String className;
    String email;

    public Student5022(String id, String name, String className, String email) {
        this.id = id;
        this.name = name;
        this.className = className;
        this.email = email;
    }

    @Override
    public String toString() {
        return id + " " +
                name + " " +
                className + " " +
                email + " ";
    }
}
