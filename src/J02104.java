import java.util.Scanner;

public class J02104 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int i = 1;
        while(i <= n){
            int j = 1;
            while(j <= n){
                int tmp = in.nextInt();
                if(j > i && tmp == 1) System.out.println("(" + i + "," + j + ")");
                j++;
            }
            i++;
        }
    }
}

