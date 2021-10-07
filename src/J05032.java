import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.Scanner;

public class J05032 {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        ArrayList<Information> information = new ArrayList<>();
        int test = sc.nextInt();
        sc.nextLine();
        while(test-- > 0){
            String name = sc.next();
            String date = sc.nextLine();
            Date date1 = new SimpleDateFormat("dd/MM/yyyy").parse(date);
            information.add(new Information(name , date1));
        }

        information.sort(Comparator.comparing(Information::getDate));
        System.out.println(information.get(information.size()-1));
        System.out.println(information.get(0));

    }
}
class Information{
    String name;
    Date date;

    public Information(String name, Date date) {
        this.name = name;
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    @Override
    public String toString() {
        return name;
    }
}