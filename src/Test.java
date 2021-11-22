import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Test {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<Subject> subjects = new ArrayList<>();
        File file = new File("MONHOC.in");
        Scanner sc = new Scanner(file);
        int test = Integer.parseInt(sc.nextLine().trim());
        while (test-->0){
            subjects.add(new Subject(
               sc.nextLine().trim(),
               sc.nextLine().trim(),
               Integer.parseInt(sc.nextLine().trim())
            ));
        }
        subjects.sort(Comparator.comparing(Subject::getName));
        for(Subject s : subjects){
            System.out.println(s);
        }
    }
}


class Subject{
    String subjectId;
    String name;
    int num;

    public Subject(String subjectId, String name, int num) {
        this.subjectId = subjectId;
        this.name = name;
        this.num = num;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return subjectId + " " +
                name + " " +
                num;
    }
}