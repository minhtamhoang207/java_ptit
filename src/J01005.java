import java.util.Scanner;


public class J01005 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        for(int i = 1; i <= test; i++){
            int n = in.nextInt();
            double h = in.nextDouble();
            for(int j = 1; j <= n-1; j++){
                System.out.format("%.6f", h*Math.sqrt((double)j/n));
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}