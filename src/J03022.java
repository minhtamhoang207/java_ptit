import java.util.Scanner;

public class J03022 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "";
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            s+= line;
            if (line.isEmpty()) {
                break;
            }
        }
        String[] a = s.split("[.?!]");
        for(String b:a) {
            String[] temp = b.toLowerCase().trim().split("\\s+");
            for (int i = 0; i < temp.length; i++) {
                System.out.print(
                        i == 0 ?
                                temp[i].substring(0, 1).toUpperCase() + temp[i].substring(1) : temp[i]
                );
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
