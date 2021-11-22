import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class J07007 {
    public static void main(String[] args) throws IOException {
        WordSet ws = new WordSet("VANBAN.in");
        System.out.println(ws);
    }
}
class WordSet{
    String file;

    public WordSet(String file) {
        this.file = file;

    }
    public String show() throws FileNotFoundException {
        FileInputStream path = new FileInputStream(file);
        Scanner sc = new Scanner(path);
        Map<String, Integer> m = new HashMap<>();
        while(sc.hasNextLine()){
            String line = sc.nextLine().toLowerCase();
            String []w = line.split("\\s+");
            for(String word : w){
                if(m.containsKey(word)){
                    m.put(word, m.get(word)+1);
                }
                else{
                    m.put(word, 1);
                }
            }

        }
        StringBuilder temp = new StringBuilder(" ");
        SortedSet<String> keys = new TreeSet<>(m.keySet());
        for (String key : keys) {
            temp.append(key).append("\n");
        }
        return temp.toString().trim();
    }
    public String toString(){
        try {
            return show();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(WordSet.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

}

