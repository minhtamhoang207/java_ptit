package J05017;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Bill> bills = new ArrayList<>();
        int test = sc.nextInt();
        int count = 1;
        sc.nextLine();
        while (test-->0){
            String name = sc.nextLine();
            int oldNum = Integer.parseInt(sc.nextLine());
            int newNum = Integer.parseInt(sc.nextLine());
            bills.add(new Bill(count, name, oldNum, newNum));
            count++;
        }

        bills.sort(Comparator.comparing(Bill::getTotalCost).reversed());
        for(Bill b : bills){
            System.out.println(b);
        }
    }
}

class Bill{
    int count;
    String name;
    int oldNum;
    int newNum;
    String id;
    double totalCost;

    public Bill(int count, String name, int oldNum, int newNum) {
        this.count = count;
        this.name = name;
        this.oldNum = oldNum;
        this.newNum = newNum;
        this.id = count<10? "KH0"+count:"KH"+count;
        this.totalCost = gAmount();
    }

    public double getTotalCost() {
        return totalCost;
    }

    public double gAmount() {
        double numUsed = (double) newNum - oldNum;

        if (numUsed > 100) {
            double money = (numUsed - 100) * 200 + 50 * 150 + 50 * 100;
            return money + money * 0.05;
        } else if (numUsed > 50) {
            double money = (numUsed - 50) * 150 + 50 * 100;
            return money + money * 0.03;
        } else {
            double money = numUsed * 100;
            return money + money * 0.02;
        }
    }

    @Override
    public String toString() {
        return id + " " +
                name + " " +
                String.format("%.0f", totalCost);
    }
}
