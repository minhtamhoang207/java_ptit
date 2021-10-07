import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class J04006 {
    public static String genStudentId(int index){
        if(index >= 10){
            return "B20DCCN0" + index + " ";
        } else{
            return "B20DCCN00" + index + " ";
        }
    }
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student6> students = new ArrayList<>();
        String name, className, birthday, gpa;
        name = sc.nextLine();
        className = sc.nextLine();
        birthday = sc.nextLine();
        gpa = sc.nextLine();
        students.add(new Student6(name, className, birthday, Double.parseDouble(gpa)));
        for(int i=0; i<students.size(); i++){
            System.out.println(genStudentId(i+1) + students.get(i).toString());
        }
    }
}

class Student6{
    String name;
    String className;
    String birthday;
    double gpa;
    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
    public Student6(String name, String className, String birthday, double gpa) throws ParseException {
        this.name = name;
        this.className = className;
        this.birthday = formatter.format(new SimpleDateFormat("dd/MM/yyyy").parse(birthday));
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return name + " " + className + " " + birthday + " " + String.format("%.2f", gpa);
    }
}
