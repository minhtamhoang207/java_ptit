import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class J06001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        sc.nextLine();
        ArrayList<Clothes> clothes = new ArrayList<>();
        while (test-->0){
            String id = sc.nextLine();
            String name = sc.nextLine();
            long type1 = Long.parseLong(sc.nextLine());
            long type2 = Long.parseLong(sc.nextLine());
            clothes.add(new Clothes(id, name, type1, type2));
        }

        int test2 = Integer.parseInt(sc.nextLine());
        int countBill = 1;
        ArrayList<ClothesBill> clothesBills = new ArrayList<>();
        while (test2-->0){
            String data = sc.nextLine();
            String[] temp = data.split(" ");
            String clothesId = temp[0].substring(0,2);
            for(Clothes c : clothes){
                if(c.id.equals(clothesId)){
                    ClothesBill clothesBill = new ClothesBill(
                            countBill, temp[0], Long.parseLong(temp[1]), c
                    );
                    clothesBills.add(clothesBill);
                }
            }
            countBill++;
        }

        clothesBills.sort(Comparator.comparing(ClothesBill::total).reversed());
        for(ClothesBill c : clothesBills){
            System.out.println(c);
        }
    }
}

class Clothes{
    String id;
    String name;
    long type1;
    long type2;

    public Clothes(String id, String name, long type1, long type2) {
        this.id = id;
        this.name = name;
        this.type1 = type1;
        this.type2 = type2;
    }
}

class ClothesBill{
    String id;
    long amount;
    Clothes clothes;
    long discount;
    long total;
    String billId;
    int type;

    public ClothesBill(int count, String id, long amount, Clothes clothes) {
        this.id = id;
        this.billId = count<10?id+"-"+"00"+count:count<100?id+"-"+"0"+count:id+"-"+count;
        this.amount = amount;
        this.clothes = clothes;
        this.type = type();
        this.discount = discount();
        this.total = total();
    }

    int type(){
        return Integer.parseInt(id.substring(2,3));
    }

    long discount(){
        if(type==1){
            if(amount>=150){
                return (long) ((amount*clothes.type1) * ((double) 50/100));
            } else if(amount>=100){
                return (long) ((amount*clothes.type1) * ((double) 30/100));
            } else if(amount>=50){
                return (long) ((amount*clothes.type1) * ((double) 15/100));
            } else{
                return 0;
            }
        } else{
            if(amount>=150){
                return (long) ((amount*clothes.type2) * ((double) 50/100));
            } else if(amount>=100){
                return (long) ((amount*clothes.type2) * ((double) 30/100));
            } else if(amount>=50){
                return (long) ((amount*clothes.type2) * ((double) 15/100));
            } else{
                return 0;
            }
        }
    }

    long total(){
        if(type == 1){
            return clothes.type1 * amount - discount;
        } else{
            return clothes.type2 * amount - discount;
        }
    }

    @Override
    public String toString() {
        return billId + " " +
                clothes.name + " " +
                discount + " " +
                total;
    }
}