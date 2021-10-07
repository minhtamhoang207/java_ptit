import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class J05005 {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 1;
        String temp = sc.nextLine();
        ArrayList<Student3> students = new ArrayList<>();
        while (n>0){
            String name, className, birthday, gpa;
            name = sc.nextLine();
            className = sc.nextLine();
            birthday = sc.nextLine();
            gpa = sc.nextLine();
            students.add(new Student3(count, name, className, birthday, Double.parseDouble(gpa)));
            n--;
            count++;
        }

        students.sort(Comparator.comparing(Student3::getGpa).reversed());

        for (Student3 student : students) {
            System.out.println(student.toString());
        }
    }
}

class Student3{
    int id;
    String name;
    String className;
    String birthday;

    public double getGpa() {
        return gpa;
    }

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

    private String genStudentId(int index){
        if(index >= 10){
            return "B20DCCN0" + index ;
        } else{
            return "B20DCCN00" + index ;
        }
    }

    public Student3(int id, String name, String className, String birthday, double gpa) throws ParseException {
        this.id = id;
        this.name = name;
        this.className = className;
        this.birthday = formatter.format(new SimpleDateFormat("dd/MM/yyyy").parse(birthday));
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return genStudentId(id) + " " + rename(name) + className + " " + birthday + " " + String.format("%.2f", gpa);
    }
}
