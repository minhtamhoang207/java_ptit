import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class J05012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Bill> bills = new ArrayList<>();
        int n = sc.nextInt();
        sc.nextLine();
        while(n>0){
            String id, name, amount, price, discount;
            id = sc.nextLine();
            name = sc.nextLine();
            amount = sc.nextLine();
            price = sc.nextLine();
            discount = sc.nextLine();
            bills.add(new Bill(id, name, amount, price, discount));
            n--;
        }
        bills.sort(Comparator.comparing(Bill::getFinalCost).reversed());
        for(Bill bill: bills){
            System.out.println(bill);
        }
    }
}

class Bill{

    String id;
    String name;
    String amount;
    String price;
    String discount;
    BigInteger finalCost;

    public Bill(String id, String name, String amount, String price, String discount) {
        this.id = id;
        this.name = name;
        this.amount = amount;
        this.price = price;
        this.discount = discount;
        this.finalCost = new BigInteger(finalCost());
    }

    public BigInteger getFinalCost() {
        return finalCost;
    }

    private String finalCost(){
        BigInteger a = new BigInteger(price);
        BigInteger b = new BigInteger(amount);
        BigInteger c = new BigInteger(discount);
        BigInteger withOutDiscount =  a.multiply(b);
        return withOutDiscount.subtract(c).toString();
    }

    @Override
    public String toString() {
        return id + " " +
                name + " " +
                amount + " " +
                price + " " +
                discount + " " +
                finalCost() + " ";
    }
}
