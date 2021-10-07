import java.util.ArrayList;
import java.util.Scanner;

public class J05027 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Teacher5027> tc = new ArrayList<>();
        Teacher5027 Teacher5027 = new Teacher5027();
        int n = sc.nextInt();
        int count = 1;
        sc.nextLine();
        while(n>0){
            String name = sc.nextLine();
            String subject = sc.nextLine();
            tc.add(new Teacher5027(name, subject, count));
            count++;
            n--;
        }

        int q = Integer.parseInt(sc.nextLine());
        while (q-- > 0){
            String search = sc.nextLine();
            System.out.println("DANH SACH GIANG VIEN THEO TU KHOA " + search + ":");
            for(Teacher5027 t:tc){
                if(t.name.toLowerCase().contains(search.toLowerCase())){
                    System.out.println(t);
                }
            }
        }

    }
}

class Teacher5027{

    String name;
    String subject;
    int id;
    String genId;
    public Teacher5027() {}
    public Teacher5027(String name, String subject, int id) {
        this.name = name;
        this.subject = subject;
        this.id = id;
        this.genId = genId();
    }

    public String getGenId() {
        return genId;
    }

    private String genId(){
        if(id<10){
            return "GV0" + id;
        } else{
            return "GV" + id;
        }
    }

    public String shorten(){
        StringBuilder shortened = new StringBuilder();
        String[] arr = subject.split(" ");
        for (String value : arr) {
            String s = value.toUpperCase();
            shortened.append(s.charAt(0));
        }
        return shortened.toString();
    }

    @Override
    public String toString() {
        return genId() + " " +
                name + " " +
                shorten();
    }
}
