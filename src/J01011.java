import java.util.Scanner;

public class J01011 {
    static long gcd(long a, long b) {
        while (b != 0) {
            long t = a;
            a = b;
            b = t % b;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long test = sc.nextInt();
        while(test>0){
            long a = sc.nextInt();
            long b = sc.nextInt();
            System.out.println((a*b/(gcd(a,b))) + " " + gcd(a,b));
            test--;
        }
    }
}
