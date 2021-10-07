import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J05020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student5> st5 = new ArrayList<>();
        int n = sc.nextInt();
        sc.nextLine();
        while(n>0){
            String id, name, className, email;
            id = sc.nextLine();
            name = sc.nextLine();
            className = sc.nextLine();
            email = sc.nextLine();
            st5.add(new Student5(id, name, className, email));
            n--;
        }

        Comparator<Student5> comparator = (o1, o2) -> {
            if(!o1.className.equals(o2.className)){
                return o1.className.compareTo(o2.className);
            }else{
                return o1.id.compareTo(o2.id);
            }
        };

        st5.sort(comparator);
        for(Student5 i: st5){
            System.out.println(i);
        }
    }
}
class Student5{
    String id;

    public Student5(String id, String name, String className, String email) {
        this.id = id;
        this.name = name;
        this.className = className;
        this.email = email;
    }

    String name;
    String className;
    String email;

    @Override
    public String toString() {
        return id + " " +
                name + " " +
                className + " " +
                email + " ";
    }
}