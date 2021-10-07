//import java.util.ArrayList;
//import java.util.Comparator;
//import java.util.Scanner;
//
//public class J05052 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        ArrayList<Clothes> clothes = new ArrayList<>();
//        int test = sc.nextInt();
//        sc.nextLine();
//        while(test-- > 0){
//            String name =sc.nextLine();
//            String id = sc.nextLine();
//            long price = Long.parseLong(sc.nextLine());
//            long amount = Long.parseLong(sc.nextLine());
//            clothes.add(new Clothes(name, id, price, amount));
//        }
//        clothes.sort(Comparator.comparing(Clothes::getIntNum));
//        for(Clothes c : clothes){
//            System.out.println(c);
//        }
//    }
//}
//
//class Clothes{
//    String name;
//    String id;
//    long price;
//    long amount;
//    String num;
//    long discount;
//    long totalCost;
//
//    public Clothes(String name, String id, long price, long amount) {
//        this.name = name;
//        this.id = id;
//        this.price = price;
//        this.amount = amount;
//        this.num = getNum();
//        this.discount = getDiscount();
//        this.totalCost = getTotalCost();
//    }
//
//    public String getNum() {
//        return id.substring(1, 4);
//    }
//
//    public long getIntNum(){
//        return Integer.parseInt(id.substring(1, 4));
//    }
//    public long getDiscount() {
//        if(id.endsWith("2")){
//            return Math.round(((double)(price * amount * 30)/100));
//        } else{
//            return Math.round(((double)(price * amount * 50)/100));
//        }
//    }
//
//    public long getTotalCost() {
//        return amount * price - discount;
//    }
//
//    @Override
//    public String toString() {
//        return name + " " +
//                id + " " +
//                num + " " +
//                discount + " " +
//                totalCost;
//    }
//}
