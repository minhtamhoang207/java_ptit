import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class J05015 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<RacingBoy> racingBoys = new ArrayList<>();
        int test = sc.nextInt();
        sc.nextLine();
        while (test-->0){
            RacingBoy racingBoy = new RacingBoy(
                    sc.nextLine(),
                    sc.nextLine(),
                    sc.nextLine()
            );
            racingBoys.add(racingBoy);
        }

        racingBoys.sort(Comparator.comparing(RacingBoy::getSpeed2).reversed());
        for(RacingBoy r : racingBoys){
            System.out.println(r);
        }
    }
}

class RacingBoy{
    String name;
    String address;
    String finishTime;
    String id;
    int speed;

    public RacingBoy(String name, String address, String finishTime) {
        this.name = name;
        this.address = address;
        this.finishTime = finishTime;
        this.id = getId();
        this.speed = getSpeed();
    }

    public String getId() {
        String[] arr1 = address.split("\\s+");
        String firstPart = "";
        for (String s : arr1) {
            firstPart += s.charAt(0);
        }

        String[] arr2 = name.split(" ");
        String secondPart = "";
        for (String s : arr2) {
            secondPart += s.charAt(0);
        }
        return firstPart + secondPart;
    }

    public int getSpeed() {
        String[] arr1 = finishTime.split(":");
        double hour = Integer.parseInt(arr1[0]) - 6;
        double minute = (double) Integer.parseInt(arr1[1])/60;
        double timeToHour = hour + minute;
        return (int) Math.round(120/timeToHour);
    }

    public double getSpeed2() {
        String[] arr1 = finishTime.split(":");
        double hour = Integer.parseInt(arr1[0]) - 6;
        double minute = (double) Integer.parseInt(arr1[1])/60;
        double timeToHour = hour + minute;
        return (120/timeToHour);
    }

    @Override
    public String toString() {
        return id.toUpperCase() + " " +
                name + " " +
                address + " " +
                speed + " " + "Km/h";

    }
}
