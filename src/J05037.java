import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class J05037 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Food2> food2s = new ArrayList<>();
        int test = sc.nextInt();
        int count = 1;
        sc.nextLine();
        while(test-- > 0){
            String name = sc.nextLine();
            String unit = sc.nextLine();
            long entryPrice = Long.parseLong(sc.nextLine());
            long amount = Long.parseLong(sc.nextLine());
            food2s.add(new Food2(count, name, unit, entryPrice, amount));
            count++;
        }
        food2s.sort(Comparator.comparing(Food2::getExitPrice).reversed());
        for(Food2 f : food2s){
            System.out.println(f);
        }
    }
}

class Food2{
    String name;
    String unit;
    long entryPrice;
    long amount;
    long shippingFee;
    long price;
    long exitPrice;
    String id;
    int count;

    public Food2(int count, String name, String unit, long entryPrice, long amount) {
        this.name = name;
        this.unit = unit;
        this.entryPrice = entryPrice;
        this.amount = amount;
        this.count = count;
        this.shippingFee = getShippingFee();
        this.price = getPrice();
        this.exitPrice = getExitPrice();
        this.id = genId();
    }

    public long getShippingFee() {
        return Math.round((double)(entryPrice * amount * 5)/100);
    }

    public long getPrice() {
        return Math.round(entryPrice*amount+shippingFee);
    }

    public long getExitPrice() {
        return (long)Math.ceil((double)((price + Math.round((double)(price*2)/100))/amount)/100)*100;
    }


    String genId(){
        if(count<10){
            return "MH0" + count;
        } else {
            return  "MH" + count;
        }
    }
    @Override
    public String toString() {
        return id + " " +
                name + " " +
                unit + " " +
                shippingFee + " " +
                price + " " +
                exitPrice;
    }
}
