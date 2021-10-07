import java.util.Scanner;

public class J03017 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        in.nextLine();
        while(t-->0){
            String n = in.nextLine();
            int x = 0;
            while(true){
                if(n.contains("100")){
                    n = n.replaceFirst("100", "");
                    x += 3;
                } else{
                    break;
                }
            }
            System.out.println(x);
        }
    }
}
