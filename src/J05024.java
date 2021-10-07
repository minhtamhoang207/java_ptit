import java.util.ArrayList;
import java.util.Scanner;

public class J05024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student5024> st = new ArrayList<>();
        int n = sc.nextInt();
        sc.nextLine();
        while(n>0){
            String id, name, className, email;
            id = sc.nextLine();
            name = sc.nextLine();
            className = sc.nextLine();
            email = sc.nextLine();
            st.add(new Student5024(id, name, className, email));
            n--;
        }

        int q = Integer.parseInt(sc.nextLine());
        while (q-- > 0){
            String search = sc.nextLine();
            String temp = "";
            switch (search.toLowerCase()) {
                case "ke toan":
                    temp = "DCKT";
                    break;
                case "cong nghe thong tin":
                    temp = "DCCN";
                    break;
                case "an toan thong tin":
                    temp = "DCAT";
                    break;
                case "vien thong":
                    temp = "DCVT";
                    break;
                case "dien tu":
                    temp = "DCDT";
                    break;
            }
            System.out.println("DANH SACH SINH VIEN NGANH " + search.toUpperCase() + ":");
            for(Student5024 i: st){
                if(temp.equals("DCCN") || temp.equals("DCAT")){
                    if(!i.id.startsWith("E") && i.id.contains(temp)){
                        System.out.println(i);
                    }
                } else if(i.id.contains(temp)){
                    System.out.println(i);
                }
            }
        }
    }
}

class Student5024{
    String id;
    String name;
    String className;
    String email;

    public Student5024(String id, String name, String className, String email) {
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
