import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class J05016 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Room> rooms = new ArrayList<>();
        int test = sc.nextInt();
        int count = 1;
        sc.nextLine();
        while (test-->0){
            Room room = new Room(
                    count,
                    sc.nextLine(),
                    sc.nextLine(),
                    sc.nextLine(),
                    sc.nextLine(),
                    Long.parseLong(sc.nextLine())
            );
            rooms.add(room);
            count++;
        }
        rooms.sort(Comparator.comparing(Room::getTotalCost).reversed());
        for(Room r : rooms){
            System.out.println(r);
        }
    }
}
class Room{
    int count;
    String name;
    String roomNumber;
    String checkIn;
    String checkOut;
    long fee;
    String id;
    long price;
    long day;
    long totalCost;

    public Room(int count, String name, String roomNumber, String checkIn, String checkOut, long fee) {
        this.count = count;
        this.name = name;
        this.roomNumber = roomNumber;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.fee = fee;
        this.id = count<10? "KH0"+count:"KH"+count;
        this.price = getPrice();
        this.day = getDay();
        this.totalCost = getTotalCost();
    }

    public long getPrice() {
        if(roomNumber.startsWith("1")){
            return 25;
        } else if(roomNumber.startsWith("2")){
            return 34;
        } else if(roomNumber.startsWith("3")){
            return 50;
        } else if(roomNumber.startsWith("4")){
            return 80;
        } else{
            return 0;
        }
    }

    public long getDay() {
        SimpleDateFormat myFormat = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date date1 = myFormat.parse(checkIn);
            Date date2 = myFormat.parse(checkOut);
            long diff = date2.getTime() - date1.getTime();
            return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS)+1;
        } catch (ParseException e) {
            e.printStackTrace();
            return 0;
        }
    }

    public long getTotalCost() {
        return day*price+fee;
    }

    @Override
    public String toString() {
        return id + " " +
                name + " " +
                roomNumber + " " +
                day + " " +
                totalCost;
    }
}
