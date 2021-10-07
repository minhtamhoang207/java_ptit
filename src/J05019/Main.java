package J05019;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Set<RainReport>> reports = new HashMap<>();
        ArrayList<String> str = new ArrayList<>();
        int test = sc.nextInt();
        sc.nextLine();
        while (test-->0){
            String name = sc.nextLine();
            str.add(name);
            String start = sc.nextLine();
            String end = sc.nextLine();
            int rainAmount = Integer.parseInt(sc.nextLine());
            if (!reports.containsKey(name)){
                Set<RainReport> rain = new HashSet<>();
                rain.add(new RainReport(name, start, end, rainAmount));
                reports.put(name,rain);
            } else{
                Set<RainReport> rain = reports.get(name);
                rain.add(new RainReport(name, start, end, rainAmount));
                reports.put(name,rain);
            }
        }

        int count = 1;
        for (String value : str) {
            int rain = 0;
            int minute = 0;
            if(reports.containsKey(value)){
                for (RainReport r : reports.get(value)) {
                    rain += r.rainAmount;
                    minute += r.minute;
                }
                System.out.println(
                        (count<10?"T0"+count:"T"+count) + " " +
                        value + " " +
                        String.format("%.2f", ((double)rain/((double)minute/60)))

                );
                reports.remove(value);
            }
            count++;
        }

    }
}

class RainReport{
    String name;
    String start;
    String end;
    int rainAmount;
    long minute;

    public RainReport(String name, String start, String end, int rainAmount) throws ParseException {
        this.name = name;
        this.start = start;
        this.end = end;
        this.rainAmount = rainAmount;
        this.minute = minute();
    }

    long minute() throws ParseException {
        String time1 = start+":00";
        String time2 = end+":00";
        SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
        Date date1 = format.parse(time1);
        Date date2 = format.parse(time2);
        return TimeUnit.MILLISECONDS.toMinutes((date2.getTime() - date1.getTime()));
    }

    @Override
    public String toString() {
        return "RainReport{" +
                "name='" + name + '\'' +
                ", start='" + start + '\'' +
                ", end='" + end + '\'' +
                ", rainAmount=" + rainAmount +
                ", hour=" + minute +
                '}';
    }
}
