import java.text.DecimalFormat;
import java.util.Scanner;

public class thisinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("0.0");
        String name = sc.nextLine();
        String date = sc.nextLine();
        float p1 = sc.nextFloat();
        float p2 = sc.nextFloat();
        float p3 = sc.nextFloat();
        String total = decimalFormat.format(p1+p2+p3);
        System.out.println(
                name + " " +
                        date + " " +
                        total

        );
    }
}
