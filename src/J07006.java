import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class J07006 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream sc = new ObjectInputStream(new FileInputStream("DATA.in"));
        int[] arr = new int[1000];
        ArrayList<Integer> list = (ArrayList<Integer>) sc.readObject();
        for (Integer x : list){
            arr[x]++;
        }
        for (int i = 0; i < 1000; i++){
            if (arr[i] > 0) {
                System.out.println(i + " " + arr[i]);
            }
        }
    }
}