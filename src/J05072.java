import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class J05072 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        sc.nextLine();
        ArrayList<City> cities = new ArrayList<>();
        while (test-->0){
            cities.add(new City(
                    sc.nextLine(),
                    sc.nextLine(),
                    Integer.parseInt(sc.nextLine())
            ));
        }

        int test2 = Integer.parseInt(sc.nextLine());
        ArrayList<Call> calls = new ArrayList<>();
        while (test2-->0){
            String temp = sc.nextLine();
            String[] data = temp.split(" ");
            if(data[0].startsWith("0")){
                for(City c: cities){
                    if(data[0].substring(1,3).equals(c.id)){
                        calls.add(new Call(data[0], data[1], data[2], c));
                    }
                }
            } else{
                calls.add(new Call(data[0], data[1], data[2], new City(
                        "","Noi mang", 800
                )));
            }
        }

        calls.sort(Comparator.comparing(Call::fee).reversed());
        for(Call call : calls){
            System.out.println(call);
        }
    }
}

class City{
    String id;
    String cityName;
    long fee;

    public City(String id, String cityName, long fee) {
        this.id = id;
        this.cityName = cityName;
        this.fee = fee;
    }
}

class Call{
    String phoneNumber;
    String startAt;
    String endAt;
    boolean check;
    City city;
    int minute;
    long fee;

    public Call(String phoneNumber, String startAt, String endAt, City city) {
        this.phoneNumber = phoneNumber;
        this.startAt = startAt;
        this.endAt = endAt;
        this.check = check();
        this.city = city;
        this.minute = minute();
        this.fee = fee();
    }

    boolean check(){
        return phoneNumber.startsWith("0");
    }
    int minute(){
        String[] temp = startAt.split(":");
        int start = (Integer.parseInt(temp[0]) * 60 ) + Integer.parseInt(temp[1]);
        String[] temp2 = endAt.split(":");
        int end = (Integer.parseInt(temp2[0]) * 60 ) + Integer.parseInt(temp2[1]);
        if(check){
            return end - start;
        } else{
            return (int) Math.ceil((double) (end - start)/3);
        }
    }

    long fee(){
        return minute* city.fee;
    }

    @Override
    public String toString() {
        return phoneNumber + " " +
                city.cityName + " " +
                minute + " " +
                fee;
    }
}