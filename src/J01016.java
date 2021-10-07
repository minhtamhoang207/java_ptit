import java.util.Scanner;

public class J01016 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        int four = 0;
        int seven = 0;
        for(int i=0; i<n.length(); i++){
            if(n.charAt(i) == '4'){
                four++;
            } else if(n.charAt(i) == '7'){
                seven++;
            }
        }
        if(four+seven == 4 || four+seven==7){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
