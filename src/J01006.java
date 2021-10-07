import java.util.Scanner;

public class J01006 {
    static long Fibonacci(long n)
    {
        long a1 = 1, a2 = 1;
        if (n == 1 || n == 2)
            return 1;
        long i = 3, a = 0;
        while (i <= n)
        {
            a = a1 + a2;
            a1 = a2;
            a2 = a;
            i++;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test>0){
            long n = sc.nextInt();
            System.out.println(Fibonacci(n));
            test--;
        }

    }
}
