import java.util.Scanner;

public class J03006 {

    static boolean check(String s){
        for (int i = 0; i < s.length(); i++){
            if (Character.getNumericValue(s.charAt(i)) % 2 != 0){
                return false;
            }
        }
        for (int i = 0; i < s.length()/2; i++){
            if(s.charAt(i) != s.charAt(s.length()-i-1)){
                return false;
            }
        }
        return true;
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
