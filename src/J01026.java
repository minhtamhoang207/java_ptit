import java.util.Scanner;

public class J01026 {
    static boolean isPerfectSquare(int x) {
        if (x >= 0) {
            int sr = (int)Math.sqrt(x);
            return ((sr * sr) == x);
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while (test-->0){
            int n = sc.nextInt();
            if (isPerfectSquare(n))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
