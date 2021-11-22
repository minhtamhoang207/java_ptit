package J07037;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        List<Company> subjects = new ArrayList<>();
        File file = new File("DN.in");
        Scanner sc = new Scanner(file);
        int test = Integer.parseInt(sc.nextLine().trim());
        while (test-->0){
            subjects.add(new Company(
                    sc.nextLine().trim(),
                    sc.nextLine().trim(),
                    Integer.parseInt(sc.nextLine().trim())
            ));
        }
        Comparator<Company> comparator = Comparator.comparing(Company::getName);
        subjects.sort(comparator);
        for(Company s : subjects){
            System.out.println(s);
        }
    }
}

class Company{
    String companyId;
    String name;
    int num;

    public Company(String companyId, String name, int num) {
        this.companyId = companyId;
        this.name = name;
        this.num = num;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return companyId + " " +
                name + " " +
                num;
    }
}

