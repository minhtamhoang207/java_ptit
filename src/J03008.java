import java.util.Scanner;

public class J03008 {
    static boolean isPrime(int n){
        if (n<2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++){
            if (n % i == 0) return false;
        }
        return true;
    }
    static boolean check(String s){
        for (int i = 0; i < s.length(); i++){
            if(!isPrime(Character.getNumericValue(s.charAt(i)))){
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
