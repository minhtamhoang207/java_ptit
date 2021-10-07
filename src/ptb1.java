import java.text.DecimalFormat;
import java.util.Scanner;

public class ptb1 {
    public static void main(String[] args) {
        int aNumber, bNumber;
        double nghiem;
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        Scanner scanner = new Scanner(System.in);

        aNumber = scanner.nextInt();
        bNumber = scanner.nextInt();
        if (aNumber == 0) {
            if (bNumber == 0) {
                System.out.println("VSN");
            } else {
                System.out.println("VN");
            }
        } else {
            nghiem = (double) -bNumber / aNumber;
            System.out.println(decimalFormat.format(nghiem));
        }
    }
}
