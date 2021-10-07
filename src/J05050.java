import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class J05050 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<EnergyConsumption> energyConsumptions = new ArrayList<>();
        int test = sc.nextInt();
        int count = 1;
        sc.nextLine();
        while(test-- > 0){
            String type = sc.nextLine();
            long oldNum = Long.parseLong(sc.nextLine());
            long newNum = Long.parseLong(sc.nextLine());
            energyConsumptions.add(new EnergyConsumption(count, type, oldNum, newNum ));
            count++;
        }
        energyConsumptions.sort(Comparator.comparing(EnergyConsumption::getTotalCost).reversed());
        for(EnergyConsumption e : energyConsumptions){
            System.out.println(e);
        }
    }
}
class EnergyConsumption{
    String type;
    long oldNumber;
    long newNumber;
    String id;
    long coefficient;
    long price;
    long additional;
    long totalCost;
    long count;

    public EnergyConsumption(long count, String type, long oldNumber, long newNumber) {
        this.type = type;
        this.oldNumber = oldNumber;
        this.newNumber = newNumber;
        this.count = count;
        this.id = getId();
        this.coefficient = getCoefficient();
        this.price = getPrice();
        this.additional = getAdditional();
        this.totalCost = getTotalCost();
    }

    public String getId() {
        if(count < 10){
            return "KH0" + count;
        } else{
            return "KH" + count;
        }
    }

    public long getCoefficient() {
        switch (type){
            case "KD":
                return 3;
            case "NN":
                return 5;
            case "TT":
                return 4;
            case "CN":
                return 2;
            default:
                return 0;
        }
    }

    public long getPrice() {
        return (newNumber - oldNumber) * coefficient * 550;
    }

    public long getAdditional() {
        long num = newNumber - oldNumber;
        if(num < 50){
            return 0;
        } else if(num <= 100){
            return Math.round((double)(price*35)/100);
        } else{
            return price;
        }
    }

    public long getTotalCost() {
        return price + additional;
    }

    @Override
    public String toString() {
        return id + " " +
                coefficient + " " +
                price + " " +
                additional + " " +
                totalCost;
    }
}
