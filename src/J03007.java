import java.util.Scanner;

public class J03007 {

    static boolean check(String s){
        if(s.charAt(0) != '8') return false;
        int sum = 0;
        for (int i = 0; i < s.length()/2; i++){
            if(s.charAt(i) != s.charAt(s.length()-i-1)){
                return false;
            }
        }
        for (int i = 0; i < s.length(); i++){
            sum+=Character.getNumericValue(s.charAt(i));
        }
        if (sum % 10 == 0) return true;
        else return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t > 0){
            t--;
            String b = sc.nextLine();
            if (check(b)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
