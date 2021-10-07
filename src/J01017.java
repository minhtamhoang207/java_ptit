import java.util.Scanner;

public class J01017 {
    static boolean check(String n){
        for (int i = 0; i < n.length()-1; i++) {
            int n1 = Integer.parseInt(String.valueOf(n.charAt(i)));
            int n2 = Integer.parseInt(String.valueOf(n.charAt(i+1)));
            if(n1 != n2+1 && n1 != n2-1){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        sc.nextLine();
        while (test-->0){
            String n = sc.nextLine();
            System.out.println(check(n)?"YES":"NO");
        }
    }
}
