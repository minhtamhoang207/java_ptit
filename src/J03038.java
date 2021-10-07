import java.util.HashMap;
import java.util.Scanner;

public class J03038 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        HashMap<Character, String> map = new HashMap<>();
        for(int i=0; i<n.length(); i++){
            if(!map.containsKey(n.charAt(i))){
                map.put(n.charAt(i), "=))");
            }
        }
        System.out.println(map.size());
    }
}
