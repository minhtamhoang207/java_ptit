import java.util.Scanner;

public class sodep1 {
    static boolean thuannghich(String n){
        for(int i=0; i<n.length()/2; i++){
            if(n.charAt(i) != n.charAt(n.length()-1-i)){
                return false;
            }
        }
        return true;
    }
    static  boolean chiam(String n){
        int sum = 0;
        for(int i=0; i<n.length(); i++){
            int a = Character.getNumericValue(n.charAt(i));
            sum+=a;
        }
        return sum % 10 == 0;
    }
    public static void main(String[] args) {
        PhanSo p = new PhanSo(1,1);
        System.out.println(p);

//        Scanner sc = new Scanner(System.in);
//        int test = sc.nextInt();
//        String temp = sc.nextLine();
//        while(test>0){
//            String n = sc.nextLine();
//            if(chiam(n) && thuannghich(n)){
//                System.out.println("YES");
//            } else {
//                System.out.println("NO");
//            }
//
//            test--;
//        }
    }
}

