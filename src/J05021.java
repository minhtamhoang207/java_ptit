import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class J05021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student5021> st5 = new ArrayList<>();
        while(sc.hasNextLine()){
            String id, name, className, email;
            id = sc.nextLine();
            if (id.isEmpty()) {
                break;
            }
            name = sc.nextLine();
            className = sc.nextLine();
            email = sc.nextLine();
            st5.add(new Student5021(id, name, className, email));
        }

        st5.sort(Comparator.comparing(Student5021::getId));
        for(Student5021 i: st5){
            System.out.println(i);
        }
    }
}
class Student5021{
    String id;
    String name;
    String className;
    String email;
    public Student5021(String id, String name, String className, String email) {
        this.id = id;
        this.name = name;
        this.className = className;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return id + " " +
                name + " " +
                className + " " +
                email + " ";
    }
}