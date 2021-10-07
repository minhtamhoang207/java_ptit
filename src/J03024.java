import java.util.Scanner;

public class J03024 {
    static int check (String str){
        if(str.startsWith("0"))
            return -1;
        int chan = 0;
        int le = 0;
        for(int i=0; i<str.length(); i++){
            if(!Character.isDigit(str.charAt(i))){
                return -1;
            } else{
                if((int)str.charAt(i) % 2 ==0){
                    chan++;
                } else{
                    le++;
                }
            }
        }
        if((str.length() % 2 == 0 && chan > le) || (str.length() % 2 != 0 && le > chan)){
            return 1;
        } else{
            return 0;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        sc.nextLine();
        while (test-->0){
            String num = sc.nextLine();
            if(check(num)==-1){
                System.out.println("INVALID");
            } else if(check(num)==0){
                System.out.println("NO");
            } else{
                System.out.println("YES");
            }
        }
    }
}
