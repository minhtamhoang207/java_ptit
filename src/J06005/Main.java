package J06005;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int customerLength = sc.nextInt();
        sc.nextLine();
        int countCustomer = 1;
        ArrayList<Customer> customers = new ArrayList<>();
        while (customerLength-->0){
            customers.add(new Customer(
                    countCustomer,
                    sc.nextLine(),
                    sc.nextLine(),
                    sc.nextLine(),
                    sc.nextLine()
            ));
            countCustomer++;
        }

        int goodsLength = sc.nextInt();
        sc.nextLine();
        int goodsCount = 1;
        ArrayList<Goods> goods = new ArrayList<>();
        while (goodsLength-->0){
            goods.add(new Goods(
                    goodsCount,
                    sc.nextLine(),
                    sc.nextLine(),
                    Integer.parseInt(sc.nextLine()),
                    Integer.parseInt(sc.nextLine())
            ));
            goodsCount++;
        }

        int billLength = sc.nextInt();
        sc.nextLine();
        int billCount = 1;
        ArrayList<Bill> bills = new ArrayList<>();
        while (billLength-->0){
            String bill = sc.nextLine();
            String[] data = bill.split("\\s+");
            Customer customer = Customer.getCustomerById(customers, data[0]);
            Goods goods1 = Goods.getGoodsById(goods, data[1]);
            int amount = Integer.parseInt(data[2]);
            bills.add(new Bill(
                    billCount,
                    data[0],
                    data[1],
                    amount,
                    customer,
                    goods1
            ));
            billCount++;
        }

        bills.sort(Comparator.comparing(Bill::profit).reversed());
        for(Bill bill: bills){
            System.out.println(bill);
        }

    }
}
class Customer{
    int count;
    String name;
    String gender;
    String dob;
    String address;
    String customerId;

    public Customer(int count, String name, String gender, String dob, String address) {
        this.count = count;
        this.name = name;
        this.gender = gender;
        this.dob = dob;
        this.address = address;
        this.customerId = count<10?"KH00"+count:count<100?"KH0"+count:"KH"+count;
    }

    static Customer getCustomerById(ArrayList<Customer> customerArrayList, String id){
        for(Customer customer : customerArrayList){
            if(customer.customerId.equals(id)){
                return customer;
            }
        }
        return null;
    }
}

class Goods{
    int count;
    String goodsName;
    String unit;
    int buyPrice;
    int sellPrice;
    String goodsId;

    public Goods(int count, String goodsName, String unit, int buyPrice, int sellPrice) {
        this.count = count;
        this.goodsName = goodsName;
        this.unit = unit;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
        this.goodsId = count<10?"MH00"+count:count<100?"MH0"+count:"MH"+count;
    }

    static Goods getGoodsById(ArrayList<Goods> goodsArrayList, String id){
        for(Goods goods : goodsArrayList){
            if(goods.goodsId.equals(id)){
                return goods;
            }
        }
        return null;
    }
}

class Bill{
    int count;
    String billId;
    String customerId;
    String goodsId;
    int amount;
    Customer customer;
    Goods goods;
    int price;
    int profit;


    public Bill(int count, String customerId, String goodsId, int amount, Customer customer, Goods goods) {
        this.count = count;
        this.billId = count<10?"HD00"+count:count<100?"HD0"+count:"HD"+count;
        this.customerId = customerId;
        this.goodsId = goodsId;
        this.amount = amount;
        this.customer = customer;
        this.goods = goods;
        this.price = price();
        this.profit = profit();
    }

    int price(){
        return goods.sellPrice*amount;
    }

    int profit(){
        return price - (amount*goods.buyPrice);
    }

    @Override
    public String toString() {
        return billId + " " +
                customer.name + " " +
                customer.address + " " +
                goods.goodsName + " " +
                amount + " " +
                price + " " +
                profit;
    }
}
