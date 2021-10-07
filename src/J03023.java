import java.util.Hashtable;
import java.util.Scanner;

public class J03023 {
    public static int rtoi(String num) {
        Hashtable<Character, Integer> ht = new Hashtable<>();
        ht.put('I',1);
        ht.put('X',10);
        ht.put('C',100);
        ht.put('M',1000);
        ht.put('V',5);
        ht.put('L',50);
        ht.put('D',500);
        int intNum=0;
        int prev = 0;
        for(int i = num.length()-1; i>=0 ; i--) {
            int temp = ht.get(num.charAt(i));
            if(temp < prev)
                intNum-=temp;
            else
                intNum+=temp;
            prev = temp;
        }
        return intNum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        sc.nextLine();
        while(test-->0){
            String r = sc.nextLine();
            System.out.println(rtoi(r));
        }
    }
}
