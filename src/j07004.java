import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class j07004 {
    public static void main(String[] args) {
        try{
            File myObj = new File("DATA.in");
            Scanner sc = new Scanner(myObj);
            HashMap<Integer, Integer> map = new HashMap<>();
            while (sc.hasNextLine()){
                String[] numbers = sc.nextLine().trim().split("\\s+");
                for(String n : numbers){
                    int temp = Integer.parseInt(n);
                    if(!map.containsKey(temp)){
                        map.put(temp, 1);
                    } else{
                        map.put(temp, map.get(temp)+1);
                    }
                }
            }
            for (Map.Entry<Integer,Integer> entry : map.entrySet()){
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
