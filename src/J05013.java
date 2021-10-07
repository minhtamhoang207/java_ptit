import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class J05013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Candidate> candidates = new ArrayList<>();
        int test = sc.nextInt();
        int count = 1;
        sc.nextLine();
        while(test-->0){
            String name = sc.nextLine();
            String theoPoint = sc.nextLine();
            String actPoint = sc.nextLine();
            candidates.add(new Candidate(
                    count,
                    name,
                    Double.parseDouble(theoPoint)>10?
                            Integer.parseInt(theoPoint)/(double)10:Double.parseDouble(theoPoint),
                    Double.parseDouble(actPoint)>10?
                            Integer.parseInt(actPoint)/(double)10:Double.parseDouble(actPoint)
            ));
            count++;
        }
        candidates.sort(Comparator.comparing(Candidate::getFinalPoint).reversed());
        for(Candidate c : candidates){
            System.out.println(c);
        }

    }
}

class Candidate{
    String id;
    int count;
    String name;
    double theoPoint;
    double actPoint;
    double finalPoint;
    String rate;

    public Candidate(int count, String name, double theoPoint, double actPoint) {
        this.count = count;
        this.name = name;
        this.theoPoint = theoPoint;
        this.actPoint = actPoint;
        this.id = getId();
        this.finalPoint = getFinalPoint();
        this.rate = getRate();
    }

    public String getId() {
        return count<10? "TS0" + count:"TS" + count;
    }

    public double getFinalPoint() {
        return (theoPoint+actPoint)/2;
    }

    public String getRate() {
        if(finalPoint>9.5){
            return "XUAT SAC";
        } else if( finalPoint >=8){
            return "DAT";
        } else if( finalPoint >= 5){
            return "CAN NHAC";
        } else{
            return "TRUOT";
        }
    }

    @Override
    public String toString() {
        return id + " " +
                name + " " +
                String.format("%.2f", finalPoint) + " " +
                rate + " ";
    }
}
