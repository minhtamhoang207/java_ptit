import java.text.ParseException;
        import java.text.SimpleDateFormat;
        import java.util.ArrayList;
        import java.util.Scanner;

public class J05003 {
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
        ArrayList<Student> students = new ArrayList<>();
        while (n>0){
            String name, className, birthday, gpa;
            name = sc.nextLine();
            className = sc.nextLine();
            birthday = sc.nextLine();
            gpa = sc.nextLine();
            students.add(new Student(name, className, birthday, Double.parseDouble(gpa)));
            n--;
        }
        for(int i=0; i<students.size(); i++){
            System.out.println(genStudentId(i+1) + students.get(i).toString());
        }
    }
}

class Student{
    String name;
    String className;
    String birthday;
    double gpa;
    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
    public Student(String name, String className, String birthday, double gpa) throws ParseException {
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
