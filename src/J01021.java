import java.util.Scanner;

public class J01021 {

    static long power(long x, long y, long p){
        if (y == 0) return 1;
        if (y == 1) return x;
        if (y % 2 == 0) return power(x*x%p,y/2,p)%p;
        else return x * power(x*x%p,y/2,p)%p;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            long a = sc.nextLong();
            long b = sc.nextLong();
            if(a == 0 && b == 0) break;
            else{
                long ans = power(a, b, 1000000007);
                System.out.println(ans);
            }
        }
    }
}