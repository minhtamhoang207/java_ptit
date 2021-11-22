import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class J07002 {
    public static boolean isNumeric(String str) {
        if (str == null) {
            return false;
        }
        try {
            Integer.parseInt(str);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }
    public static void main(String[] args) throws FileNotFoundException{
        FileInputStream path = new FileInputStream("DATA.in");
        Scanner sc = new Scanner(path);
        long sum = 0;
        while(sc.hasNextLine()){
            String line = sc.nextLine();
            String []words = line.split("\\s+");
            for(String word : words){
                if (isNumeric(word)) {
                    sum += Integer.parseInt(word);
                }
            }
        }
        System.out.println(sum);
    }
}