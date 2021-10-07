import java.util.Scanner;

public class J03026 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        in.nextLine();
        String s1, s2;
        for(int i = 1; i <= test; i++){
            s1 = in.nextLine();
            s2 = in.nextLine();
            if(s1.compareTo(s2) != 0){
                int res = Math.max(s1.length(), s2.length());
                System.out.println(res);
            }
            else{
                System.out.println(-1);
            }
        }
    }
}
