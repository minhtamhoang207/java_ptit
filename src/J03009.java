import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class J03009 {
    static Scanner input = new Scanner(System.in);
    static String s1,s2;
    public static void main(String[] args) {
        int test = input.nextInt();
        input.nextLine();
        for(int i = 1; i <= test; i++){
            s1 = input.nextLine();
            s2 = input.nextLine();
            solve();
        }
    }
    public static void solve(){
        String[] arr1 = s1.split("\\s");
        String[] arr2 = s2.split("\\s");
        Vector <String> res = new Vector<>();
        for(String s : arr1){
            boolean mark = true;
            for(String tmp : arr2){
                if(s.compareTo(tmp) == 0) {
                    mark = false;
                    break;
                }
            }
            if(mark && !res.contains(s)) res.add(s);
        }
        Collections.sort(res);
        for(String s : res){
            System.out.print(s + " ");
        }
        System.out.println();
    }
}

