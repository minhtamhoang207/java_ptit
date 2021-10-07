import java.util.Scanner;

public class J03027 {
    static String s;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        s = in.nextLine();
        s = solve();
        if(s.isEmpty()) System.out.println("Empty String");
        else System.out.println(s);
    }
    public static String solve(){
        int i = 0;
        while(i < s.length()-1){
            if(s.charAt(i) == s.charAt(i+1)){
                s = s.replaceAll(s.substring(i, i+2), "");
                if(i == 0) i = 0;
                else i = i-1;
            }
            else i++;
        }
        return s;
    }
}

