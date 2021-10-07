import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class J03010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        Map<String, Integer> map = new HashMap<String, Integer>();
        sc.nextLine();
        while(t>0){
            String str = sc.nextLine();
            String[] a = str.trim().split("\\s+");
            String mail = a[a.length-1].toLowerCase();
            for(int i=0; i<a.length-1; i++){
                mail += a[i].substring(0,1).toLowerCase();
            }

            if(!map.containsKey(mail)){
                map.put(mail, 1);
                System.out.println(mail+"@ptit.edu.vn");
            } else{
                map.put(mail, map.get(mail) + 1);
                System.out.println(mail+map.get(mail)+"@ptit.edu.vn");
            }
            t--;
        }

    }
}
