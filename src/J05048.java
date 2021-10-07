import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class J05048 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Cargo> cargos = new ArrayList<>();
        int n = sc.nextInt();
        sc.nextLine();
        while(n-- > 0 ){
            String id = sc.nextLine();
            long amount = Long.parseLong(sc.nextLine());
            cargos.add(new Cargo(id, amount));
        }
        String key = sc.nextLine();
        cargos.sort(Comparator.comparing(Cargo::getTax).reversed());
        for(Cargo i : cargos){
            if(i.id.startsWith(key)){
                System.out.println(i);
            }
        }
    }
}

class Cargo{
    String id;
    long amount;
    long exportAmount;
    long price;
    long cost;
    long tax;

    public Cargo(String id, long amount) {
        this.id = id;
        this.amount = amount;
        this.exportAmount = exportAmount();
        this.price = price();
        this.cost = cost();
        this.tax = tax();
    }

    long exportAmount(){
        if(id.startsWith("A")){
            return Math.round((double)(amount * 60)/100);
        } else {
            return Math.round((double)(amount * 70)/100);
        }
    }

    long price(){
        if(id.endsWith("Y")){
            return 110000;
        } else{
            return 135000;
        }
    }

    long cost(){
        return exportAmount * price;
    }

    long tax(){
        if(id.startsWith("A")){
            if(id.endsWith("Y")){
                return Math.round((double) (cost * 8)/100);
            } else{
                return Math.round((double) (cost * 11)/100);
            }
        } else{
            if(id.endsWith("Y")){
                return Math.round((double) (cost * 17)/100);
            } else{
                return Math.round((double) (cost * 22)/100);
            }
        }
    }

    public long getTax() {
        return tax;
    }

    @Override
    public String toString() {
        return id + " " +
                amount + " " +
                exportAmount + " " +
                price + " " +
                cost + " " +
                tax;
    }
}
