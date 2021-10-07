import java.util.ArrayList;
import java.util.Scanner;

public class J05026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Teacher5026> tc = new ArrayList<>();
        Teacher5026 teacher5026 = new Teacher5026();
        int n = sc.nextInt();
        int count = 1;
        sc.nextLine();
        while(n>0){
            String name = sc.nextLine();
            String subject = sc.nextLine();
            tc.add(new Teacher5026(name, subject, count));
            count++;
            n--;
        }

        int q = Integer.parseInt(sc.nextLine());
        while (q-- > 0){
            String search = sc.nextLine();
            String shortened = teacher5026.shorten(search);
            System.out.println("DANH SACH GIANG VIEN BO MON " + shortened + ":");
            for(Teacher5026 t:tc){
                if(t.subject.equals(search)){
                    System.out.println(t);
                }
            }
        }

    }
}

class Teacher5026{

    String name;
    String subject;
    int id;
    String genId;
    public Teacher5026() {}
    public Teacher5026(String name, String subject, int id) {
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

    public String shorten(String subject){
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
