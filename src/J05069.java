import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;

public class J05069 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int clubCount = sc.nextInt();
        HashMap<String, Club> clubs = new HashMap<>();
        sc.nextLine();
        while (clubCount-->0){
            String id = sc.nextLine();
            String name = sc.nextLine();
            long ticketPrice = Long.parseLong(sc.nextLine());
            clubs.put(id, new Club(id,name,ticketPrice));
        }

        int matchCount = Integer.parseInt(sc.nextLine());
        ArrayList<Match> matches = new ArrayList<>();
        while (matchCount-->0){
            String temp = sc.nextLine();
            String[] data = temp.split(" ");
            String key = data[0].substring(1,3);
            Match match = new Match(data[0], Long.parseLong(data[1]), clubs.get(key));
            matches.add(match);
        }

        matches.sort(Comparator.comparing(Match::income).reversed()
        .thenComparing(i -> i.club.name));

        for(Match m : matches){
            System.out.println(m);
        }
    }
}
class Club{
    String id;
    String name;
    long ticketPrice;

    public Club(String id, String name, long ticketPrice) {
        this.id = id;
        this.name = name;
        this.ticketPrice = ticketPrice;
    }
}

class Match{
    String id;
    long amount;
    String clubId;
    Club club;
    long income;

    public Match(String id, long amount, Club club) {
        this.id = id;
        this.amount = amount;
        this.clubId = clubId();
        this.club = club;
        this.income = income();
    }

    String clubId(){
        return id.substring(1,3);
    }

    long income(){
        return amount*club.ticketPrice;
    }

    @Override
    public String toString() {
        return id + " " +
                club.name + " " +
                income;
    }
}
