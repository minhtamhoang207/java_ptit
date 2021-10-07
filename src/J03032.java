import java.util.Scanner;

public class J03032 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        sc.nextLine();
        while (test-->0){
            String n = sc.nextLine();
            String[] temp = n.split("\\s+");
            for(int i=0; i<temp.length; i++){
                StringBuilder input1 = new StringBuilder(temp[i]);
                System.out.print(input1.reverse() + " ");
            }
            System.out.println();
        }
    }
}
