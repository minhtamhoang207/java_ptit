package J05010;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Device> devices = new ArrayList<>();
        int test = sc.nextInt();
        sc.nextLine();
        int count = 1;
        while (test-->0){
            String name = sc.nextLine();
            String type = sc.nextLine();
            double in = Double.parseDouble(sc.nextLine());
            double out =  Double.parseDouble(sc.nextLine());
            devices.add(new Device(name, type, count, in, out));
            count++;
        }
        devices.sort(Comparator.comparing(Device::getGet).reversed());
        for(Device d : devices){
            System.out.println(d);
        }
    }
}
class Device{
    String name;
    String type;
    int count;
    double in;
    double out;
    double get;

    public Device(String name, String type, int count, double in, double out) {
        this.name = name;
        this.type = type;
        this.count = count;
        this.in = in;
        this.out = out;
        this.get = out-in;
    }

    public double getGet() {
        return get;
    }

    @Override
    public String toString() {
        return count + " " +
                name + " " +
                type + " " +
                String.format("%.2f",get);
    }
}
