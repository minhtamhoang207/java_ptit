import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class J05028 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Company> companies = new ArrayList<>();
        int test = sc.nextInt();
        sc.nextLine();
        while(test-- > 0){
            String name = sc.nextLine();
            String fullName = sc.nextLine();
            int numberOfStudent = Integer.parseInt(sc.nextLine());
            companies.add(new Company(name, fullName, numberOfStudent));
        }

        Comparator<Company> comparator = (o1, o2) -> {
            if(o1.getNumberOfStudent() != o2.getNumberOfStudent()){
                return o1.getNumberOfStudent() >= o2.getNumberOfStudent()?-1:1;
            }else{
                return o1.getName().compareTo(o2.getName());
            }
        };
        companies.sort(comparator);
        for(Company c: companies){
            System.out.println(c);
        }
    }
}
class Company{
    String name;
    String fullName;
    int numberOfStudent;

    public Company(String name, String fullName, int numberOfStudent) {
        this.name = name;
        this.fullName = fullName;
        this.numberOfStudent = numberOfStudent;
    }
    public int getNumberOfStudent() {
        return numberOfStudent;
    }
    public String getName(){
        return name;
    }

    @Override
    public String toString() {
        return name + " " +
                fullName + " " +
                numberOfStudent;
    }
}