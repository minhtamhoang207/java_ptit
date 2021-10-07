import java. util.*;

public class J01009{
    static long giaiThua(int n) {
        if (n == 1)
            return 1;
        return n * giaiThua(n - 1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in) ;
        int n;
        n=sc.nextInt();
        long sum = 0;
        for(int i=1;i<=n;i++) {
            sum+=giaiThua(i);
        }
        System.out.println(sum);

    }

}