import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;

public class J05046 {
    static HashMap<String, Integer> map = new HashMap<>();
    public static String genId(String name){
        String[] arr = name.split(" ");
        String key = (arr[0].charAt(0) + String.valueOf(arr[1].charAt(0))).toUpperCase();
        if(map.containsKey(key)){
            map.put(key, map.get(key) + 1);
        } else{
            map.put(key, 1);
        }
        return key + "0" + map.get(key);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Goods> goods = new ArrayList<>();
        int test = sc.nextInt();
        sc.nextLine();
        while(test-- > 0){
            String name = sc.nextLine();
            long amount = Long.parseLong(sc.nextLine());
            long price = Long.parseLong(sc.nextLine());
            String id = genId(name);
            goods.add(new Goods(id, name, amount, price));
        }

        goods.sort(Comparator.comparing(Goods::getDiscount).reversed());
        for(Goods g: goods){
            System.out.println(g);
        }
    }
}

class Goods{
    String name;
    long amount;
    long price;
    long discount;
    String id;
    long cost;

    public Goods(String id, String name, long amount, long price) {
        this.name = name;
        this.amount = amount;
        this.price = price;
        this.discount = discount();
        this.id = id;
        this.cost = cost();
    }

    public long getDiscount() {
        return discount;
    }

    public long discount(){
        double temp = 0;
        if(amount > 10){
            temp = (double) 5/100;
        } else if(amount >= 8 && amount <=10){
            temp = (double) 2/100;
        } else if(amount >= 5 && amount <8){
            temp = (double) 1/100;
        } else{
            temp = 0;
        }

        return (int) (price * amount * temp);
    }

    public long cost(){
        return amount * price -discount;
    }

    @Override
    public String toString() {
        return id + " " +
                name + " " +
                discount + " " +
                cost;
    }
}
