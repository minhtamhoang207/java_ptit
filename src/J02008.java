import java.util.Scanner;

public class J02008 {
    static long hcf(long a, long b)
    {
        if (b == 0)
            return a;
        return hcf(b, a % b);
    }

    static long findlcm(long a,long b)
    {
        if (b == 1)
            return a;
        a = (a * b) / hcf(a, b);
        b -= 1;
        return findlcm(a, b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long test = sc.nextInt();
        while(test>0){
            long n = sc.nextInt();
            if (n < 3)
                System.out.print(n); // base case
            else
                System.out.print(findlcm(n, n - 1));
            test--;
        }
    }
}
