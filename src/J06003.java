import java.util.ArrayList;
import java.util.Scanner;

public class J06003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student6003> student6003s = new ArrayList<>();
        ArrayList<String> titles = new ArrayList<>();
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();
        while(n-- > 0){
            String id = sc.nextLine();
            String name = sc.nextLine();
            String phone = sc.nextLine();
            int num = Integer.parseInt(sc.nextLine());
            student6003s.add(new Student6003(id, name, phone, num));
        }
        while(m-- >0){
            titles.add(sc.nextLine());
        }
        int q = Integer.parseInt(sc.nextLine());
        while(q-- >0){
            int search = Integer.parseInt(sc.nextLine());
            System.out.println("DANH SACH NHOM " + search + ":");
            for ( Student6003 s: student6003s){
                if(s.num == search){
                    System.out.println(s);
                }
            }
            System.out.println("Bai tap dang ky: " + titles.get(search-1));
        }
    }
}

class Student6003{
    String id;
    String name;
    String phone;
    int num;

    public Student6003(String id, String name, String phone, int num) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    @Override
    public String toString() {
        return id + " " +
                name + " " +
                phone;
    }
}
