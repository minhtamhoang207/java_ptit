package J05081;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        sc.nextLine();
        int num = 1;
        ArrayList<Goods> goods = new ArrayList<>();
        while (test-->0){
            String name = sc.nextLine();
            String unit = sc.nextLine();
            long sellPrice = Long.parseLong(sc.nextLine());
            long buyPrice = Long.parseLong(sc.nextLine());
            goods.add(new Goods(num, name, unit, sellPrice, buyPrice));
            num++;
        }
        goods.sort(Comparator.comparing(Goods::getProfit).reversed()
                .thenComparing(Goods::getId));

        for(Goods g : goods){
            System.out.println(g);
        }

    }
}

class Goods{
    String id;
    String name;
    String unit;
    long sellPrice;
    long buyPrice;
    long profit;

    public Goods(int num, String name, String unit, long sellPrice, long buyPrice) {
        this.id = num<10?"MH00"+num:num<100?"MH0"+num:"MH"+num;
        this.name = name;
        this.unit = unit;
        this.sellPrice = sellPrice;
        this.buyPrice = buyPrice;
        this.profit = buyPrice-sellPrice;
    }

    public long getProfit() {
        return profit;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return id + " " +
                name + " " +
                unit + " " +
                sellPrice + " " +
                buyPrice + " " +
                profit;
    }
}
