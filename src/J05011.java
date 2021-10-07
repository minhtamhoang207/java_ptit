import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class J05011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Player> player = new ArrayList<>();
        int n = sc.nextInt();
        String temp = sc.nextLine();
        while (n>0){
            String id, name, in, out;
            id = sc.nextLine();
            name = sc.nextLine();
            in = sc.nextLine();
            out = sc.nextLine();
            player.add(new Player(id, name, in, out));
            n--;
        }

        player.sort(Comparator.comparing(Player::getTimeInMinute).reversed());

        for(Player p: player){
            System.out.println(p);
        }
    }
}

class Player{
    String id;
    String name;
    String in;
    String out;
    int timeInMinute;

    public int getTimeInMinute() {
        return timeInMinute;
    }

    public Player(String id, String name, String in, String out) {
        this.id = id;
        this.name = name;
        this.in = in;
        this.out = out;
        this.timeInMinute = timeInMinute();
    }

    private int timeInMinute(){
        int hourIn = Integer.parseInt(in.split(":")[0]);
        int minuteIn = Integer.parseInt(in.split(":")[1]);

        int hourOut = Integer.parseInt(out.split(":")[0]);
        int minuteOut = Integer.parseInt(out.split(":")[1]);
        return (hourOut*60 + minuteOut) - (hourIn*60 + minuteIn);
    }

    private String result(){
        String hour = Integer.toString(timeInMinute()/60);
        String minute = Integer.toString(timeInMinute()%60);
        return hour + " gio " + minute + " phut";
    }

    @Override
    public String toString(){
        return id + " " +
                name + " " +
                result();
    }

}
