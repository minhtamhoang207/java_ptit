import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class J05033 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Time> times = new ArrayList<>();
        int test = sc.nextInt();
        while(test-- > 0){
            int hour = sc.nextInt();
            int minute = sc.nextInt();
            int second = sc.nextInt();
            times.add(new Time(hour, minute, second));
        }

        times.sort(Comparator.comparing(Time::getTime));

        for(Time t : times){
            System.out.println(t);
        }
    }
}

class Time{
    int hour;
    int minute;
    int second;
    int time;

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
        this.time = (hour * 3600) + (minute*60) + second;
    }

    public int getTime() {
        return time;
    }

    @Override
    public String toString() {
        return hour + " " + minute + " " + second;
    }
}
