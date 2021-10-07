import java.util.ArrayList;
import java.util.Scanner;

public class J05036 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Food> foods = new ArrayList<>();
        int test = sc.nextInt();
        int count = 1;
        sc.nextLine();
        while(test-- > 0){
            String name = sc.nextLine();
            String unit = sc.nextLine();
            long entryPrice = Long.parseLong(sc.nextLine());
            long amount = Long.parseLong(sc.nextLine());
            foods.add(new Food(count, name, unit, entryPrice, amount));
            count++;
        }
        for(Food f : foods){
            System.out.println(f);
        }
    }
}

class Food{
    String name;
    String unit;
    long entryPrice;
    long amount;
    long shippingFee;
    long price;
    long exitPrice;
    String id;
    int count;

    public Food(int count, String name, String unit, long entryPrice, long amount) {
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
        return price + Math.round((double)(price*2)/100);
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
