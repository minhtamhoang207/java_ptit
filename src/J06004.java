import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J06004 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student4> st4 = new ArrayList<>();
        ArrayList<String> titles = new ArrayList<>();
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();
        while(n>0){
            String id, name, phone, number;
            id = sc.nextLine();
            name = sc.nextLine();
            phone = sc.nextLine();
            number = sc.nextLine();
            st4.add(new Student4(id, name, phone, Integer.parseInt(number)));
            n--;
        }
        while (m>0){
            String title = sc.nextLine();
            titles.add(title);
            m--;
        }

        Collections.sort(st4, Comparator.comparing(sv -> sv.id));
        for(Student4 i: st4){
            System.out.print(i);
            System.out.println(titles.get(i.getNumber()-1));
        }
    }
}

class Student4{
    String id;
    String name;
    String phone;
    int number;
    String className;
    String email;

    public Student4(String id, String name, String phone, int number) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.number = number;
    }

    public int getNumber() {
        return number;
    }


    @Override
    public String toString() {
        return id + " " +
                name + " " +
                phone + " " +
                number + " ";
    }
}