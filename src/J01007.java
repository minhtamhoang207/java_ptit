import java.util.Scanner;

public class J01007 {
    public static boolean isPerfectSquare(int x) {
        int s = (int) Math.sqrt(x);
        return (s*s == x);
    }

    public static boolean isFibonacci(int n) {
        return isPerfectSquare(5*n*n + 4) || isPerfectSquare(5*n*n - 4);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test>0){
            int i = sc.nextInt();
            if(isFibonacci(i)){
                System.out.println("YES");
            } else{
                System.out.println("NO");
            }
            test--;
        }
    }
}
