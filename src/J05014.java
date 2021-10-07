import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class J05014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Teacher> teachers = new ArrayList<>();
        int count = 1;
        int test = sc.nextInt();
        sc.nextLine();
        while (test-->0){
            Teacher teacher = new Teacher(
                    count,
                    sc.nextLine(),
                    sc.nextLine(),
                    Double.parseDouble(sc.nextLine()),
                    Double.parseDouble(sc.nextLine())
            );
            teachers.add(teacher);
            count++;
        }

        teachers.sort(Comparator.comparing(Teacher::getFinalPoint).reversed());
        for(Teacher t : teachers){
            System.out.println(t);
        }
    }
}

class Teacher{
    int count;
    String name;
    String id;
    double itPoint;
    double majorPoint;
    String autoIncrementId;
    double finalPoint;
    String rate;
    double bonusPoint;
    String subject;

    public Teacher(int count, String name, String id, double itPoint, double majorPoint) {
        this.count = count;
        this.name = name;
        this.itPoint = itPoint*2;
        this.majorPoint = majorPoint;
        this.id = id;
        this.autoIncrementId = getAutoIncrementId();
        this.bonusPoint = getBonusPoint();
        this.finalPoint = getFinalPoint();
        this.subject = getSubject();
        this.rate = getRate();
    }

    public String getAutoIncrementId() {
        return count<10?"GV0"+count:"GV"+count;
    }

    public double getFinalPoint() {
        return itPoint+majorPoint+bonusPoint;
    }

    public String getRate() {
        return finalPoint>=18?
                "TRUNG TUYEN":"LOAI";
    }

    public double getBonusPoint() {
        String a = String.valueOf(id.charAt(1));
        switch (a){
            case "1": return 2.0;
            case "2": return 1.5;
            case "3": return 1.0;
            default: return 0.0;
        }
    }

    public String getSubject() {
        String a = String.valueOf(id.charAt(0));
        switch (a){
            case "A": return "TOAN";
            case "B": return "LY";
            case "C": return "HOA";
            default: return "";
        }
    }


    @Override
    public String toString() {
        return autoIncrementId + " " +
                name + " " +
                subject + " " +
                String.format("%.1f", finalPoint) + " " +
                rate;
    }
}
