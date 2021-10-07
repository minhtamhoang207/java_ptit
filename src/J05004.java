import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class J05004 {
    public static String genStudentId(int index){
        if(index >= 10){
            return "B20DCCN0" + index + " ";
        } else{
            return "B20DCCN00" + index + " ";
        }
    }
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String temp = sc.nextLine();
        ArrayList<Student2> students = new ArrayList<>();
        while (n>0){
            String name, className, birthday, gpa;
            name = sc.nextLine();
            className = sc.nextLine();
            birthday = sc.nextLine();
            gpa = sc.nextLine();
            students.add(new Student2(name, className, birthday, Double.parseDouble(gpa)));
            n--;
        }
        for(int i=0; i<students.size(); i++){
            System.out.println(genStudentId(i+1) + students.get(i).toString());
        }
    }
}

class Student2{
    String name;
    String className;
    String birthday;
    double gpa;
    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

    private String rename(String name){
        String result = "";
        StringTokenizer st = new StringTokenizer(name);
        while (st.hasMoreTokens()) {
            String str = st.nextToken().toLowerCase();
            String cap = str.substring(0, 1).toUpperCase() + str.substring(1);
            result += (cap + " ");
        }
        return result;
    }

    public Student2(String name, String className, String birthday, double gpa) throws ParseException {
        this.name = name;
        this.className = className;
        this.birthday = formatter.format(new SimpleDateFormat("dd/MM/yyyy").parse(birthday));
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return rename(name) + className + " " + birthday + " " + String.format("%.2f", gpa);
    }
}
