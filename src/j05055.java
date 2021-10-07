import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class j05055 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Athlete> athletes = new ArrayList<>();
        int test = sc.nextInt();
        int count = 1;
        sc.nextLine();
        while(test-->0){
            Athlete athlete = new Athlete(
                    count,
                    sc.nextLine(),
                    sc.nextLine(),
                    sc.nextLine(),
                    sc.nextLine()
            );
            athletes.add(athlete);
            count++;
        }

        int rank = 1;
        athletes.sort(Comparator.comparing(Athlete::getSecond));
        for(int i=0; i<athletes.size()-1; i++){
            if(athletes.get(i).second == athletes.get(i+1).second){
                athletes.get(i).setRank(rank);
            } else{
                athletes.get(i).setRank(rank);
                rank = i+2;
            }
        }
        athletes.get(athletes.size()-1).setRank(rank);

        for(Athlete s : athletes){
            System.out.println(s);
        }
    }
}
class Athlete{

    String name;
    String birthday;
    String start;
    String end;
    int age;
    int bonus;
    int rank;
    String rawResult;
    String bonusToString;
    String finalResult;
    int count;
    String id;
    long second;


    public Athlete(int count, String name, String birthday, String start, String end) {
        this.name = name;
        this.count = count;
        this.birthday = birthday;
        this.start = start;
        this.end = end;
        this.age = getAge();
        this.bonus = getBonus();
        this.rawResult = getRawResult();
        this.bonusToString = getBonusToString();
        this.finalResult = getFinalResult();
        this.id = getId();
        this.second = getSecond();
    }

    public static String formatDuration(Duration duration) {
        long seconds = duration.getSeconds();
        long absSeconds = Math.abs(seconds);
        String positive = String.format(
                "%02d:%02d:%02d",
                absSeconds / 3600,
                (absSeconds % 3600) / 60,
                absSeconds % 60);
        return seconds < 0 ? "-" + positive : positive;
    }

    public int getAge(){
        String[] arr = birthday.split("/");
        return 2021 - Integer.parseInt(arr[2]);
    }

    public int getBonus(){
        if(age>=32){
            return 3;
        } else if( age >=25){
            return 2;
        } else if( age >=18){
            return 1;
        } else{
            return 0;
        }
    }

    public String getRawResult(){
        LocalTime t1 = LocalTime.parse(start);
        LocalTime t2 = LocalTime.parse(end);
        Duration d = Duration.between(t1, t2);
        return formatDuration(d);
    }

    public String getBonusToString(){
        return "00:00:0"+bonus;
    }

    public String getFinalResult(){
        LocalTime t1 = LocalTime.parse(start);
        LocalTime t2 = LocalTime.parse(end);
        Duration d = Duration.between(t1, t2);
        return formatDuration(d.minusSeconds(bonus));
    }

    public String getId(){
        if(count<10){
            return "VDV0" + count;
        } else{
            return "VDV" + count;
        }
    }

    public long getSecond(){
        String[] arr = finalResult.split(":");
        return Integer.parseInt(arr[0])* 3600L
                + Integer.parseInt(arr[1])* 60L
                + Integer.parseInt(arr[2]);
    }

    public int getCount() {
        return count;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return id + " " +
                name + " " +
                rawResult + " " +
                bonusToString + " " +
                finalResult + " " +
                rank;
    }
}
