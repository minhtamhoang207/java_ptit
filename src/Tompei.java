import java.util.Scanner;

public class Tompei {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            long k = sc.nextLong();
            long[] a = new long[95];
            a[1] = 1;
            a[2] = 1;
            for(int i = 3; i <= 93; i++){
                a[i] = a[i-2] + a[i-1];
            }
            while(n > 2){
                if (k > a[n-2]){
                    k-=a[n-2];
                    n-=1;
                }else{
                    n-=2;
                }
            }
            if(n == 1){
                System.out.println(0);
            }else if(n == 2){
                System.out.println(1);
            }
        }
    }
}