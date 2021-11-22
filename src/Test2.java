import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Test2 {
    public static void main(String[] args) throws IOException {
        DataInputStream in = new DataInputStream(new FileInputStream("DATA.IN"));
        int[] arr = new int[10000];
        for (int i = 0; i < 100000; i++) {
            arr[in.readInt()]++;
        }
        for (int i = 0; i < 1000; i++) {
            if (arr[i] > 0){
                System.out.println(i + " " + arr[i]);
            }
        }
    }
}
