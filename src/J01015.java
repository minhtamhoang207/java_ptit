import java.util.Scanner;

public class J01015 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        sc.nextLine();
        while (test-->0){
            boolean flag = false;
            String n = sc.nextLine();
            for(int i=0; i<n.length(); i++){
                if(!"012".contains(String.valueOf(n.charAt(i)))){
                    System.out.println("NO");
                    flag = true;
                    break;
                }
            }
            if(!flag) System.out.println("YES");
        }
    }
}
