import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class J05025 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Teacher> tc = new ArrayList<>();
        int n = sc.nextInt();
        int count = 1;
        sc.nextLine();
        while(n>0){
            String name = sc.nextLine();
            String subject = sc.nextLine();
            tc.add(new Teacher(name, subject, count));
            count++;
            n--;
        }
        Comparator<Teacher> comparator = (o1, o2) -> {
            if(!o1.getOnlyName().equals(o2.getOnlyName())){
                return o1.getOnlyName().compareTo(o2.getOnlyName());
            }else{
                return o1.getGenId().compareTo(o2.getGenId());
            }
        };
        tc.sort(comparator);

        for(Teacher t:tc){
            System.out.println(t);
        }

    }
}

class Teacher{

    String name;
    String subject;
    int id;
    String genId;
    public Teacher(String name, String subject, int id) {
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

    private String shorten(){
        String shortened = "";
        String[] arr = subject.split(" ");
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i].toUpperCase();
            shortened += s.charAt(0);
        }
        return  shortened;
    }

    public String getOnlyName(){
        String[] arr = name.split(" ");
        return arr[arr.length-1];
    }

    @Override
    public String toString() {
        return genId() + " " +
                name + " " +
                shorten();
    }
}
