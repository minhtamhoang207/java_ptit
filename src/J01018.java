import java.util.Scanner;

public class J01018 {
    static boolean check(String n){
        for (int i = 0; i < n.length()-1; i++) {
            int n1 = Integer.parseInt(String.valueOf(n.charAt(i)));
            int n2 = Integer.parseInt(String.valueOf(n.charAt(i+1)));
            if(n1 != n2+2 && n1 != n2-2){
                return false;
            }
        }
        return true;
    }
    static boolean checkSum(String n){
        int sum =0;
        for (int i = 0; i < n.length(); i++) {
            sum+=Integer.parseInt(String.valueOf(n.charAt(i)));
        }
        return sum % 10 == 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        sc.nextLine();
        while (test-->0){
            String n = sc.nextLine();
            if(check(n)&&checkSum(n)){
                System.out.println("YES");
            } else{
                System.out.println("NO");
            }
        }
    }
}
